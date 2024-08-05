package com.training;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size");
		int size = sc.nextInt();

		int arr[];
		arr = new int[size];
		System.out.println("Enter Array Elements");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("Elements of array are : ");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i] + "\t");
		}
	}

}
