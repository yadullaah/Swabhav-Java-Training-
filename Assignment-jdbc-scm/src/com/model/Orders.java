package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Orders {

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
			ResultSet orders = statement.executeQuery("select * from orders");

			while (orders.next()) {
				System.out.println(orders.getInt(1) + " " + orders.getDate(2) + " " + orders.getInt(3));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertDetails() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter order id ");
			int orderID = scanner.nextInt();
			System.out.println("enter ORDERDATE");
			String date = scanner.next();
			System.out.println("enter supplierID");
			int supplierID = scanner.nextInt();

			preparedStatement = connection.prepareStatement("insert into orders values(?,?,?)");

			preparedStatement.setInt(1, orderID);
			preparedStatement.setString(2, date);
			preparedStatement.setInt(3, supplierID);

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}