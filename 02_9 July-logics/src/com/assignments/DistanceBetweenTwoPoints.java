package com.assignments;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1");
		int x1 = sc.nextInt();

		System.out.println("Enter y1");
		int y1 = sc.nextInt();

		System.out.println("Enter x2");
		int x2 = sc.nextInt();

		System.out.println("Enter y2");
		int y2 = sc.nextInt();

		int a = x2 - x1;
		int b = y2 - y1;

		int c = a * a;
		int d = b * b;

		double distance = Math.sqrt(c + d);
		System.out.println("Distance between two points as per given coordiantes is " + distance);
	}

}
