package com.training;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		// System.out.println(names.size());

		// System.out.println(names);
		names.add("Yadullah");
		names.add("Suhas");
		names.add("Swabhav");
		System.out.println(names);

		names.add(1, "Deep");
		System.out.println(names);
		names.remove(1);
		System.out.println(names);
		
		List<Integer> numbers = Arrays.asList(10,20,30,40);
		System.out.println(numbers);

	}

}
