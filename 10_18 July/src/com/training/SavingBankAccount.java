package com.training;

public class SavingBankAccount extends BankAccounts {
	private double minBalance;
	public int savingChoice;

	public SavingBankAccount(int accountNumber, String name, int balance, double minBalance) {
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
		if (this.getBalance() < minBalance) {
			System.out.println("Amount exceeding minimum Balance criteria please maintain the balance");
			System.out.println("Deposit the money as soon as possible.");
			this.withdraw(withdraw);
			return;
		}
		this.withdraw(withdraw);
		return;
	}

}
