package com.controllers;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver"); // Ensure MySQL JDBC driver is loaded
        String url = "jdbc:mysql://localhost:3306/bankdb"; // Update with your database URL
        String username = "root"; // Update with your DB username
        String password = "Saad@2002"; // Update with your DB password
        return DriverManager.getConnection(url, username, password);
    }
}
