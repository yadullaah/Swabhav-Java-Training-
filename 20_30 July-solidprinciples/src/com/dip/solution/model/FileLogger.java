package com.dip.solution.model;

public class FileLogger implements ILogger {

	@Override
	public void log(String err) {
		System.out.println("Logged into File System "+err);
		
	}

}
