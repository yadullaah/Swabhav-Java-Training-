package com.test;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {

		Function<Integer, Integer> squarenumber = (Integer number) -> number * number;
		method(squarenumber);

	}

	private static void method(Function<Integer, Integer> squarenumber) {

		System.out.println(squarenumber.apply(5));

	}

}
