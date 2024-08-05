package com.lambda.test;

import com.lambda.model.Isayable;
import com.lambda.model.SayableImpl;

public class SayableTest {
public static void main(String[] args) {
	
	Isayable sayable = new SayableImpl();
	sayable.say();
}
}
