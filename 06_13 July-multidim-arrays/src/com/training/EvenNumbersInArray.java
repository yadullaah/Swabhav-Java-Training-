package com.training;

import java.util.Scanner;

public class EvenNumbersInArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size");
		int size = sc.nextInt();

		int arr[];
		arr = new int[size];
		System.out.println("Enter Elements of Array");

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}
		int count = 0;
		int arreven[] = new int[size];
		for (int i = 0; i < size; i++) {
			if (arr[i] % 2 == 0) {
				arreven[count] = arr[i];
				count++;
			}
		}
		
		System.out.println("The number of even numbers are :"+count);
		System.out.println("Even numbers in the Array are :"  );
		for (int i = 0; i < count; i++) {
            System.out.print(arreven[i] + " ");
        }
		
	}

}
