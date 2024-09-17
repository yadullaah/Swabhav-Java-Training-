package com.test;

import com.training.IGreeting;

public class GreetingTest {
	public static void main(String[] args) {

		// IGreeting greet = new IGreeting() {

		// @Override
		// public void say(String name) {
		// System.out.println("Hello " + name);
		//
		// }
		//
		// };

		IGreeting greet = name -> System.out.println("Hello " + name);

		greet.say("world");

	}

}
