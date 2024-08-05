package com.training;
import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Principal Amount");
		int p = sc.nextInt();

		System.out.println("Enter Rate of Interest");
		double r = sc.nextDouble();

		System.out.println("Enter Number of Years");
		double t = sc.nextDouble();

		int a = 100;

		double si = (p * r * t) / 100;

		System.out.println("Simple Interest = " + si);

	}

}
