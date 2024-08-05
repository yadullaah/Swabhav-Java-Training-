package com.composite.model;

public class Leaf implements Component {
	private String name;

	public Leaf(String name) {
		this.name = name;
	}

	@Override
	public void showDetails() {
		System.out.println(name);
	}
}