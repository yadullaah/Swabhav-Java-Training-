package com.decortaorcar.model;

public class OilChange extends CarServiceDecortaor{

	public OilChange(ICarService carobj) {
		super(carobj);
	}
	
	@Override
	public double getCost() {
		return 500+ super.getCost();
	}


}
