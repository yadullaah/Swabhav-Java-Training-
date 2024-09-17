package com.test;

import java.util.Scanner;

import com.model.DbConnection;

public class TestDb {
	public static void main(String[] args) {
		DbConnection dbConnection = new DbConnection();
		dbConnection.connectToDb();

		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Choose Option: 1. View Employees "
					+ "2. Add Employee 3. Update Employee 4. Delete Employee 5. Exit");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				dbConnection.getEmployeeDetails();
				break;
			case 2:
				dbConnection.addEmployee();
				break;
			case 3:
				dbConnection.updateEmployee();
				break;
			case 4:
				dbConnection.deleteEmployee();
				break;
			case 5:
				System.out.println("Exit");
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			} System.out.println();
		}
	}
}
