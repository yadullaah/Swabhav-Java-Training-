package com.test;

import java.util.function.BiConsumer;

public class BIConsumerTest {
	public static void main(String[] args) {

		BiConsumer<Integer, Integer> biConsumer = (Integer num1, Integer num2) -> 
		System.out.println("Square of the numbers are: " + (num1 * num1) + " and " + (num2 * num2));
		
		biConsumer.accept(5, 3);

	}

}
