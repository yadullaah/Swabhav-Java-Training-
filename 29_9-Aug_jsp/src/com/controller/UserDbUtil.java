package com.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDbUtil {
	private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "Saad@2002");
			statement = connection.createStatement(); 
			System.out.println("Connection Successful");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public ResultSet getAllUsers() {
		ResultSet dbusers = null;
		try {
			dbusers = statement.executeQuery("Select * from user");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dbusers;

	}

	public boolean validateCredentials(String username, String password) {
		ResultSet dbusers = getAllUsers();
		try {
			while (dbusers.next()) {
				if (dbusers.getString("username").equals(username))
					if (dbusers.getString("password").equals(password))
						return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
