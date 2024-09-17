package com.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/NewTransactionServlet")
public class NewTransactionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session == null || session.getAttribute("userType") == null
				|| !session.getAttribute("userType").equals("Customer")) {
			response.sendRedirect("login.jsp"); // Redirect to login if not logged in or not a customer
			return;
		}

		response.sendRedirect("newTransaction.jsp"); // Redirect to the JSP form to create a new transaction
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session == null || session.getAttribute("userType") == null
				|| !session.getAttribute("userType").equals("Customer")) {
			response.sendRedirect("login.jsp"); // Redirect to login if not logged in or not a customer
			return;
		}

		String email = (String) session.getAttribute("email");
		String transactionDetails = request.getParameter("transactionDetails");
		String amount = request.getParameter("amount");

		// Assuming connection to the database is established here
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			String sql = "INSERT INTO Transactions (user_email, transaction_details, amount) VALUES (?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);
			pstmt.setString(2, transactionDetails);
			pstmt.setString(3, amount);
			int rows = pstmt.executeUpdate();

			if (rows > 0) {
				response.sendRedirect("customerDashboard.jsp?success=true");
			} else {
				response.sendRedirect("newTransaction.jsp?error=true");
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("newTransaction.jsp?error=true");
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
