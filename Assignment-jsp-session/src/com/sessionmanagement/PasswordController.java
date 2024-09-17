package com.sessionmanagement;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/PasswordController")
public class PasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PasswordController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		String password = request.getParameter("password");
		response.getWriter().print("Username: " + username);
		response.getWriter().println("<br>Password: " + password);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
