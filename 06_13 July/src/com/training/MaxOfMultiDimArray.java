package com.training;

import java.util.Scanner;

public class MaxOfMultiDimArray {

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
		int max = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (max < matrix[i][j]) {
					max = matrix[i][j];
				}
			}
		}
		System.out.println("Maximum number of Array : " + max);
	}
}
