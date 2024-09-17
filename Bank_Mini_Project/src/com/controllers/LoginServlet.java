package com.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String role = request.getParameter("role");

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish the connection (replace with your database credentials)
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "Saad@2002");
            
            // Prepare the SQL query
            String sql = "SELECT * FROM Users WHERE email = ? AND password = ? AND role = ?";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            pstmt.setString(3, role);

            // Execute the query
            rs = pstmt.executeQuery();

            // Check if user exists
            if (rs.next()) {
                HttpSession session = request.getSession();
                session.setAttribute("email", email);
                session.setAttribute("role", role);

                if ("Admin".equals(role)) {
                    response.sendRedirect("adminDashboard.jsp");
                } else {
                    response.sendRedirect("customerDashboard.jsp");
                }
            } else {
                response.sendRedirect("login.jsp?loginError=true");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("login.jsp?loginError=true");
        } finally {
            // Close resources
            try { if (rs != null) rs.close(); } 
            catch (Exception e) 
            { e.printStackTrace(); }
            try { if (pstmt != null) pstmt.close(); } 
            catch (Exception e) 
            { e.printStackTrace(); }
            try { if (conn != null) 
            	conn.close(); } 
            catch (Exception e) 
            { e.printStackTrace(); }
        }
    }
}
