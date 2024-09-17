package com.training;

public class Student extends Person {
	
	private double percentage;
	private int age;
	
	
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Student [percentage=" + percentage + ", age=" + age + ", getRollnumber()=" + getRollnumber()
				+ ", getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
	}
	

}
