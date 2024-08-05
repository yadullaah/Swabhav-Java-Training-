package com.creational.factory.model;

public class Mahindra implements ICar {

	@Override
	public void start() {
		System.out.println("Mahindra staretd");
	}

	@Override
	public void stop() {
		System.out.println("Mahindra stopped");

	}

}
