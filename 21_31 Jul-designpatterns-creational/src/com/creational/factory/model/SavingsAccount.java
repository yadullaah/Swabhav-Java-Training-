package com.creational.factory.model;

public class SavingsAccount implements IAccount {

	private int accountNumber;
	private String name;
	private int balance;
	private int minBalance;

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

	public int getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}

	public SavingsAccount(int accountNumber, String name, int balance, int minBalance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.minBalance = minBalance;
	}

	@Override
	public String toString() {
		return "SavingsAccount [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance
				+ ", minBalance=" + minBalance + "]";
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
		int withdrawalAmount = 300; // Example withdrawal amount

		if (this.balance - withdrawalAmount < this.minBalance) {
			System.out.println("Transaction failed. Balance cannot go below the minimum balance: " + this.minBalance);
		} else {
			this.balance -= withdrawalAmount;
			System.out.println("Withdrawal successful. New balance: " + this.balance);
		}
	}

	// Getters and Setters
}
