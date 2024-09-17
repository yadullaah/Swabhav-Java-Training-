package com.training;

public class Car {

	private int carId;
	private String companyname;
	private double price;
	private int mileage;

	public Car(int carId, String companyname, double price, int mileage) {
		super();
		this.carId = carId;
		this.companyname = companyname;
		this.price = price;
		this.mileage = mileage;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", companyname=" + companyname + ", price=" + price + ", mileage=" + mileage
				+ "]";
	}

}
