package com.sessionmanagement;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String username = request.getParameter("username");

		HttpSession session = request.getSession();
		session.setAttribute("username", username);
		session.setMaxInactiveInterval(7 * 24 * 60 * 60);
		PrintWriter writer = response.getWriter();
		writer.print("<form action = 'PasswordController' method = 'post'> "
				+ "Password: <input type = 'password' name='password')>");
		writer.print("<input type = 'submit' value = 'ok'> </form>  ");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
