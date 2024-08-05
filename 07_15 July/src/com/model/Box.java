package com.model;

public class Box {

	private int width;
	private int height;
	private int depth;
	
	public Box (int width, int height, int depth) {
		this.width= width;
		this.height= height;
		this.depth= depth;
	}

	public int getwidth() {
		return width;
	}

	public void setwidth(int width) {
		this.width = width;
	}

	public int getheight() {
		return height;
	}

	public void setheight(int height) {
		this.height = height;
	}

	public int depth() {
		return depth;
	}

	public void sethdepth(int depth) {
		this.depth = depth;
	}

	// public int calculatearea () {
	//
	// return width*height*depth;
	// }
	//
	// public void display() {
	// System.out.println("Width is : " + width);
	// System.out.println("Height is : " + height);
	// System.out.println("depth is : " + depth);
	// }

}
