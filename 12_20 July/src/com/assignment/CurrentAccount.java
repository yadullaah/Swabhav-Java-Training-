package com.assignment;

import com.exceptions.OverdraftLimitExceededException;

public class CurrentAccount extends Account {
	private double overDraftLimit;
	private double fixOverDraft = 15000;

	public CurrentAccount(int accountNumber, String name, int balance, double overDraftLimit) {
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


	public void depositInOverDraft(int deposit) {
		if (this.overDraftLimit < this.getFixOverDraft()) {
			this.deposit(deposit);
			System.out.println("Overdraft ki limit"+this.overDraftLimit);
	if(this.getBalance() > 0 && overDraftLimit < this.fixOverDraft) {
		overDraftLimit = 15000;
		System.out.println("Overdraft"+this.overDraftLimit);
	}
		}
	}
	
	public void overDraftAmount(int withdraw) {
		if(withdraw>this.getBalance() && overDraftLimit < withdraw) {
			throw new OverdraftLimitExceededException(getBalance());
		}
		
		if (this.getBalance() < withdraw  && withdraw <= overDraftLimit){
			System.out.println("You are using the overdraft amount from now.");
			System.out.println("Withdraw Successful");
			int extraWithdraw= this.getBalance() - withdraw;
			this.setBalance(extraWithdraw);
			overDraftLimit = overDraftLimit + extraWithdraw;
			System.out.println("Your balance overdrafted is : "+ this.getBalance());
			System.out.println("Overdraft balance : "+overDraftLimit);

			return;
		}
		this.withdraw(withdraw);
		return;
	}

	public double getFixOverDraft() {
		return fixOverDraft;
	}


}
