package com.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.AdminDb;
import com.model.CustomerDb;
import com.entity.Customer;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDb customerDb = null;
	private AdminDb adminDb = null;

	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = null;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession session = request.getSession();

		customerDb = new CustomerDb();
		adminDb = new AdminDb();
		customerDb.connectToDb();
		adminDb.connectToDb();
		if (adminDb.validateCredentials(username, password)) {
			System.out.println("Admin credentials valid.");
			// request.setAttribute("username", username);
			String adminFirstName = adminDb.getAdminFirstName(username);
			String adminLastName = adminDb.getAdminLastName(username);
			int adminID = adminDb.getAdminID(username);
			session.setAttribute("username", username);
			session.setAttribute("adminFirstName", adminFirstName);
			session.setAttribute("adminLastName", adminLastName);
			session.setAttribute("adminID", adminID);
			dispatcher = request.getRequestDispatcher("/AdminPortal.jsp");
		} else if (customerDb.validateCredentials(username, password)) {
			System.out.println("customer credentials valid.");
			// request.setAttribute("username", username);
			String customerFirstName = customerDb.getCustomerFirstName(username);
			String customerLastName = customerDb.getCustomerLastName(username);
			int customerID = customerDb.getCustomerID(username);
			session.setAttribute("username", username);
			session.setAttribute("customerFirstName", customerFirstName);
			session.setAttribute("customerLastName", customerLastName);
			session.setAttribute("customerID", customerID);

			dispatcher = request.getRequestDispatcher("/CustomerPortal.jsp");
		} else {
			dispatcher = request.getRequestDispatcher("/LoginFailed.jsp");
		}

		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
