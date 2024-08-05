package com.assignments;

import java.util.Scanner;

public class ElementCheckInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter the elements of array");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}

		System.out.print("Array elements are: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		System.out.println("Enter element to check whether it is present in the array or not");
		int element = sc.nextInt();

		boolean present = false;
		for (int i = 0; i < size; i++) {
			int number = arr[i];
			if (number == element) {
				System.out.println("Element is present in the array at " + i + " position");
				present = true;
				break;
			}

		}
		if (!present) {
			System.out.println("Element is not present");
		}

	}

}
