package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.entity.Admin;

public class AdminDb {
	private Connection connection = null;
	private Statement statement = null;

	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "Saad@2002");
			statement = connection.createStatement();
			System.out.println("Connection Success in Admin");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public String getAdminFirstName(String username) {
		String adminFirstName = null;
		try {
			PreparedStatement pst = connection.prepareStatement("SELECT adminFirstName FROM admins WHERE username = ?");
			pst.setString(1, username);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				adminFirstName = rs.getString("adminFirstName");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return adminFirstName;
	}

	public String getAdminLastName(String username) {
		String adminLastName = null;
		try {
			PreparedStatement pst = connection.prepareStatement("SELECT adminLastName FROM admins WHERE username = ?");
			pst.setString(1, username);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				adminLastName = rs.getString("adminLastName");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return adminLastName;
	}

	public int getAdminID(String username) {
		int adminID = 0;
		try {
			PreparedStatement pst = connection.prepareStatement("SELECT adminID FROM admins WHERE username = ?");
			pst.setString(1, username);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				adminID = rs.getInt("customerID");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return adminID;
	}

	public ResultSet getAllAdmins() {
		ResultSet dbAdmins = null;

		try {
			dbAdmins = statement.executeQuery("select * from admins");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dbAdmins;
	}

	public List<Admin> getAdmins() {
		ResultSet dbAdmins = null;
		List<Admin> admins = new ArrayList<Admin>();
		try {
			dbAdmins = statement.executeQuery("select * from admins");
			while (dbAdmins.next()) {
				admins.add(new Admin(dbAdmins.getInt(1), dbAdmins.getString(2), dbAdmins.getString(3),
						dbAdmins.getString(4), dbAdmins.getString(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return admins;

	}

	public boolean validateCredentials(String username, String password) {
		ResultSet dbAdmins = getAllAdmins();
		try {
			while (dbAdmins.next()) {
				if (dbAdmins.getString("username").equals(username) && dbAdmins.getString("password").equals(password))
					return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}
