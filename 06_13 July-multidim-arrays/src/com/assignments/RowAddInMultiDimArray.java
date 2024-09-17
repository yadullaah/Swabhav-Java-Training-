package com.assignments;

import java.util.Scanner;

public class RowAddInMultiDimArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();

		System.out.print("Enter number of columns: ");
		int columns = sc.nextInt();
		System.out.println();

		int matrix[][] = new int[rows][columns];

		System.out.println("Enter the values: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		int sum = 0;
		int count = 1;
		for (int i = 0; i < rows; i++) {
			System.out.print("Row " + (count) + " --> ");
			for (int j = 0; j < columns; j++) {
				sum += matrix[i][j];
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.print(" = ");

			System.out.print(" Sum of Row " + (count) + " : " + sum);
			count++;
			System.out.println();
			sum = 0;
		}

	}
}
