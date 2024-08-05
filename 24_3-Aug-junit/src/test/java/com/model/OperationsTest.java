package com.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OperationsTest {

	@Test
	public void testAddition() {
		
		Operations operation = new Operations();
		assertEquals(30, operation.addition(10, 20));
	}
	
	@Test
	public void testMultiplication() {
		
		Operations operation = new Operations();
		assertEquals(200, operation.multiplication(10, 20));
	}

}
