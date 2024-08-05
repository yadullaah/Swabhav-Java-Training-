package com.assignments;

import java.util.Scanner;

public class PeakElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array: ");
		int size = sc.nextInt();

		int array[] = new int[size];

		System.out.println("Enter the elements : ");
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		System.out.print("Original Array: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		int count = 0;
		for (int i = 1; i < size - 1; i++) {
			if (array[i - 1] < array[i] && array[i] > array[i + 1]) {
				count++;
				System.out.println(array[i] );
			}

		}
		System.out.println("So, there are total " + count + " peak elements");
	}
}
