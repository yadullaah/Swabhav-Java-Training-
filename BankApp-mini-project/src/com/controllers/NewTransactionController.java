package com.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.TransactionDb;

@WebServlet("/NewTransactionController")
public class NewTransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public NewTransactionController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);

		if (session != null) {

			int customerID = (int) session.getAttribute("customerID");

			if (customerID != 0) {

				String transactionType = request.getParameter("transactionType");
				int amount = Integer.parseInt(request.getParameter("amount"));
				String toAccountNumber = request.getParameter("toAccountNumber");

				TransactionDb transactionsDb = new TransactionDb();
				transactionsDb.connectToDb();

				boolean success = false;

				if ("credit".equals(transactionType)) {
					success = transactionsDb.credit(customerID, amount);
				} else if ("debit".equals(transactionType)) {
					success = transactionsDb.debit(customerID, amount);
				} else if ("transfer".equals(transactionType) && toAccountNumber != null) {
					success = transactionsDb.transfer(customerID, toAccountNumber, amount);
				}

				transactionsDb.closeConnection();

				if (success) {

					response.sendRedirect("success.jsp");
				} else {

					response.sendRedirect("TransactionError.jsp");
				}
			} else {

				response.sendRedirect("Error.jsp");
			}
		} else {

			response.sendRedirect("error2.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}
}
