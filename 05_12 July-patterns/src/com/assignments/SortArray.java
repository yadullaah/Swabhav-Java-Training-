package com.assignments;

import java.util.Scanner;

public class SortArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter length of an array: ");
		int length = sc.nextInt();
		
		
		 int arrayOfNumbers [] = new int[length];
		
		System.out.println("Enter input: ");
		
		for (int i = 0; i<length; i ++) {
			arrayOfNumbers[i] = sc.nextInt();
		}
		
		System.out.print("Array is ");
		for (int i = 0; i<length; i++) {
			System.out.print(arrayOfNumbers[i]+" ");		
		}
		System.out.println();


		
		for (int i = 0; i<length; i++) {
			for(int j = 0;j<length;j++) {
				if(arrayOfNumbers[i]<arrayOfNumbers[j]) {
					int temp = arrayOfNumbers[j];
					arrayOfNumbers[j] = arrayOfNumbers[i];
					arrayOfNumbers[i] = temp;
				}
			}
		}		System.out.print("Sorted Array is ");
		for (int i = 0; i<length; i++) {
			System.out.print(arrayOfNumbers[i]+" ");		
		}
		System.out.println();
		
}}
