package com.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.AccountDb;
import com.model.CustomerDb;

@WebServlet("/GenerateAccountNumberController")
public class GenerateAccountNumberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDb customerDb = null;

	public GenerateAccountNumberController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// String customerID = request.getParameter("customerID");
		HttpSession session = request.getSession();
		int customerID = (int) session.getAttribute("customerID");
		System.out.println(customerID);
		AccountDb accountDb = new AccountDb();
		accountDb.connectToDb();

		int accountNumber = accountDb.generateAccountNumber();
		try {
			accountDb.addNewAccount(accountNumber, customerID);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		System.out.println("Data added successfully");
		RequestDispatcher rd = request.getRequestDispatcher("AdminPortal.jsp");
		rd.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
