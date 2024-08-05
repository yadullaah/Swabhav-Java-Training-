package com.training;

import java.util.Scanner;

public class Matrix3x3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int matrix[][] = new int[3][3];

		System.out.println("Enter elements of Matrix");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		printMatrix(matrix);

	}

	private static void printMatrix(int matrix[][]) {
		System.out.println("Matrix is : ");
		for (int i = 0; i < 3; i++) {

			printRow(matrix, i);
			System.out.println();

		}
	}

	private static void printRow(int[][] matrix, int i) {
		for (int j = 0; j < 3; j++) {
			System.out.print(matrix[i][j] + "\t");
		}

	}

}
