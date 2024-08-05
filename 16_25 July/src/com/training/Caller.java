package com.training;

public class Caller implements Runnable {

	private String message;
	private CallMe target;
	private Thread thread;

	public Caller(String message, CallMe target) {
		super();
		this.message = message;
		this.target = target;
		thread = new Thread(this);
		thread.start();
	}

	public Thread getThread() {

		return thread;
	}

	@Override
	public void run() {
		
		synchronized (target) {
			target.call(message);

		}

	}

}
