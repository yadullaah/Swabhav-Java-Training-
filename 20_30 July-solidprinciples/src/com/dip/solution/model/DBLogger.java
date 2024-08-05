package com.dip.solution.model;

public class DBLogger implements ILogger {

	@Override
	public void log(String err) {
		System.out.println("Logged into Database "+err);
		
	}

}
