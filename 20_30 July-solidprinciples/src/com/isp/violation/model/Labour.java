package com.isp.violation.model;

public class Labour implements IWorker{

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
