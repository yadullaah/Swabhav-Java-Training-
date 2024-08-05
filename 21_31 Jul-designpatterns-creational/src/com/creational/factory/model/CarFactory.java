package com.creational.factory.model;

public class CarFactory {

	// public ICar makeCar(String carName) {
	//
	// ICar car = null;
	//
	// if (carName == "Maruti")
	// car = new Maruti();
	//
	// if (carName == "Tata")
	// car = new Tata();
	//
	// if (carName == "Mahindra")
	// car = new Mahindra();
	//
	// return car;
	// }

	public ICar makeCar(CarName carname) {

		ICar car = null;

		if (carname == CarName.MARUTI)
			car = new Maruti();

		if (carname == CarName.TATA)
			car = new Tata();

		if (carname == CarName.MAHINDRA)
			car = new Mahindra();

		return car;
	}

}
