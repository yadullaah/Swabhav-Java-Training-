package com.training;
import java.util.Scanner;

public class SwapTwoNumbers {
public static void main(String[] args) {
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter First Number");
	int a = sc.nextInt();
	
	System.out.println("Enter Second Number");
	int b = sc.nextInt();
	
	System.out.println("Before Swapping");
	System.out.println("First Number = "+a + " Second Number = "+b);
	
	System.out.println("After Swapping");
	System.out.println("First Number = "+b + " Second Number = "+a);
	
	
	
	
}
}
