package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Suppliers {

	Connection connection = null;
	Statement statement = null;
	PreparedStatement preparedStatement;

	public void getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/scm", "root", "Saad@2002");
			System.out.println("Connected Successfully.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void displayDetails() {
		try {
			statement = connection.createStatement();
			ResultSet suppliers = statement.executeQuery("select * from suppliers");

			while (suppliers.next()) {
				System.out.println(suppliers.getInt(1) + " " + suppliers.getString(2) + " " + suppliers.getString(3)
						+ " " + suppliers.getString(4));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertDetails() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter supplier id ");
			int supplierID = scanner.nextInt();
			System.out.println("enter name");
			String name = scanner.next();
			System.out.println("enter contactInfo");
			String contactInfo = scanner.next();
			System.out.println("enter address");
			String address = scanner.next();

			preparedStatement = connection.prepareStatement("insert into suppliers values(?,?,?,?)");

			preparedStatement.setInt(1, supplierID);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, contactInfo);
			preparedStatement.setString(4, address);

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}