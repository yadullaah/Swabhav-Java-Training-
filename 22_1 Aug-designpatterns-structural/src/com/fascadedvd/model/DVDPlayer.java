package com.fascadedvd.model;

public class DVDPlayer implements ISystem, IDevice {

	@Override
	public void on() {
		System.out.println("DVD is switched on");

	}

	@Override
	public void off() {
		System.out.println("DVD is switched off");

	}

	@Override
	public void start() {
		System.out.println("DVD has started");

	}

	@Override
	public void stop() {
		System.out.println("DVD has stopped");
	}

}
