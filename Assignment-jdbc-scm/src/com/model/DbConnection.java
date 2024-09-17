package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
	private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/scm", "root", "Saad@2002");
			statement = connection.createStatement();
			System.out.println("Connection Success");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void getSuppliersDetails() {
		try {
			ResultSet dbSupplierData = statement.executeQuery("SELECT * FROM suppliers");
			while (dbSupplierData.next()) {
				System.out.println(dbSupplierData.getInt("Supplierid") + "\t" + dbSupplierData.getString("Name") + "\t"
						+ dbSupplierData.getString("ContactInfo") + "\t" + dbSupplierData.getString("Address"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void getProductDetails() {
		try {
			ResultSet dbProductData = statement.executeQuery("SELECT * FROM products");
			while (dbProductData.next()) {
				System.out.println(dbProductData.getInt("ProductID") + "\t" + dbProductData.getString("Name") + "\t"
						+ dbProductData.getString("Description") + "\t" + dbProductData.getInt("SupplierID"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void getOrderDetails() {
		try {
			ResultSet dbOrderData = statement.executeQuery("SELECT * FROM orders");
			while (dbOrderData.next()) {
				System.out.println(dbOrderData.getInt("OrderID") + "\t" + dbOrderData.getDate("OrderDate") + "\t"
						+ dbOrderData.getInt("SupplierID"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void getOrderDetailTableDetails() {
		try {
			ResultSet dbOrderDetailsData = statement.executeQuery("SELECT * FROM orderdetails");
			while (dbOrderDetailsData.next()) {
				System.out.println(dbOrderDetailsData.getInt("OrderDetailID") + "\t"
						+ dbOrderDetailsData.getInt("OrderID") + "\t" + dbOrderDetailsData.getInt("ProductID") + "\t"
						+ dbOrderDetailsData.getInt("Quantity") + "\t" + dbOrderDetailsData.getDouble("Price"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void getInventoryTableDetails() {
		try {
			ResultSet dbInventoryData = statement.executeQuery("SELECT * FROM inventory");
			while (dbInventoryData.next()) {
				System.out.println(dbInventoryData.getInt("InventoryID") + "\t" + dbInventoryData.getInt("ProductID")
						+ "\t" + dbInventoryData.getInt("QuantityOnHand"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
