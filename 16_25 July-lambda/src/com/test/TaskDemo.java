package com.test;

import com.training.Task;

public class TaskDemo {
	public static void main(String[] args) {
		
		for(int i = 0; i<10; i++) {
			Thread thread = new Thread (new Task());
			thread.start();
		}
	}

}
