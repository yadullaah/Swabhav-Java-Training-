package com.abstractcarfactory.model;

public class Tata implements ICar {

	@Override
	public void start() {
		System.out.println("Tata started");
	}

	@Override
	public void stop() {
		System.out.println("TAata stopped");
	}

}
