package com.training;

public class AccountModel {

	private int number;
	private String name;
	private double balance;

	public AccountModel(int number, String name, double balance) {
		super();
		this.number = number;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "AccountModel [number=" + number + ", name=" + name + ", balance=" + balance + "]";
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
