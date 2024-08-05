package com.accountfactory.model;

public class CurrentAccount extends Account implements IAccount {

	public CurrentAccount(int accountNumber, String name, double balance) {
		super(accountNumber, name, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double credit(double creditAmount) {

		if (creditAmount <= 0) {
			System.out.println("Cannot deposit that amount");
		}

		this.setBalance(this.getBalance() + creditAmount);
		return this.getBalance();
	}

	@Override
	public double debit(double depositAmount) {
		// TODO Auto-generated method stub
		this.setBalance(this.getBalance() - depositAmount);

		return this.getBalance();
	}

}
