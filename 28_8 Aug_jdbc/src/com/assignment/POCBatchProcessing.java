package com.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class POCBatchProcessing {

	public static List<Integer> batchProcess(List<Integer> numbers) {
		List<Integer> results = new ArrayList<>();

		for (Integer number : numbers) {
			results.add(number * number);
		}

		return results;
	}

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> squaredNumbers = batchProcess(numbers);
		System.out.println("Processed batch results: " + squaredNumbers);
	}
}
