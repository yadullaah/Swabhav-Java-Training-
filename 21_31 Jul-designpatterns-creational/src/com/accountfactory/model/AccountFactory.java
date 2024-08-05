package com.accountfactory.model;

public class AccountFactory {
	private IAccount iaccount;

	public IAccount getSavingsAccount(int accountNumber, String name, double balance) {
		iaccount = new SavingsAccount(accountNumber, name, balance);

		return iaccount;

	}

	public IAccount getCurrentAccount(int accountNumber, String name, double balance) {
		iaccount = new CurrentAccount(accountNumber, name, balance);

		return iaccount;

	}
}
