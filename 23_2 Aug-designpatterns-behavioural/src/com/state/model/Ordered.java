package com.state.model;

public class Ordered implements IPacketState {

	@Override
	public void next(Packet packet) {
		System.out.println("Just now ordered");
	}

	@Override
	public void current(Packet packet) {
		System.out.println("The package is in ordered state");
	}

	@Override
	public void previous(Packet packet) {
		System.out.println("The package is movingn to delivered state");
	}

}
