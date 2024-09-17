package com.assignment;

import com.exceptions.InsufficientBalanceException;
import com.exceptions.MinimumBalanceException;

public class SavingAccount extends Account {
	private double minBalance;
	public int savingChoice;

	public SavingAccount(int accountNumber, String name, int balance, double minBalance) {
		super(accountNumber, name, balance);
		this.minBalance = minBalance;
	}

	public double getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}

	@Override
	public String toString() {
		return "SavingAccount \nMinimum Balance=" + minBalance + ", Account Number =" + getAccountNumber() + ", Name ="
				+ getName() + ", Balance =" + getBalance();
	}

	public void savingMinBalanceChecker(int withdraw) {
		if (withdraw > this.getBalance()) {
			throw new InsufficientBalanceException(this.getBalance());
		}
		if ((this.getBalance()-withdraw) < minBalance ) {
			this.withdraw(withdraw);
			throw new MinimumBalanceException(this.getBalance());
		}
		this.withdraw(withdraw);
		return;
}

}
