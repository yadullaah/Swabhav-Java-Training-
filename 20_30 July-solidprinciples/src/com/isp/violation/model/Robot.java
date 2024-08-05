package com.isp.violation.model;

public class Robot implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Robot has started working");
		
	}

	@Override
	public void stopWork() {
		System.out.println("Robot has stopped working");		
		
	}

	@Override
	public void eat() {
		System.out.println("Robot has started eating");		
		
	}

	@Override
	public void drink() {
		System.out.println("Robot has started drinking");		
		
	}

}
