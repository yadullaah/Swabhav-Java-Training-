package com.training;
import java.util.Scanner;
public class SumOfNaturalNumbers {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
//	System.out.println("Enter a number");
//	int a = sc.nextInt();
	int i = 1;
	int sum = 0;
	while (i <= 100) {
		sum = sum + i;
		i++;
	}
	System.out.println(sum);
}
}