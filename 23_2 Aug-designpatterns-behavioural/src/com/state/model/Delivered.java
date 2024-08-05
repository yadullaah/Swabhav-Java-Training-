package com.state.model;

public class Delivered implements IPacketState {

	@Override
	public void next(Packet packet) {
		System.out.println("The package is moving to received state");
	}

	@Override
	public void current(Packet packet) {
		
		System.out.println("The package is in delivered state");
	}

	@Override
	public void previous(Packet packet) {
		packet.setIpacketstate(new Ordered());
		System.out.println("The package came from ordered state");
	}

}
