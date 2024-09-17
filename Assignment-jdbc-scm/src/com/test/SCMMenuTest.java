package com.test;

import com.model.*;
import java.util.Scanner;

public class SCMMenuTest {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Supply Chain Management :");

		while (true) {
			System.out.println("Select table to work on ");
			System.out.println("1.Suppliers 2.orders 3.orderDetails 4. products 5.inventory");

			int table = scanner.nextInt();
			int choice = 0;
			switch (table) {
			case 1:
				Suppliers supplier = new Suppliers();
				supplier.getConnection();

				while (choice != 3) {
					System.out.println("1.See data 2.Add data 3.exit");
					choice = scanner.nextInt();
					switch (choice) {
					case 1:
						supplier.displayDetails();
						break;
					case 2:
						supplier.insertDetails();
						break;
					case 3:
						break;
					default:
						System.out.println("enter valid input ");
					}
				}

			case 2:
				Orders orders = new Orders();
				orders.getConnection();

				while (choice != 3) {
					System.out.println("1.See data 2.Add data 3.exit");
					choice = scanner.nextInt();
					switch (choice) {
					case 1:
						orders.displayDetails();
						break;
					case 2:
						orders.insertDetails();
						break;
					case 3:
						break;
					default:
						System.out.println("enter valid input ");
					}
				}

			case 3:
				OrderDetails order = new OrderDetails();
				order.getConnection();

				while (choice != 3) {
					System.out.println("1.See data 2.Add data 3.exit");
					choice = scanner.nextInt();
					switch (choice) {
					case 1:
						order.displayDetails();
						break;
					case 2:
						order.insertDetails();
						break;
					case 3:
						break;
					default:
						System.out.println("enter valid input ");
					}
				}

			case 4:
				Products product = new Products();
				product.getConnection();

				while (choice != 3) {
					System.out.println("1.See data 2.Add data 3.exit");
					choice = scanner.nextInt();
					switch (choice) {
					case 1:
						product.displayDetails();
						break;
					case 2:
						product.insertDetails();
						break;
					case 3:
						break;
					default:
						System.out.println("enter valid input ");
					}
				}

			case 5:
				Inventory inventory = new Inventory();
				inventory.getConnection();

				while (choice != 3) {
					System.out.println("1.See data 2.Add data 3.exit");
					choice = scanner.nextInt();
					switch (choice) {
					case 1:
						inventory.displayDetails();
						break;
					case 2:
						inventory.insertDetails();
						break;
					case 3:
						break;
					default:
						System.out.println("enter valid input ");
					}
				}

			}

		}

	}
}