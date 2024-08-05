package com.creational.factory.model;

public class Maruti implements ICar {

	@Override
	public void start() {
		System.out.println("Maruti started");
	}

	@Override
	public void stop() {
		System.out.println("Maruti stopped");

	}

}
