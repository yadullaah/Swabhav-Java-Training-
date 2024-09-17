package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Inventory {

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
			ResultSet inventory = statement.executeQuery("select * from inventory");

			while (inventory.next()) {
				System.out.println(inventory.getInt(1) + " \t" + inventory.getInt(2) + "\t " + inventory.getInt(3));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertDetails() {
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter inventory id ");
			int inventoryID = scanner.nextInt();
			System.out.println("enter productID");
			int productID = scanner.nextInt();
			System.out.println("enter Quantity hand on");
			int quantity = scanner.nextInt();

			preparedStatement = connection.prepareStatement("insert into inventory values(?,?,?)");

			preparedStatement.setInt(1, inventoryID);
			preparedStatement.setInt(2, productID);
			preparedStatement.setInt(3, quantity);

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}