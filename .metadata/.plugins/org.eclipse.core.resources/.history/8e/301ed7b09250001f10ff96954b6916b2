package com.aurionpro.structural.decorator.model;

public class RibbonedHat extends HatDecorator{

	public RibbonedHat(IHat hat) {
		super(hat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return hat.getName()+" is upgraded now to "+"Ribboned Special Edition.";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 500+hat.getPrice();
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		System.out.println("Congratulations on getting a new look to your cap.");
		return "Ribboned Hat with different colors and designer ribbons for your all occasions.";
	}

	@Override
	public String toString() {
		return "Name=" + getName() + "\nPrice=" + getPrice() + "\nDescription="
				+ getDescription();
	}

}
