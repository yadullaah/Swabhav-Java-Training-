package com.test;

import com.training.ITest;
import com.training.Reference;

public class ReferenceTest {
	public static void main(String[] args) {

		ITest test1 = Reference::new;

		System.out.println(test1);

		display(test1);

		ITest test2 = Reference::staticPrint;

		Reference reference = new Reference();

		System.out.println(reference);

		display(test2);

		ITest test3 = reference::print;
		display(test3);

	}

	private static void display(ITest test) {

		test.test();

	}
}
