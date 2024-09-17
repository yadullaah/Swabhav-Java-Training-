package com.assignment;

public class BankAccounts {
	private int accountNumber;
	private String name;
	private int balance;

	public BankAccounts(int accountNumber, String name, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int deposit) {
		this.balance += deposit;
		System.out.println("Deposit Successful. New Balance : " + this.balance);
	}

	public void withdraw(int withdraw) {
		if (withdraw > 0 && withdraw <= this.balance) {
			this.balance -= withdraw;
			System.out.println("Withdraw Successful. Remaining Balance : " + this.balance);
		} else {
			System.out.println("Withdraw Failed. Insufficient Balance.");
			System.out.println("Your Balance is " + this.balance);
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
