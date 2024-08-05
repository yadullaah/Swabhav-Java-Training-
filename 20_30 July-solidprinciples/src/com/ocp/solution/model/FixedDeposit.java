package com.ocp.solution.model;

import com.ocp.violation.model.FestivalType;

public class FixedDeposit {

	private int accountNumber;
	private String name;
	private double principle;
	private int duration;
	FestivalInterest interest;

	public FixedDeposit(int accountNumber, String name, double principle, int duration, FestivalInterest interest) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.interest = interest;
	}

	@Override
	public String toString() {
		return "FixedDeposit [accountNumber=" + accountNumber + ", name=" + name + ", principle=" + principle
				+ ", duration=" + duration + ", interest=" + interest + "]";
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

	public double getPrinciple() {
		return principle;
	}

	public void setPrinciple(double principle) {
		this.principle = principle;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public FestivalInterest getInterest() {
		return interest;
	}

	public void setInterest(FestivalInterest interest) {
		this.interest = interest;
	}

	public double calculateSimpleInterest() {
		return (principle * duration * interest.getInterestRate() / 100);

	}

}
