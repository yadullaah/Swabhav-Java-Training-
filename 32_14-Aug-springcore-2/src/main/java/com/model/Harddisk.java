package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Harddisk {
	
	private int capacity;

	@Override
	public String toString() {
		return "Harddisk [capacity=" + capacity + "]";
	}

	public Harddisk() {

	}

	@Autowired
	public Harddisk(@Value("10") int capacity) {
		super();
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
