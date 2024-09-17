package com.training;

import java.util.Scanner;

public class AddMultiDimArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows: ");
		int rows = sc.nextInt();

		System.out.println("Enter number of columns: ");
		int columns = sc.nextInt();

		int matrix[][] = new int[rows][columns];
		int matrix1[][] = new int[rows][columns];
		int matrixans[][] = new int[rows][columns];
		System.out.println("Enter Values for Matrix A: ");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter Values for Matrix B: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix1[i][j] = sc.nextInt();
			}
		}

		System.out.println("Matrix A");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("Matrix B");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix1[i][j] + "\t");
			}
			System.out.println();
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrixans[i][j] = matrix[i][j] + matrix1[i][j];
			}
		}
		System.out.println("Addition Matrix");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrixans[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
