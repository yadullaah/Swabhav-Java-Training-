package com.training;
import java.util.Scanner;
public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		 
		System.out.println("Enter size");
		int size = sc.nextInt();

		int arr[];
		arr = new int[size];
		System.out.println("Enter Elements of Array");
		
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();

		}
		
		int reversedarr [] =new int [size];
		
		for (int i=0; i<size; i++) {
			reversedarr [arr.length-1-i] = arr[i];
			
		}
		for (int i =0; i<size;i++ ) {
			System.out.print(reversedarr[i] + "\t");
		}
	}

}
