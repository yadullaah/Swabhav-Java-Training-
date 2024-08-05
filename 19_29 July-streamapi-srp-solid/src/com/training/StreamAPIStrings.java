package com.training;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamAPIStrings {
	public static void main(String[] args) {

		List<String> names = Arrays.asList("Jayesh", "Nimesh", "Mark", "Mahesh", "Ramesh");

		names.stream().sorted().limit(3).forEach((name) -> System.out.println(name));

		System.out.println();

		names.stream().filter(name -> name.contains("a")).sorted().limit(3)

				.forEach((name) -> System.out.println(name));
		System.out.println();

		names.stream().sorted(Collections.reverseOrder()).limit(3).forEach((name) -> System.out.println(name));
		System.out.println();

		names.forEach((name) -> System.out.println(name.substring(0, 3)));
		System.out.println();

		names.stream().sorted().filter(name -> (name.length() <= 4)).forEach((name) -> System.out.println(name));
		System.out.println();

	}

}
