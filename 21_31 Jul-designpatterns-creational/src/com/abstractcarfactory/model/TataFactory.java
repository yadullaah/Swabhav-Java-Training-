package com.abstractcarfactory.model;

public class TataFactory implements ICarFactory {

	@Override
	public ICar makeCar() {
	//	ICar car = null;

		return new Tata();

	}

}
