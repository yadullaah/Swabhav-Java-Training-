package com.training;
import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Radius of Circle");
		int r = sc.nextInt();
		double pi = 3.142, area;

		area = pi * r * r;

		System.out.println("Area of Circle = ");
	}
}
