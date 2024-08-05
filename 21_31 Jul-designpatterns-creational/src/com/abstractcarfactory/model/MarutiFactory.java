package com.abstractcarfactory.model;

public class MarutiFactory implements ICarFactory{

	@Override
	public ICar makeCar() {		
		return new Maruti();
		
	}

}
