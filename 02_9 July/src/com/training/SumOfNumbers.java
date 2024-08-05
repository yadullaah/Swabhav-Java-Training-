package com.training;
import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		
//		int total = num1 + num2;
		System.out.println("Sum of = "+num1 +" and  "+num2 +" = "+ (num1+num2));
		
		
		
		
	}

}
