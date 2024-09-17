package com.controllers;

import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Transaction;

@WebServlet("/ViewTransactionsServlet")
public class ViewTransactionsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		int userId = (int) session.getAttribute("userId");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "Saad@2002");

			String query = "SELECT t.transaction_id, t.account_id, a.account_number, t.type, t.amount "
					+ "FROM Transactions t " + "JOIN Accounts a ON t.account_id = a.account_id "
					+ "WHERE a.user_id = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, userId);
			ResultSet rs = stmt.executeQuery();

			List<Transaction> transactions = new ArrayList<>();
			while (rs.next()) {
				Transaction transaction = new Transaction(query, query, userId, userId);
				transaction.setTransactionId(rs.getInt("transaction_id"));
				transaction.setAccountId(rs.getInt("account_id"));
				transaction.setAccountNumber(rs.getString("account_number"));
				transaction.setType(rs.getString("type"));
				transaction.setAmount(rs.getBigDecimal("amount"));
				transactions.add(transaction);
			}

			request.setAttribute("transactions", transactions);
			request.getRequestDispatcher("viewTransactions.jsp").forward(request, response);

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("dashboard.jsp");
		}
	}
}
