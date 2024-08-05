package com.model;

public class CircleModel {
	public double radius;
	
	public void values(int r) {
	radius = r;
	}
	
	public double calculatearea () {
		 
		return (3.14*radius*radius);
		
	}
	
	public CircleModel(int r){
	radius = r;
	}
}
