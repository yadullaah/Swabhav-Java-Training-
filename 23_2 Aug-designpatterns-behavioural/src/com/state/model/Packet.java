package com.state.model;

public class Packet {

	private IPacketState packetstate;

	@Override
	public String toString() {
		return "Packet [ipacketstate=" + packetstate + "]";
	}

	public Packet(IPacketState ipacketstate) {
		super();
		this.packetstate = ipacketstate;
	}

	public IPacketState getIpacketstate() {
		return packetstate;
	}

	public void setIpacketstate(IPacketState ipacketstate) {
		this.packetstate = ipacketstate;
	}

	public void goToNextState() {

	}

	public void goToPreviousState() {

	}

	public void printCurrentState() {

	}

}
