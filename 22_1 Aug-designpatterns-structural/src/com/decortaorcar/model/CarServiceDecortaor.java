package com.decortaorcar.model;

public abstract class CarServiceDecortaor implements ICarService {

	private ICarService carobj;

	public CarServiceDecortaor(ICarService carobj) {
		super();
		this.carobj = carobj;
	}

	@Override
	public double getCost() {
		return carobj.getCost();
	}

}
