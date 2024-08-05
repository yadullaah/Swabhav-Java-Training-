package com.ocp.violation.model;

public class FixedDeposit {

	private int accountNumber;
	private String name;
	private double principle;
	private int duration;
	private FestivalType festivalType;

	public FixedDeposit(int accountNumber, String name, double principle, int duration, FestivalType festivalType) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principle = principle;
		this.duration = duration;
		this.festivalType = festivalType;
	}

	@Override
	public String toString() {
		return "Bank [accountNumber=" + accountNumber + ", name=" + name + ", principle=" + principle + ", duration="
				+ duration + ", festivalType=" + festivalType + "]";
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

	public FestivalType getFestivalType() {
		return festivalType;
	}

	public void setFestivalType(FestivalType festivalType) {
		this.festivalType = festivalType;
	}

	public double calculateSimpleInterest() {

		if (festivalType == FestivalType.NEWYEAR)
			return principle * duration * 8 / 100;

		if (festivalType == FestivalType.DIWALI)
			return principle * duration * 8.5 / 100;

		if (festivalType == FestivalType.HOLI)
			return principle * duration * 7.5 / 100;

		if (festivalType == FestivalType.OTHERS)
			return principle * duration * 6.5 / 100;

		return (Double) null;

	}

	public double getInterestRates() {

		if (this.getFestivalType().equals(FestivalType.NEWYEAR))
			return 8;
		if (this.getFestivalType().equals(FestivalType.DIWALI))
			return 8.5;
		if (this.getFestivalType().equals(FestivalType.HOLI))
			return 7.5;
		return 6.5;

	}

}
