package com.test;

import java.util.function.Supplier;

public class SupplierTest {
	public static void main(String[] args) {

		Supplier<Integer> randomnumber = () -> (int) (Math.random()*1000);
		System.out.println("System generated random number is : "+randomnumber.get());
		
		

	}

}
