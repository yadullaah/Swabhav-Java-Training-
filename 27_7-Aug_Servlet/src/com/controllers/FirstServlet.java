package com.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {

	public FirstServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter writer = response.getWriter();

		// int number1 = Integer.parseInt(request.getParameter("number1"));
		//
		// int number2 = Integer.parseInt(request.getParameter("number2"));
		//
		// int result = number1+number2;
		//
		// writer.print("Additions is </b>"+result+"</b>");

		// writer.print("<b>Welcome to Web World </b>");

		// response.getWriter().append("Served at: ").append(request.getContextPath());

		String[] selectedColors = request.getParameterValues("color");

		//writer.println("<html><body>");
		writer.println("<h3>Selected Colors:</h3>");

		for (String value : selectedColors) {
			writer.print("<p>" + value + "</p>");
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
