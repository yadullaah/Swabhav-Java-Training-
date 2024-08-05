package com.test;

import com.interfacee.Shape;
import com.interfacee.Circle;

public class ShapeInterfaceTest {
	public static void main(String[] args) {
		Shape shape;
		
		shape = new Circle(10);
		shape.area();
	}

}
