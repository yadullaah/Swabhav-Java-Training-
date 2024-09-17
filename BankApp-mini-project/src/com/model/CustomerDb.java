package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.entity.Customer;

public class CustomerDb {
	private Connection connection = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement;

	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "Saad@2002");
			statement = connection.createStatement();
			System.out.println("Connection Success in Customer");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public String getCustomerFirstName(String username) {
		String customerFirstName = null;
		try {
			PreparedStatement pst = connection
					.prepareStatement("SELECT customerFirstName FROM customers WHERE username = ?");
			pst.setString(1, username);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				customerFirstName = rs.getString("customerFirstName");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customerFirstName;
	}

	public String getCustomerLastName(String username) {
		String customerLastName = null;
		try {
			PreparedStatement pst = connection
					.prepareStatement("SELECT customerLastName FROM customers WHERE username = ?");
			pst.setString(1, username);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				customerLastName = rs.getString("customerLastName");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customerLastName;
	}

	public int getCustomerID(String username) {
		int customerID = 0;
		try {
			PreparedStatement pst = connection.prepareStatement("SELECT customerID FROM customers WHERE username = ?");
			pst.setString(1, username);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				customerID = rs.getInt("customerID");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customerID;
	}

	public ResultSet getAllCustomers() {
		ResultSet dbCustomers = null;

		try {
			dbCustomers = statement.executeQuery("select * from customers");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dbCustomers;
	}

	public List<Customer> getCustomers() {
		List<Customer> customers = new ArrayList<>();
		try {
			System.out.println("Executing query to fetch customers...");
			ResultSet dbCustomers = statement.executeQuery("SELECT * FROM customers");
			while (dbCustomers.next()) {
				Customer customer = new Customer(dbCustomers.getInt("customerID"),
						dbCustomers.getString("customerFirstName"), dbCustomers.getString("customerLastName"),
						dbCustomers.getString("username"), dbCustomers.getString("password"));
				customers.add(customer);
				System.out.println(
						"Fetched customer: " + customer.getCustomerID() + ", " + customer.getCustomerFirstName());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customers;
	}

	// ================================================
	/*
	 * public void getCustomerDetails() { try { ResultSet dbCustomerData =
	 * statement.executeQuery("select * from customers"); while
	 * (dbCustomerData.next()) { System.out.println(dbCustomerData.getInt(1) + "\t"
	 * + dbCustomerData.getString(2) + "\t" + dbCustomerData.getDouble("salary")); }
	 * } catch (SQLException e) { e.printStackTrace(); }
	 * 
	 * }
	 */

	// ============================================
	// public List<Customer> getCustomers() {
	// ResultSet dbCustomers = null;
	// List<Customer> customers = new ArrayList<Customer>();
	// try {
	// dbCustomers = statement.executeQuery("select * from customers");
	// while (dbCustomers.next()) {
	// customers.add(new Customer(dbCustomers.getInt(1), dbCustomers.getString(2),
	// dbCustomers.getString(3),
	// dbCustomers.getString(4), dbCustomers.getString(5)));
	// }
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// return customers;
	//
	// }

	public boolean validateCredentials(String username, String password) {
		ResultSet dbCustomers = getAllCustomers();
		try {
			while (dbCustomers.next()) {
				if (dbCustomers.getString("username").equals(username)
						&& dbCustomers.getString("password").equals(password))
					return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public void addCustomer(int customerID, String customerFirstName, String customerLastName, String username,
			String password) {
		try {
			// ? are parameters
			preparedStatement = connection.prepareStatement("insert into customers values(?,?,?,?,?)");
			preparedStatement.setInt(1, customerID);
			preparedStatement.setString(2, customerFirstName);
			preparedStatement.setString(3, customerLastName);
			preparedStatement.setString(4, username);
			preparedStatement.setString(5, password);
			preparedStatement.executeUpdate();
			System.out.println("Record Added");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// public void searchCustomerById(int customerID) {
	// try {
	// preparedStatement = connection.prepareStatement("select * from customers
	// where customerID = ?");
	// preparedStatement.setInt(1, customerID);
	// preparedStatement.executeQuery();
	//
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// }
	// }

	public ResultSet searchCustomerById(int customerID) {
		ResultSet rs = null;
		try {
			preparedStatement = connection.prepareStatement("SELECT * FROM customers WHERE customerID = ?");
			preparedStatement.setInt(1, customerID);
			System.out.println("Executing query: SELECT * FROM customers WHERE customerID = " + customerID);
			rs = preparedStatement.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
}
