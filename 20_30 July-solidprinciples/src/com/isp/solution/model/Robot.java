package com.isp.solution.model;

public class Robot implements IWorkable {

	@Override
	public void startWork() {
		System.out.println("Robot has started working");

	}

	@Override
	public void stopWork() {
		System.out.println("Robot has stopped working");
	}

}
