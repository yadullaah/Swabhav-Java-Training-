package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import com.entity.Transaction;

public class TransactionDb {
	private Connection connection = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement;
	HttpSession session;

	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "Saad@2002");
			statement = connection.createStatement();
			System.out.println("Connection Success in Transaction");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public List<Transaction> getTransactions() {
		List<Transaction> transactions = new ArrayList<>();
		try {
			ResultSet dbTransaction = statement.executeQuery("SELECT * FROM transactions");
			while (dbTransaction.next()) {
				Transaction transaction = new Transaction(

						dbTransaction.getInt("transactionID"), dbTransaction.getInt("transactionAmount"),
						dbTransaction.getDate("transactionDate"), dbTransaction.getString("transactionType"),
						dbTransaction.getInt("senderAccountNumber"), dbTransaction.getInt("receiverAccountNumber"));
				transactions.add(transaction);
				// System.out.println("Fetched customer: " + customer.getCustomerID() + ", " +
				// customer.getCustomerFirstName());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return transactions;
	}

	public ResultSet getTransactionsByCustomerIdAndType(int customerID, String transactionType) {
		ResultSet resultSet = null;
		try {
			String query = "SELECT * FROM transactions WHERE customerAccountNumber = "
					+ "(SELECT accountNumber FROM accounts WHERE customerID = ?)";

			if (!transactionType.equals("all")) {
				query += " AND transactionType = ?";
			}

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, customerID);

			if (!transactionType.equals("all")) {
				preparedStatement.setString(2, transactionType);
			}

			resultSet = preparedStatement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultSet;
	}

	public ResultSet getTransactionsByCustomerId(int customerID) {
		ResultSet resultSet = null;
		try {
			String query = "SELECT * FROM transactions WHERE customerAccountNumber = (SELECT accountNumber FROM accounts WHERE customerID = ?)";

			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, customerID);
			resultSet = preparedStatement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultSet;
	}

	public boolean credit(int customerID, int amount) {
		try {
			String getAccountQuery = "SELECT accountNumber FROM accounts WHERE customerID = ?";
			preparedStatement = connection.prepareStatement(getAccountQuery);
			preparedStatement.setInt(1, customerID);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				int accountNumber = resultSet.getInt("accountNumber");

				String updateAccountQuery = "UPDATE accounts SET accountBalance = accountBalance + ? WHERE accountNumber = ?";
				preparedStatement = connection.prepareStatement(updateAccountQuery);
				preparedStatement.setInt(1, amount);
				preparedStatement.setInt(2, accountNumber);
				int rowsUpdated = preparedStatement.executeUpdate();

				if (rowsUpdated > 0) {
					String insertTransactionQuery = "INSERT INTO transactions (transactionAmount, transactionDate, transactionType, senderAccountNumber, receiverAccountNumber, customerAccountNumber) VALUES (?, CURDATE(), 'Credit', ?, ?, ?)";
					preparedStatement = connection.prepareStatement(insertTransactionQuery);
					preparedStatement.setInt(1, amount);
					preparedStatement.setInt(2, accountNumber);
					preparedStatement.setInt(3, accountNumber);
					preparedStatement.executeUpdate();

					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean debit(int customerId, int amount) {
		try {
			String getAccountQuery = "SELECT accountNumber, accountBalance FROM accounts WHERE customerID = ?";
			preparedStatement = connection.prepareStatement(getAccountQuery);
			preparedStatement.setInt(1, customerId);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				int accountNumber = resultSet.getInt("accountNumber");
				int accountBalance = resultSet.getInt("accountBalance");

				if (accountBalance - amount < 2000) {
					return false; // Insufficient balance
				}

				String updateAccountQuery = "UPDATE accounts SET accountBalance = accountBalance - ? WHERE accountNumber = ?";
				preparedStatement = connection.prepareStatement(updateAccountQuery);
				preparedStatement.setInt(1, amount);
				preparedStatement.setInt(2, accountNumber);
				int rowsUpdated = preparedStatement.executeUpdate();

				if (rowsUpdated > 0) {
					String insertTransactionQuery = "INSERT INTO transactions (transactionAmount, transactionDate, transactionType, senderAccountNumber, receiverAccountNumber, customerAccountNumber) VALUES (?, CURDATE(), 'Debit', ?, ?, ?)";
					preparedStatement = connection.prepareStatement(insertTransactionQuery);
					preparedStatement.setInt(1, amount);
					preparedStatement.setInt(2, accountNumber);
					preparedStatement.setInt(3, accountNumber);
					preparedStatement.executeUpdate();

					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean transfer(int customerID, String toAccountNumber, int amount) {
		try {
			String getSenderAccountQuery = "SELECT accountNumber, accountBalance FROM accounts WHERE customerID = ?";
			preparedStatement = connection.prepareStatement(getSenderAccountQuery);
			preparedStatement.setInt(1, customerID);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				int fromAccountNumber = resultSet.getInt("accountNumber");
				int accountBalance = resultSet.getInt("accountBalance");

				if (accountBalance - amount < 2000) {
					return false; // Insufficient balance
				}

				String getReceiverAccountQuery = "SELECT accountNumber FROM accounts WHERE accountNumber = ?";
				preparedStatement = connection.prepareStatement(getReceiverAccountQuery);
				preparedStatement.setString(1, toAccountNumber);
				ResultSet receiverResultSet = preparedStatement.executeQuery();

				if (receiverResultSet.next()) {
					int receiverAccountNumber = receiverResultSet.getInt("accountNumber");

					String updateSenderQuery = "UPDATE accounts SET accountBalance = accountBalance - ? WHERE accountNumber = ?";
					preparedStatement = connection.prepareStatement(updateSenderQuery);
					preparedStatement.setInt(1, amount);
					preparedStatement.setInt(2, fromAccountNumber);
					preparedStatement.executeUpdate();

					String updateReceiverQuery = "UPDATE accounts SET accountBalance = accountBalance + ? WHERE accountNumber = ?";
					preparedStatement = connection.prepareStatement(updateReceiverQuery);
					preparedStatement.setInt(1, amount);
					preparedStatement.setInt(2, receiverAccountNumber);
					preparedStatement.executeUpdate();

					String insertTransactionQuery = "INSERT INTO transactions (transactionAmount, transactionDate, transactionType, senderAccountNumber, receiverAccountNumber, customerAccountNumber) VALUES (?, CURDATE(), 'Transfer', ?, ?, ?)";
					preparedStatement = connection.prepareStatement(insertTransactionQuery);
					preparedStatement.setInt(1, amount);
					preparedStatement.setInt(2, fromAccountNumber);
					preparedStatement.setInt(3, receiverAccountNumber);
					preparedStatement.setInt(4, fromAccountNumber);
					preparedStatement.executeUpdate();

					return true;
				} else {
					return false; // Receiver account not found
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public void closeConnection() {
		try {
			if (preparedStatement != null)
				preparedStatement.close();
			if (statement != null)
				statement.close();
			if (connection != null)
				connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
