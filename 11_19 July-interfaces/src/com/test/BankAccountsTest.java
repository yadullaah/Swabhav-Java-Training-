package com.test;

import java.util.Scanner;

import com.assignment.CurrentBankAccount;
import com.assignment.SavingBankAccount;

public class BankAccountsTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Bank Service Portal");
		System.out.println("Select the Account Type: ");
		System.out.println("ATM Menu:\r\n" + "1. Saving\r\n" + "2. Current\r\n" + "3. Exit");

		System.out.println("Input the values from the numbers: ");
		int userInput = scanner.nextInt();
		if (userInput == 1) {
			SavingBankAccount savingAccounts1 = new SavingBankAccount(123456, "Suhas", 450000, 2000);
			System.out.println("Your Account Details : \n" + savingAccounts1);
			savingAccounts1.Menu();
			int choice = scanner.nextInt();
			savingAccounts1.savingChoice = choice;
			while (savingAccounts1.savingChoice != 4) {
				switch (savingAccounts1.savingChoice) {
				case 1: {
					System.out.println(savingAccounts1.getBalance());
					break;
				}
				case 2: {
					System.out.println("Enter the amount to deposit: ");
					savingAccounts1.deposit(scanner.nextInt());
					break;
				}
				case 3: {
					System.out.println("Enter the amount to withdraw: ");
					savingAccounts1.savingMinBalanceChecker(scanner.nextInt());
					break;
				}
				case 4: {
					break;
				}
				}
				savingAccounts1.Menu();
//				savingAccounts1.savingChoice = 0;
				savingAccounts1.savingChoice = scanner.nextInt();
			}
			System.out.println("Thank you for using the ATM. Visit Again!!! ");

		}else if(userInput == 2) {
			CurrentBankAccount currentAccounts1 = new CurrentBankAccount(23131, "Swabhav", 3000000, 15000);
			System.out.println("Your Account Details : \n" + currentAccounts1);
			currentAccounts1.Menu();
			int choice = scanner.nextInt();
			currentAccounts1.currentChoice = choice;
			while (currentAccounts1.currentChoice != 4) {
				switch (currentAccounts1.currentChoice) {
				case 1: {
					System.out.println(currentAccounts1.getBalance());
					break;
				}
				case 2: {
					System.out.println("Enter the amount to deposit: ");
					currentAccounts1.deposit(scanner.nextInt());
					break;
				}
				case 3: {
					System.out.println("Enter the amount to withdraw: ");
					int currentWithdraw = scanner.nextInt();
//					currentAccounts1.withdraw(currentWithdraw);
					currentAccounts1.overDraftAmount(currentWithdraw);
					break;
				}
				case 4: {
					break;
				}
				}
				currentAccounts1.Menu();
//				savingAccounts1.savingChoice = 0;
				currentAccounts1.currentChoice = scanner.nextInt();
			}
			System.out.println("Thank you for using the ATM. Visit Again!!! ");
		}
	}
}
