package com.test;

import com.training.IAddition;

public class AdditionTest {
	public static void main(String[] args) {

		IAddition adder = (number1, number2) -> number1 + number2;

		System.out.println(adder.add(5, 7));

	}

}
