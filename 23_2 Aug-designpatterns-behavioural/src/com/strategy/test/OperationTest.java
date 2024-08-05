package com.strategy.test;

import com.strategy.model.*;

public class OperationTest {
	public static void main(String[] args) {
		OperationStrategy op = new OperationStrategy(new AddOperation());
		System.out.println(op.doOperation(5, 3)); // Output: 8

		op.setOperation(new MultiplyOperation());
		System.out.println(op.doOperation(5, 3)); // Output: 15
	}

}
