package com.training;

public class Car extends FourWheeler {
	private int price;

	public Car(int price, int mileage, String companyname) {
		
		super(mileage, companyname);
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [price = " + price + ", Mileage = " + getMileage() + ", Companyname = " + getCompanyname()
				+ "]";
	}

}
