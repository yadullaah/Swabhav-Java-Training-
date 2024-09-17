package com.controllers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddCustomerServlet")
public class AddCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("addCustomer.jsp"); // Redirect to the JSP form to add a customer
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String customerName = request.getParameter("customerName");
		String customerEmail = request.getParameter("customerEmail");
		String customerPassword = request.getParameter("customerPassword");

		// Assuming connection to the database is established here
		Connection conn = null; // Get connection from your connection utility
		PreparedStatement pstmt = null;

		try {
			String sql = "INSERT INTO Users (username, email, password, user_type) VALUES (?, ?, ?, 'Customer')";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, customerName);
			pstmt.setString(2, customerEmail);
			pstmt.setString(3, customerPassword);
			int rows = pstmt.executeUpdate();

			if (rows > 0) {
				response.sendRedirect("adminDashboard.jsp?success=true");
			} else {
				response.sendRedirect("addCustomer.jsp?error=true");
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("addCustomer.jsp?error=true");
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
