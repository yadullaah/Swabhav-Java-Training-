package com.fascadehotel.model;

public class IndianMenu implements IMenu {

	@Override
	public void displayMenu() {
		System.out.println("This is Indian menu ");
		System.out.println("We only have veg thali");
		System.out.println();
	}

}
