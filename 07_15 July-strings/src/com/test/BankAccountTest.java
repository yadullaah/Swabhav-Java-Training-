package com.test;

import java.util.Scanner;
import com.model.*;

public class BankAccountTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BankAccountModel BankAccount1 = new BankAccountModel();
		BankAccountModel BankAccount2 = new BankAccountModel();

		BankAccount1.setName("Raju");
		BankAccount2.setName("Ramu");
		
		BankAccount1.setBalance(1000);
		BankAccount2.setBalance(3000);

		System.out.println("Select your Name: ");
		System.out.println("1." + BankAccount1.getName());
		System.out.println("2." + BankAccount2.getName());
		int nameChoice = sc.nextInt();
		if (nameChoice == 1) {
			BankAccount1.Menu();
			int choice = sc.nextInt();
			
			while (choice != 4) {

				switch (choice) {
				case 1: {
					System.out.println(BankAccount1.getBalance());
					break;
				}
				case 2: {
					System.out.println("Enter the amount to deposit: ");
					BankAccount1.amountDeposit(sc.nextInt());
					break;
				}
				case 3: {
					System.out.println("Enter the amount to withdraw: ");
					BankAccount1.amountWithdraw(sc.nextInt());
					break;
				}
				case 4: {

					break;
				}
				}
				BankAccount1.Menu();
				choice = sc.nextInt();
			}
			System.out.println("Thank you for using the ATM. Visit Again!!! ");
		}

		else if (nameChoice == 2) {
			BankAccount2.Menu();
			int choice = sc.nextInt();
			while (choice != 4) {
				switch (choice) {
				case 1: {
					System.out.println(BankAccount2.getBalance());
					break;
				}
				case 2: {
					System.out.println("Enter the amount to deposit: ");
					BankAccount2.amountDeposit(sc.nextInt());
					break;
				}
				case 3: {
					System.out.println("Enter the amount to withdraw: ");
					BankAccount2.amountWithdraw(sc.nextInt());
					break;
				}
				case 4: {
					break;
				}
				}
				BankAccount2.Menu();
				choice = sc.nextInt();
			}
			System.out.println("Thank you for using the ATM. Visit Again!!! ");

		} else {
			System.out.println("Enter Valid Choice");
		}

	}
}
