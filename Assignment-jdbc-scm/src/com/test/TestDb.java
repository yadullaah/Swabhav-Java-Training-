package com.test;

import java.util.Scanner;

import com.model.DbConnection;

public class TestDb {
	public static void main(String[] args) {
		DbConnection connection = new DbConnection();
		
		Scanner scanner = new Scanner(System.in);
		int choice;

		while (true) {
			System.out.println();
			System.out.println("Choose an option:");
			System.out.println("1. View Suppliers");
			System.out.println("2. View Product");
			System.out.println("3. View Orders");
			System.out.println("4. View OrderDetails ");
			System.out.println("5. View Inventory");
			System.out.println("6. Exit");

			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();

			switch (choice) {
            case 1:
                System.out.println("Suppliers");
                connection.connectToDb();
                connection.getSuppliersDetails();
                break;
            case 2:
                System.out.println("Product");
                connection.connectToDb();
                connection.getProductDetails();
                break;
            case 3:
                System.out.println("Orders");
                connection.connectToDb();
                connection.getOrderDetails();
                break;
            case 4:
                System.out.println("OrderDetails");
                connection.connectToDb();
                connection.getOrderDetailTableDetails();
                break;
            case 5:
                System.out.println("Inventory");
                connection.connectToDb();
                connection.getInventoryTableDetails();
                break;
			case 6:
				System.out.println("Exit");
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}
}
