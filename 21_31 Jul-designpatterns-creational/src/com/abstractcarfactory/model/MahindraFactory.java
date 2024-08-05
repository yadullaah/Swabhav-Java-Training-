package com.abstractcarfactory.model;

public class MahindraFactory implements ICarFactory {

	@Override
	public ICar makeCar() {
	//	ICar car = null;

		return new Mahindra();

	}

}
