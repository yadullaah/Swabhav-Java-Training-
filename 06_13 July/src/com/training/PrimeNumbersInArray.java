package com.training;
import java.util.Scanner;
public class PrimeNumbersInArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

    
    System.out.print("Enter the size of the array: ");
    int size = sc.nextInt();

   
    int arr[] = new int[size];

    
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < size; i++) {
        arr[i] = sc.nextInt();
    }

    
    System.out.print("Prime numbers in the array: ");
    for (int j = 0; j < size; j++) {
        int number = arr[j];
        int flag = 0;
        int i = 2;

        if (number <= 1) {
            flag = 1;
        }

        
        while (i < number) {
            if (number % i == 0) {
                flag = 1;
                break;
            }
            i++;
        }

        if (flag == 0) {
            System.out.print(number + " ");
        }
    }
}
}
