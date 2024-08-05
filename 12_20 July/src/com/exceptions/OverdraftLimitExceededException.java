package com.exceptions;

public class OverdraftLimitExceededException extends RuntimeException{
	private double balance;

	public OverdraftLimitExceededException(double balance) {
		super();
		this.balance = balance;
	}
	
	public String getOverDraftException() {
		return "You have exceeding your Overdraft Limit, deposit the overdraft balance to avoid charges.";
	}
}
