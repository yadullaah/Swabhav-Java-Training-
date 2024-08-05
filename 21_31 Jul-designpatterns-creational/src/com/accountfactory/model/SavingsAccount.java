package com.accountfactory.model;

public class SavingsAccount extends Account implements IAccount {

	public SavingsAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double credit(double creditAmount) {

		if (creditAmount <= 0) {
			System.out.println("Cannot deposit that amount");
		}

		this.setBalance(this.getAccountNumber() + creditAmount);
		return this.getBalance();
	}

	@Override
	public double debit(double depositAmount) {
		// TODO Auto-generated method stub
		this.setBalance(this.getBalance() - depositAmount);

		return this.getBalance();
	}

}
