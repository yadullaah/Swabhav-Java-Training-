package com.assigments;
import java.util.Scanner;
public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 1000;
		int option;
		do {
			System.out.println("ATM Menu:");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit Money");
			System.out.println("3. Withdraw Money");
			System.out.println("4. Exit");
			System.out.print("Please choose an option: ");
			option = sc.nextInt();
		switch (option) {
			case 1:
				System.out.println("Your current balance is : $" + balance);
				break;
			case 2:
				System.out.print("Enter amount to deposit : ");
				int deposit = sc.nextInt();
				balance = balance + deposit;
				System.out.println("After deposit your current balance is : $" + (balance));
				break;
			case 3:
				System.out.print("Enter amount to withdraw : ");

				int withdraw = sc.nextInt();
				if (withdraw > balance) {
					System.out.println("Insufficient Funds");
				} else {
					balance = balance - withdraw;
					System.out.println("After withdrawal your current balance is : $" + balance);
				}
				break;
			case 4:
				System.out.println("Thank you for using the ATM, Goodbye");
				return;
			default:
				System.out.println("Enter a valid response");
				break;
			}
			System.out.println("");

		} while (option != 4);

	}
}
