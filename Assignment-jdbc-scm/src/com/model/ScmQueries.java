package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ScmQueries {

	Connection connection = null;
	Statement statement = null;
	PreparedStatement preparedStatement;

	public void getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/scm", "root", "Saad@2002");
			System.out.println("Connected Successfully.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 1. List all products along with their supplier names
	public void Query1() {
		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(
					"SELECT p.Name, s.Name AS SupplierName FROM products p LEFT JOIN suppliers s ON p.SupplierID = s.SupplierID");
			System.out.println("List all products along with their supplier names:");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2));
			}
			System.out.println("Success!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 2. Get all orders with their details (including product names and quantities)
	public void Query2() {
		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(
					"SELECT o.OrderID, o.OrderDate, od.OrderDetailID, p.Name, od.Quantity " +
					"FROM orders o " +
					"JOIN orderdetails od ON o.OrderID = od.OrderID " +
					"JOIN products p ON od.ProductID = p.ProductID " +
					"ORDER BY o.OrderID");
			System.out.println("Get all orders with their details (including product names and quantities):");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getDate(2) + "\t" + rs.getInt(3) + "\t" + rs.getString(4) + "\t" + rs.getInt(5));
			}
			System.out.println("Success!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 3. Find all suppliers who have supplied a specific product (e.g., ProductID = 1)
	public void Query3() {
		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(
					"SELECT s.SupplierID, s.Name AS SupplierName, COUNT(p.ProductID) AS NoOfProducts " +
					"FROM suppliers s " +
					"JOIN products p ON s.SupplierID = p.SupplierID " +
					"WHERE p.ProductID = 1 " +
					"GROUP BY s.SupplierID");
			System.out.println("Find all suppliers who have supplied a specific product (e.g., ProductID = 1):");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getInt(3));
			}
			System.out.println("Success!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 4. List all products and their current inventory levels
	public void Query4() {
		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(
					"SELECT p.Name, i.QuantityOnHand " +
					"FROM products p " +
					"LEFT JOIN inventory i ON p.ProductID = i.ProductID");
			System.out.println("List all products and their current inventory levels:");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getInt(2));
			}
			System.out.println("Success!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 5. Find all orders placed within the last month
	public void Query5() {
		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(
					"SELECT * FROM orders WHERE OrderDate > NOW() - INTERVAL 1 MONTH");
			System.out.println("Find all orders placed within the last month:");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getDate(2) + "\t" + rs.getInt(3));
			}
			System.out.println("Success!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 6. Get total quantity ordered for each product
	public void Query6() {
		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(
					"SELECT p.Name, SUM(od.Quantity) AS TotalQuantity " +
					"FROM products p " +
					"LEFT JOIN orderdetails od ON p.ProductID = od.ProductID " +
					"GROUP BY p.Name");
			System.out.println("Get total quantity ordered for each product:");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getInt(2));
			}
			System.out.println("Success!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 7. Retrieve all orders along with the total amount spent for each order
	public void Query7() {
		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(
					"SELECT o.OrderID, o.OrderDate, SUM(od.Price * od.Quantity) AS TotalAmount " +
					"FROM orders o " +
					"JOIN orderdetails od ON o.OrderID = od.OrderID " +
					"GROUP BY o.OrderID");
			System.out.println("Retrieve all orders along with the total amount spent for each order:");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getDate(2) + "\t" + rs.getDouble(3));
			}
			System.out.println("Success!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 8. Find products supplied by more than one supplier
	public void Query8() {
		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(
					"SELECT p.Name, COUNT(p.SupplierID) AS NoOfSuppliers " +
					"FROM products p " +
					"JOIN suppliers s ON p.SupplierID = s.SupplierID " +
					"GROUP BY p.Name " +
					"HAVING NoOfSuppliers > 1");
			System.out.println("Find products supplied by more than one supplier:");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getInt(2));
			}
			System.out.println("Success!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 9. Get the average inventory level for each product
	public void Query9() {
		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(
					"SELECT p.Name, AVG(i.QuantityOnHand) AS AverageInventoryLevel " +
					"FROM inventory i " +
					"LEFT JOIN products p ON i.ProductID = p.ProductID " +
					"GROUP BY p.ProductID");
			System.out.println("Get the average inventory level for each product:");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getDouble(2));
			}
			System.out.println("Success!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 10. List suppliers who have not supplied any products
	public void Query10() {
		try {
			statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(
					"SELECT s.SupplierID, s.Name FROM suppliers s " +
					"LEFT JOIN products p ON s.SupplierID = p.SupplierID " +
					"WHERE p.ProductID IS NULL");
			System.out.println("List suppliers who have not supplied any products:");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
			}
			System.out.println("Success!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
