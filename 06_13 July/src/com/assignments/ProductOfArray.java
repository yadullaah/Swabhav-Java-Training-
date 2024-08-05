package com.assignments;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArray {

    public static int[] productExceptSelf(int[] array) {
        int n = array.length;
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];
        int[] prod = new int[n];

        leftProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * array[i - 1];
        }
        
        rightProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * array[i + 1];
        }

        for (int i = 0; i < n; i++) {
            prod[i] = leftProducts[i] * rightProducts[i];
        }

        return prod;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int[] prod = productExceptSelf(array);
        System.out.println("Product array: " + Arrays.toString(prod));
    }
}

