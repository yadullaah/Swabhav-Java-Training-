package com.controllers;

import java.io.IOException;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.CustomerDb;
import com.entity.Customer;

@WebServlet("/ViewCustomerController")
public class ViewCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDb customerDb = null;

	public ViewCustomerController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		customerDb = new CustomerDb();
		customerDb.connectToDb();

		List<Customer> customers = customerDb.getCustomers();
		System.out.println("Number of customers fetched: " + customers.size());

		request.setAttribute("customers", customers);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/ViewCustomers.jsp");
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
