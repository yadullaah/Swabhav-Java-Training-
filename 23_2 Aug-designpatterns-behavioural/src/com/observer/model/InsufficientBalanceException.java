package com.observer.model;

public class InsufficientBalanceException extends RuntimeException {
	private double balance;

	public InsufficientBalanceException(double balance) {
		super();
		this.balance = balance;
	}

	public String getMessage() {
		return "Insufficient Balance to withdraw from your Account. Your Account Balance : " + this.balance;
	}

}
