package com.assignments;

import java.util.Scanner;

public class SecondLargestOfArray {

	public static int getSecondLargestNumber(int[] arr) {
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = num;
			} else if (num > secondLargest && num != firstLargest) {
				secondLargest = num;
			}
		}

		return secondLargest;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		int secondLargest = getSecondLargestNumber(arr);
		System.out.println("The second largest number is: " + secondLargest);
	}
}
