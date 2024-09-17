package com.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.CustomerDb;

@WebServlet("/AddNewCustomerController")
public class AddNewCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDb customerDb = null;

	public AddNewCustomerController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = null;

		int customerID = Integer.parseInt(request.getParameter("customerID"));
		String customerFirstName = request.getParameter("customerFirstName");
		String customerLastName = request.getParameter("customerLastName");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		customerDb = new CustomerDb();
		customerDb.connectToDb();
		customerDb.addCustomer(customerID, customerFirstName, customerLastName, username, password);
		System.out.println("Customer ID: " + customerID);
		System.out.println("First Name: " + customerFirstName);
		System.out.println("Last Name: " + customerLastName);
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);

		request.setAttribute("customerID", customerID);
		request.setAttribute("customerFirstName", customerFirstName);
		request.setAttribute("customerLastName", customerLastName);
		request.setAttribute("username", username);
		request.setAttribute("password", password);
		System.out.println("data added");
		dispatcher = request.getRequestDispatcher("/AdminPortal.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
