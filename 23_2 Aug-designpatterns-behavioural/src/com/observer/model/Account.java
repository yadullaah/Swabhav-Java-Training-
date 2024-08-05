package com.observer.model;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private int accountNumber;
	private String name;
	private int balance;
	private List<INotifier> notifiers;

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}

	public Account(int accountNumber, String name, int balance, List<INotifier> notifiers) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.notifiers = new ArrayList<>();
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

	public List<INotifier> getNotifiers() {
		return notifiers;
	}

	public void setNotifiers(List<INotifier> notifiers) {
		this.notifiers = notifiers;
	}

	public void deposit(int deposit) {
		this.balance += deposit;
		System.out.println("Deposit Successful. New Balance : " + balance);
		notifyNotifiers(notifiers);

	}

	public void withdraw(int withdraw) {

		if (withdraw > 0 && withdraw <= this.balance) {
			this.balance -= withdraw;
			System.out.println("Withdraw Successful. Remaining Balance : " + this.balance);
		}

		if (withdraw > this.balance) {
			throw new InsufficientBalanceException(this.getBalance());
		}
		
	}

	public void registernotifiers(INotifier notifiers) {
		this.notifiers.add(notifiers);
	}

	public void notifyNotifiers(List<INotifier> notifiers) {
		for (INotifier notifier : notifiers) {
			notifier.notify(this);

		}
	}

}
