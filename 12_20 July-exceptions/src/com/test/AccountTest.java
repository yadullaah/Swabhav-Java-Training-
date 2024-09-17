package com.test;

import java.util.Scanner;

import com.exceptions.InsufficientBalanceException;
import com.exceptions.MinimumBalanceException;
import com.exceptions.OverdraftLimitExceededException;
import com.assignment.Account;
import com.assignment.CurrentAccount;
import com.assignment.SavingAccount;

public class AccountTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Bank Service Portal");
		System.out.println("Select the Account Type: ");
		System.out.println("ATM Menu:\r\n" + "1. Saving\r\n" + "2. Current\r\n" + "3. Exit");

		System.out.println("Input the values from the numbers: ");
		int userInput = scanner.nextInt();
		if (userInput == 1) {
			SavingAccount savingAccounts1 = new SavingAccount(123456, "Yadullah", 450000, 2000);
			System.out.println("Your Account Details : \n" + savingAccounts1);
			savingAccounts1.Menu();
			int choice = scanner.nextInt();
			while (choice != 4) {
				switch (choice) {
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
					try{
						savingAccounts1.savingMinBalanceChecker(scanner.nextInt());
					}catch(InsufficientBalanceException e) {
						System.out.println(e.getMessage());
					}catch(MinimumBalanceException e) {
						System.out.println(e.getMinimumBalanceException());
					}
					
					break;
				}
				case 4: {
					break;
				}
				}
				savingAccounts1.Menu();
				// savingAccounts1.savingChoice = 0;
				choice = scanner.nextInt();
			}
			System.out.println("Thank you for using the ATM. Visit Again!!! ");

		} else if (userInput == 2) {
			CurrentAccount currentAccounts1 = new CurrentAccount(23131, "Swabhav", 30000, 15000);
			System.out.println("Your Account Details : \n" + currentAccounts1);
			currentAccounts1.Menu();
			int choice = scanner.nextInt();
			while (choice != 4) {
				switch (choice) {
				case 1: {
					System.out.println(currentAccounts1.getBalance());
					break;
				}
				case 2: {
					System.out.println("Enter the amount to deposit: ");
//					currentAccounts1.deposit(scanner.nextInt());
					currentAccounts1.depositInOverDraft(scanner.nextInt());
					break;
				}
				case 3: {
					System.out.println("Enter the amount to withdraw: ");
					int currentWithdraw = scanner.nextInt();
					// currentAccounts1.withdraw(currentWithdraw);
					try {
						
						currentAccounts1.overDraftAmount(currentWithdraw);
					}catch(OverdraftLimitExceededException e) {
						System.out.println(e.getOverDraftException());
					}
					break;
				}
				case 4: {
					break;
				}
				}
				currentAccounts1.Menu();
				// savingAccounts1.savingChoice = 0;
				choice = scanner.nextInt();
			}
			System.out.println("Thank you for using the ATM. Visit Again!!! ");
		}
	}
}

