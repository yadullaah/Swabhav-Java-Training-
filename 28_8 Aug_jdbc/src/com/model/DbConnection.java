package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DbConnection {

	private Connection connection = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;

	public void connectToDb() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student1", "root", "Saad@2002");
			statement = connection.createStatement();
			System.out.println("Connection Successfull");

		} catch (SQLException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

	}

	public void getStudentDetails() {

		try {
			ResultSet dbStudentsData = statement.executeQuery("select * from students");

			while (dbStudentsData.next()) {
				System.out.println(dbStudentsData.getInt(1) + "\t" + dbStudentsData.getString(2) + "\t"
						+ dbStudentsData.getInt(3) + "\t" + dbStudentsData.getDouble(4));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void addStudent() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Roll number");
		int rollnumber = scanner.nextInt();
		System.out.println("Enter name");
		String name = scanner.next();
		System.out.println("Enter age");
		int age = scanner.nextInt();
		System.out.println("Enter percentage");
		double percentage = scanner.nextDouble();

		try {
			 statement.executeUpdate ("insert into students values (" + rollnumber + ",'" + name + "'," + age + "," + percentage + ")");

//			preparedStatement = connection.prepareStatement("insert into students values(?,?,?,?)");
//			preparedStatement.setInt(1, rollnumber);
//			preparedStatement.setString(2, name);
//			preparedStatement.setInt(3, age);
//			preparedStatement.setDouble(4, percentage);
//			preparedStatement.executeUpdate();

			System.out.println("Record added successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	

	public void updateStudent() {
		 Scanner scanner = new Scanner(System.in);
		    System.out.println("Enter Roll number of the student to update:");
		    int rollNumber = scanner.nextInt();
		    System.out.println("Enter new name:");
		    String newName = scanner.next();
		    System.out.println("Enter new age:");
		    int newAge = scanner.nextInt();
		    System.out.println("Enter new percentage:");
		    double newPercentage = scanner.nextDouble();

		    try {
		        String updateQuery = "UPDATE students SET name = ?, age = ?, percentage = ? WHERE roll_number = ?";
		        preparedStatement = connection.prepareStatement(updateQuery);
		        preparedStatement.setString(1, newName);
		        preparedStatement.setInt(2, newAge);
		        preparedStatement.setDouble(3, newPercentage);
		        preparedStatement.setInt(4, rollNumber);

		        int rowsUpdated = preparedStatement.executeUpdate();

		        if (rowsUpdated > 0) {
		            System.out.println("Record updated successfully.");
		        } else {
		            System.out.println("No student found with the provided roll number.");
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }		
	}
	



}
