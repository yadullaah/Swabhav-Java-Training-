package com.training;

public class Box {
	private int width;
	private int height;
	private int depth;

	public Box() {

		this.depth = 10;
		this.width = 10;
		this.height = 10;

	}

	public Box(int width, int height) {
		this();
		this.width = width;
		this.height = height;

	}

	public Box(int width, int height, int depth) {
		this();
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

}
