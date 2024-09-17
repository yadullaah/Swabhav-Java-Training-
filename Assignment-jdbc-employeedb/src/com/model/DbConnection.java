package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DbConnection {

	private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;

	public void connectToDb() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/emplyeedb", "root", "Saad@2002");
			System.out.println("Connection Successful");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void getEmployeeDetails() {
		try {

			preparedStatement = connection.prepareStatement("SELECT * FROM employee");
			resultSet = preparedStatement.executeQuery();

			System.out.println("EmpID\tName\tSalary");
			while (resultSet.next()) {
				System.out.println(resultSet.getInt("empid") + "\t" + resultSet.getString("name") + "\t"
						+ resultSet.getDouble("salary"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void addEmployee() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee ID:");
		int empid = scanner.nextInt();
		System.out.println("Enter Name:");
		String name = scanner.next();
		System.out.println("Enter Salary:");
		double salary = scanner.nextDouble();

		try {

			preparedStatement = connection.prepareStatement("INSERT INTO employee VALUES (?, ?, ?)");
			preparedStatement.setInt(1, empid);
			preparedStatement.setString(2, name);
			preparedStatement.setDouble(3, salary);

			preparedStatement.executeUpdate();

			System.out.println("Employee added successfully.");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateEmployee() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee ID to update:");
		int empid = scanner.nextInt();
		System.out.println("Enter new Name:");
		String newName = scanner.next();
		System.out.println("Enter new Salary:");
		double newSalary = scanner.nextDouble();

		try {

			preparedStatement = connection
					.prepareStatement("UPDATE employee SET name = ?, " + "salary = ? WHERE empid = ?");
			preparedStatement.setString(1, newName);
			preparedStatement.setDouble(2, newSalary);
			preparedStatement.setInt(3, empid);

			preparedStatement.executeUpdate();

			System.out.println("Employee updated successfully.");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void deleteEmployee() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee ID to delete:");
		int empid = scanner.nextInt();

		try {
			preparedStatement = connection.prepareStatement("DELETE FROM employee WHERE empid = ?");
			preparedStatement.setInt(1, empid);

			preparedStatement.executeUpdate();

			System.out.println("Employee deleted successfully.");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}