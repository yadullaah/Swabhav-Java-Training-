package com.test;

import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		Consumer<Integer> consumer = (Integer number) -> System.out.println("Square of the number is : " + number*number);
		consumer.accept(5);
	}
}


