package com.aurionpro.structural.decorator.model;

public class GoldenHat extends HatDecorator{

	public GoldenHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		return hat.getName()+" is upgraded now to "+"Golden Hat";
	}

	@Override
	public int getPrice() {
		return 1000+hat.getPrice();
		
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		System.out.println("Congratulations on getting a new look to your cap.");
		return "Golden Hat with Golden Feature on it.";
	}

	@Override
	public String toString() {
		return "Name=" + getName() + "\nPrice=" + getPrice()
				+ "\nDescription=" + getDescription();
	}
	


}
