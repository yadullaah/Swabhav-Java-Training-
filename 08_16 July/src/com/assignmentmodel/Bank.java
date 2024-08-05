package com.assignmentmodel;

import com.assignmenttest.AccountType;

public class Bank {
	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName + ", accountBalance="
				+ accountBalance + ", accountType=" + accountType + "]";
	}

	private long accountNumber;
	private String accountHolderName;
	private double accountBalance;
	private AccountType accountType;

	public Bank() {
	}

	public Bank(long accountNumber, String accountHolderName, double accountBalance, AccountType accountType) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.accountType = accountType;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public void amountDeposit(double deposit) {
		accountBalance += deposit;
		System.out.println("Deposit Successful. New Balance: " + accountBalance);
	}

	public void amountWithdraw(double withdraw) {
		if (withdraw > 0 && withdraw <= accountBalance) {
			accountBalance -= withdraw;
			System.out.println("Withdraw Successful. Remaining Balance: " + accountBalance);
		} else {
			System.out.println("Withdraw Failed. Insufficient Balance.");
		}
	}

	public void Menu() {
		System.out.println("ATM Menu:");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit Money");
		System.out.println("3. Withdraw Money");
		System.out.println("4. Check Account Number");
		System.out.println("5. Check Account Type");
		System.out.println("6. Exit");
		System.out.println();
		System.out.println("Please choose an option: ");
	}

}
