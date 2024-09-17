package com.assignments;

import java.util.Scanner;

public class MatrixMultiplication {
	public static int[][] createMatrix() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows");
		int rows = sc.nextInt();

		System.out.println("Enter number of columns");
		int columns = sc.nextInt();

		int[][] matrix = new int[rows][columns];

		System.out.println("Enter the elements of the matrix");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		return matrix;

	}

	public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {

		int rows1 = matrix1.length;
		int columns1 = matrix1[0].length;
		int rows2 = matrix2.length;
		int columns2 = matrix2[0].length;

		if (columns1 == rows2) {
			int[][] product = new int[rows1][columns2];

			for (int i = 0; i < rows1; i++) {
				for (int j = 0; j < columns2; j++) {
					for (int k = 0; k < rows2; k++) {
						product[i][j] += matrix1[i][k] * matrix2[k][j];
					}
				}
			}

			return product;
		}

		else {
			System.out.println("The matrices are not compatible for multiplication");
			return null;
		}
	}

	public static void printMatrix(int[][] matrix) {

		int rows = matrix.length;
		int columns = matrix[0].length;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		MatrixMultiplication matrix = new MatrixMultiplication();

		System.out.println("Matrix 1");

		int[][] matrix1 = matrix.createMatrix();

		System.out.println("Matrix 2");

		int[][] matrix2 = matrix.createMatrix();

		int[][] product = matrix.multiplyMatrices(matrix1, matrix2);

		if (product != null) {
			System.out.println("The resulting matrix is ");
			matrix.printMatrix(product);
		}

	}
}
