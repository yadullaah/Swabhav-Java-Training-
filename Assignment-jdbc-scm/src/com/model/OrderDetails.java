package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OrderDetails {

	Connection connection = null;
	Statement statement = null;
	PreparedStatement preparedStatement = null;

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
			ResultSet orderDetails = statement.executeQuery("select * from orderdetails");

			while (orderDetails.next()) {
				System.out.println(orderDetails.getInt(1) + " \t" + orderDetails.getInt(2) + "\t "
						+ orderDetails.getInt(3) + " \t" + orderDetails.getInt(4) + "\t" + orderDetails.getInt(5));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertDetails() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter orderDetails id ");
			int orderDetailsID = scanner.nextInt();
			System.out.println("enter order id ");
			int orderID = scanner.nextInt();
			System.out.println("enter product id ");
			int productID = scanner.nextInt();
			System.out.println("enter Quantity ");
			int quantity = scanner.nextInt();
			System.out.println("enter price ");
			int price = scanner.nextInt();

			preparedStatement = connection.prepareStatement("insert into orderdetails values(?,?,?,?,?)");

			preparedStatement.setInt(1, orderDetailsID);
			preparedStatement.setInt(2, orderID);
			preparedStatement.setInt(3, productID);
			preparedStatement.setInt(4, quantity);
			preparedStatement.setInt(5, price);

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}