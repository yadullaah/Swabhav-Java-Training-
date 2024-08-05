package com.newclass;

public class AreaOfCircleCL {
public static void main(String[] args) {
	
	int r = Integer.parseInt (args[0]);
	
	double pi = 3.142, area;
	
	 area = pi *r*r;
	
	System.out.println("Area of Circle = "+ area);
}
}
