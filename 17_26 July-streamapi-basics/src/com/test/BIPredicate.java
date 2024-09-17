package com.test;

import java.util.function.BiPredicate;

public class BIPredicate {
	public static void main(String[] args) {

		BiPredicate<Integer, Integer> bipredicate = (num1, num2) -> num1 > num2;
		System.out.println(bipredicate.test(4, 5));
	}

}
