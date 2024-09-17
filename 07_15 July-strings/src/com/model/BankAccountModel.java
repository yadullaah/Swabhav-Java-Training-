package com.model;

public class BankAccountModel {
//	private long accountNumber;
	private String accountHolderName;
	private int accountBalance;

//	public long getAccountNumber() {
//		return accountNumber;
//	}

	public String getName() {
		return accountHolderName;
	}

	public int getBalance() {
		return accountBalance;
	}

//	public void setAccountNumber(long accnumber) {
//		accountNumber = accnumber;
//	}

	public void setName(String name) {
		accountHolderName = name;
	}

	public void setBalance(int balance) {
		accountBalance = balance;
	}

	public void amountDeposit(int deposit) {
		accountBalance += deposit;
		System.out.println("Deposit Successful. New Balance : " + accountBalance);
	}

	public void amountWithdraw(int withdraw) {
		if (withdraw > 0 && withdraw <= accountBalance) {
			accountBalance -= withdraw;
			System.out.println("Withdraw Successful. Remaining Balance : " + accountBalance);
		} else {
			System.out.println("Withdraw Failed. Insufficient Balance.");
			System.out.print("Your Balance is ");
		}
	}

	public void Menu() {
		System.out.println("ATM Menu:");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Exit");

		System.out.println("Please choose an option: ");
	}
}
