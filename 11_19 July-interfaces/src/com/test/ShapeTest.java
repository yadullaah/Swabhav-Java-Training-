package com.test;

import com.training.Circle;
import com.training.Rectangle;
import com.training.Triangle;

public class ShapeTest {
	
	public static void main(String[] args) {
		
		Circle circle = new Circle(10);
		circle.area();
		
		Rectangle rectangle = new Rectangle(15, 25);
		rectangle.area();
		
		Triangle triangle = new Triangle (25, 35);
		triangle.area();
	}

}
