package com.session.test;

import java.util.Scanner;

import com.session.exception.InsufficientBalanceException;
import com.session.model.Account;

public class AccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Account account = new Account(1001, "Yadullah", 7000);
		account.Menu();
		System.out.println("Enter choice: ");
		int choice = scanner.nextInt();
		while (choice != 4) {
			switch (choice) {
			case 1: {
				System.out.println(account.getBalance());
				break;
			}
			case 2: {
				System.out.println("Enter the amount to deposit: ");
				account.deposit(scanner.nextInt());
				break;
			}
			case 3: {
				System.out.println("Enter the amount to withdraw: ");
				try {
					account.withdraw(scanner.nextInt());
				} catch (InsufficientBalanceException exception) {
					System.out.println(exception.getMessage());
				}
				break;
			}
			case 4: {
				break;
			}
			}
			account.Menu();
			choice = scanner.nextInt();
		}
		System.out.println("Thank you for using the ATM. Visit Again!!! ");

	}
}
