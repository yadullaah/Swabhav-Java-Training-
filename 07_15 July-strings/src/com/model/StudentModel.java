package com.model;

public class StudentModel {
	private String name;
	private int age;
	private double percentage;

	public String getname() {
		return name;
	}

	public void setname(String n) {
		name = n;
	}

	public int getage() {
		return age;
	}

	public void setage(int a) {
		age = a;
	}

	public double getpercentage() {
		return percentage;
	}

	public void setpercentage(double p) {
		percentage = p;
	}

	public void grade() {
		if (percentage >= 75) {
			System.out.println("Grade is A");
		} else if (percentage >= 60 && percentage < 75) {
			System.out.println("Grade is B");
		} else if (percentage >= 50 && percentage < 60) {
			System.out.println("Grade is C");
		} else if (percentage >= 40 && percentage < 50) {
			System.out.println("Grade is D");
		} else if (percentage < 40) {
			System.out.println("Grade is F");
		} else {
			System.out.println("Input valid percentage");
		}

	}
}
