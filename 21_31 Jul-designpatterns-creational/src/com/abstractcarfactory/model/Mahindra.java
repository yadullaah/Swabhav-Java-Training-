package com.abstractcarfactory.model;

public class Mahindra implements ICar {

	@Override
	public void start() {
		System.out.println("Mahindra started");
	}

	@Override
	public void stop() {
		System.out.println("Mahindra stopped");
	}

}
