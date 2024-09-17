package com.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Transaction;

@WebServlet("/PassbookServlet")
public class PassbookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if (session == null || !"Customer".equals(session.getAttribute("role"))) {
			response.sendRedirect("login.jsp");
			return;
		}

		String email = (String) session.getAttribute("email");
		ArrayList<Transaction> transactions = new ArrayList<>();

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "Saad@2002");

			String sql = "SELECT date, transaction_type, amount, balance FROM Transactions WHERE email = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, email);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				transactions.add(new Transaction(rs.getString("date"), rs.getString("transaction_type"),
						rs.getDouble("amount"), rs.getDouble("balance")));
			}

			request.setAttribute("transactions", transactions);
			request.getRequestDispatcher("passbook.jsp").forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("customerDashboard.jsp?error=true");
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
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
