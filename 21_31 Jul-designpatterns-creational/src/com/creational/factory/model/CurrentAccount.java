package com.creational.factory.model;

public class CurrentAccount implements IAccount {

	private int accountNumber;
	private String name;
	private int balance;
	private int overdraftLimit;

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

	public int getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(int overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	public CurrentAccount(int accountNumber, String name, int balance, int overdraftLimit) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public String toString() {
		return "CurrentAccount [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance
				+ ", overdraftLimit=" + overdraftLimit + "]";
	}

	@Override
	public void credit() {
		// Assuming credit is a deposit action
		int depositAmount = 500; // Example deposit amount
		this.balance += depositAmount;
		System.out.println("Deposit successful. New balance: " + this.balance);
	}

	@Override
	public void debit() {
		// Assuming debit is a withdrawal action
		int withdrawalAmount = 1000; // Example withdrawal amount

		if (this.balance - withdrawalAmount < -this.overdraftLimit) {
			System.out.println("Transaction failed. Cannot exceed overdraft limit of: " + this.overdraftLimit);
		} else {
			this.balance -= withdrawalAmount;
			System.out.println("Withdrawal successful. New balance: " + this.balance);
		}
	}

	// Getters and Setters
}
