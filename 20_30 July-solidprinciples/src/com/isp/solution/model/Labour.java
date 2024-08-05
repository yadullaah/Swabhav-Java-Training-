package com.isp.solution.model;

public class Labour implements IWorkable, ILunchInterval {

	@Override
	public void startWork() {
		System.out.println("Labour has started working");

	}

	@Override
	public void stopWork() {
		System.out.println("Labour has stopped working");
	}

	@Override
	public void eat() {
		System.out.println("Labour has started eating");

	}

	@Override
	public void drink() {
		System.out.println("Labour has started drinking");

	}

}
