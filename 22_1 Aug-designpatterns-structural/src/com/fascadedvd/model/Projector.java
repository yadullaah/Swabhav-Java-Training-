package com.fascadedvd.model;

public class Projector implements IDevice {

	@Override
	public void on() {
		System.out.println("Projector is switched on");
	}

	@Override
	public void off() {
		System.out.println("Projector is switched off");
	}

}
