package com.controllers;

import java.io.IOException;
import com.entity.User;
import com.model.UserDbUtil;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDbUtil userDbUtil = null;

	public LoginController() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = null;
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// request.setAttribute("username", username);

		userDbUtil = new UserDbUtil();
		userDbUtil.connectToDb();

		// if (username.equals("yadullah") && password.equals("123456"))
		// dispatcher = request.getRequestDispatcher("/Login Success.jsp");
		// else
		// dispatcher = request.getRequestDispatcher("/Login Failed.jsp");

		if (userDbUtil.validateCredentials(username, password)) {
			request.setAttribute("username", username);
			dispatcher = request.getRequestDispatcher("/Login Success.jsp");

		} else {
			dispatcher = request.getRequestDispatcher("/Login Failed.jsp");
		}

		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
