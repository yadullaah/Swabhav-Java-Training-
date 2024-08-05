package com.state.model;

public class Received implements IPacketState {

	@Override
	public void next(Packet packet) {
		System.out.println("The packacge is received finally");
	}

	@Override
	public void current(Packet packet) {
		System.out.println("The package is in received state");
	}

	@Override
	public void previous(Packet packet) {
		System.out.println("The package came from delivered state");
	}

}
