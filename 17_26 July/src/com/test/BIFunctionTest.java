package com.test;

import java.util.function.BiFunction;

public class BIFunctionTest {
	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> multiplyNumbers = (Integer number1, Integer number2) -> number1 * number2;

		System.out.println(multiplyNumbers.apply(5, 5));

	}
}
