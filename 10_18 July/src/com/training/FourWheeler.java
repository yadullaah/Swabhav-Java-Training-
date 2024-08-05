package com.training;

public class FourWheeler extends Vehicle {
	private int mileage;

	public FourWheeler(int mileage, String companyname) {
		super(companyname);
		this.mileage = mileage;
	}
	
	
	public int getMileage() {
		return mileage;
	}

	

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

}
