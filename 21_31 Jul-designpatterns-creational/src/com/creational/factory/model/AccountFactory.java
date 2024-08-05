package com.creational.factory.model;

public class AccountFactory {

	public IAccount makeSavingsAccount(int accountNumber, String name, int balance, int minBalance) {
		return new SavingsAccount(accountNumber, name, balance, minBalance);
	}

	public IAccount makeCurrentAccount(int accountNumber, String name, int balance, int overdraftLimit) {
		return new CurrentAccount(accountNumber, name, balance, overdraftLimit);
	}
}
