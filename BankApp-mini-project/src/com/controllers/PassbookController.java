package com.controllers;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.TransactionDb;

@WebServlet("/PassbookController")
public class PassbookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PassbookController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		int customerID = (int) session.getAttribute("customerID");

		String transactionType = request.getParameter("transactionType");
		if (transactionType == null) {
			transactionType = "all";
		}

		TransactionDb dbTransactions = new TransactionDb();
		dbTransactions.connectToDb();
		ResultSet resultSet = null;
		List<String[]> transactionsList = new ArrayList<>();

		try {
			resultSet = dbTransactions.getTransactionsByCustomerIdAndType(customerID, transactionType);

			while (resultSet.next()) {
				String[] transaction = new String[6];
				transaction[0] = resultSet.getString("transactionID");
				transaction[1] = resultSet.getString("transactionAmount");
				transaction[2] = resultSet.getString("transactionDate");
				transaction[3] = resultSet.getString("transactionType");
				transaction[4] = resultSet.getString("senderAccountNumber");
				transaction[5] = resultSet.getString("receiverAccountNumber");
				transactionsList.add(transaction);
			}

			request.setAttribute("transactionsList", transactionsList);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Passbook.jsp");
			dispatcher.forward(request, response);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
