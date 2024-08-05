package com.decortaorcar.model;

public class WheelAlign extends CarServiceDecortaor {

	public WheelAlign(ICarService carobj) {
		super(carobj);
	}

	@Override
	public double getCost() {
		return 1500 + super.getCost();
	}

}
