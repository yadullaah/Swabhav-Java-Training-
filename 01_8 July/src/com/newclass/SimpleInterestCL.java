package com.newclass;

public class SimpleInterestCL {
	public static void main(String[] args) {
		
		int p = Integer.parseInt (args[0]);
		double r = Double.parseDouble(args[1]);
		double t = Double.parseDouble(args[2]);
		
		
		int a = 100;

		double si = (p * r * t) / 100;

		System.out.println("Simple Interest = " + si);
	}

}
