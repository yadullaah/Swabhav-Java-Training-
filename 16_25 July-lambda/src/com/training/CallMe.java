package com.training;

public class CallMe {

	private String message;

	public  void call(String message) {
		System.out.print("[" + message);

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
