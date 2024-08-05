package com.creational.factory.model;

public class Tata implements ICar {

	@Override
	public void start() {
		System.out.println("Tata staretd");
	}

	@Override
	public void stop() {
		System.out.println("Tata stopped");

	}

}
