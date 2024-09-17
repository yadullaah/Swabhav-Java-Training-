package com.assignments;

import java.util.Scanner;

public class SearchNumberInMatrixWithPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = sc.nextInt();

		System.out.println("Enter number of columns: ");
		int columns = sc.nextInt();

		int matrix[][] = new int[rows][columns];
		System.out.println("Enter Values: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Enter a number to be searched: ");
		int find = sc.nextInt();
		int count = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (find == matrix[i][j]) {
					System.out.println("Number " + find + " found at index " + (i + 1) + "," + (j + 1));
					count++;
				}
			}
		}
		if (count == 0) {
			System.out.println("Number " + find + " Not Present in the Array");
		}
	}
}
