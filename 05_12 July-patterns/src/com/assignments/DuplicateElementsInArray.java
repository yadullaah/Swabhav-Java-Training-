package com.assignments;
import java.util.Scanner;
public class DuplicateElementsInArray {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the size of the array");
	int size = sc.nextInt();

	int arr[] = new int[size];
	
	int count = 0;

	System.out.println("Enter the elements of array");

	for (int i = 0; i < size; i++) {
		arr[i] = sc.nextInt();

	}

	System.out.print("Array elements are: ");
	for (int i = 0; i < size; i++) {
		System.out.print(arr[i] + " ");
	}
	
	for (int i = 0; i < size; i++) {
		for (int j = i+1 ; j < size; j++) {
			if (arr[i] == arr[j]) {
				count++;
			}
		}
	}System.out.println("");
	System.out.println("Number of duplicate elements are :"+count);
}
}
