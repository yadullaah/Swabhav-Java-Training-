package com.training;

public class CurrentBankAccount extends BankAccounts {
	private double overDraftLimit;
	public int currentChoice;

	public CurrentBankAccount(int accountNumber, String name, int balance, double overDraftLimit) {
		super(accountNumber, name, balance);
		this.overDraftLimit = overDraftLimit;
	}

	public double getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}

	@Override
	public String toString() {
		return "CurrentAccount \nOver Draft Limit=" + overDraftLimit + ", AccountNumber =" + getAccountNumber()
				+ ", Name =" + getName() + ", Balance=" + getBalance();
	}

	public void overDraftAmount(int withdraw) {

		if (this.getBalance() < withdraw) {
			System.out.println("You are using the overdraft amount from now.");
			double extraWithdraw = this.getBalance() - withdraw;
			this.setBalance(extraWithdraw);
			overDraftLimit = overDraftLimit + extraWithdraw;
			System.out.println("Your balance overdrafted is : " + this.getBalance());
			return;
		}
		this.withdraw(withdraw);
		return;
	}
}
