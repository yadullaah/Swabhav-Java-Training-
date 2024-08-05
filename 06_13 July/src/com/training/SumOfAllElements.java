package com.training;
import java.util.Scanner;
public class SumOfAllElements {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the number of rows");
	int rows = sc.nextInt();

	System.out.println("Enter the number of columns");
	int columns = sc.nextInt();

	System.out.println("Enter the elements of the array : ");
	int matrix[][] = new int[rows][columns];

	for (int i = 0; i < rows; i++) {
		for (int j = 0; j < columns; j++) {
			matrix[i][j] = sc.nextInt();
		}
	}
	
	int sum = 0;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            sum = sum + matrix[i][j];
        }
    }

	for (int i = 0; i < rows; i++) {
		for (int j = 0; j < columns; j++) {
			System.out.print(matrix[i][j] + "\t");
		}
		System.out.println();
		
	}
	System.out.println("Sum of all elements is "+sum);
}
}
