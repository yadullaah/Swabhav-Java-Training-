package com.test;

import java.util.function.Predicate;

public class PredicateTest {
public static void main(String[] args) {
	
		Predicate <Integer> evenchecker = (Integer number) -> (number%2==0);
		System.out.println(evenchecker.test(50));
		System.out.println(evenchecker.test(5));
		System.out.println(evenchecker.test(4));

}
}
