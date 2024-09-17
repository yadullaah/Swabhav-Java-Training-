package com.training;

public class Triangle extends Shape {
	private int base;
	private int height;

	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}

	public void area() {
		System.out.println("Area of traingle is " + (0.5 * base * height));

	}

}
