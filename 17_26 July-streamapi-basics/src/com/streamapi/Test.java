package com.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(25, 35, 45, 55, 65);

		 Stream<Integer> numberStream = numbers.stream();
		 numbers.stream()
		 .forEach((number) -> System.out.println(number));

		List<Integer> filteredNumbers = numbers.stream()
		                                       .filter((number) -> (number % 2 != 0))
		                                       .filter((number) -> (number > 35))
		                                       .collect(Collectors.toList());
		             
		filteredNumbers.forEach((number) -> System.out.println(number));
			   
		
		
		List<Integer> squareNumbers = numbers.stream()
				                             .map((number) -> number*number)
				                             .collect(Collectors.toList());
		
		squareNumbers.forEach((number) -> System.out.println(number));
		
		int sum = numbers.stream()
				         .reduce(0, (number1, number2) -> number1+number2);
		                 System.out.println("Sum : "+sum);
		
		//sorting in ascending order
		numbers.stream()
		       .sorted()
		       .forEach((number) -> System.out.println(number));
		
		//sorting in descending order
		numbers.stream()
	           .sorted((number1,number2) -> number2- number1)
	           .limit(3)
	           .forEach(number -> System.out.println(number));

		
		Optional<Integer> max = numbers.stream().max((number1, number2)-> number1- number2 );
		
		if(max.isPresent())
			System.out.println("Max : "+max);
		
		Optional<Integer> min = numbers.stream().min((number1, number2)-> number1- number2 );
		
		if(min.isPresent())
			System.out.println("Min : "+min);
		

	}
}
