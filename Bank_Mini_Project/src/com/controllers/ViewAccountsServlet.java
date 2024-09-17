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

import com.model.Account;

@WebServlet("/ViewAccountsServlet")
public class ViewAccountsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		int userId = (int) session.getAttribute("userId");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "Saad@2002");

			String query = "SELECT * FROM Accounts WHERE user_id = ?";
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1, userId);
			ResultSet rs = stmt.executeQuery();

			List<Account> accounts = new ArrayList<>();
			while (rs.next()) {
				Account account = new Account();
				account.setAccountId(rs.getInt("account_id"));
				account.setUserId(rs.getInt("user_id"));
				account.setAccountNumber(rs.getString("account_number"));
				account.setBalance(rs.getBigDecimal("balance"));
				account.setAccountType(rs.getString("account_type"));
				accounts.add(account);
			}

			request.setAttribute("accounts", accounts);
			request.getRequestDispatcher("viewAccounts.jsp").forward(request, response);

			con.close();

		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("dashboard.jsp");
		}
	}
}
