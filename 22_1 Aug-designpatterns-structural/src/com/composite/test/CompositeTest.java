package com.composite.test;

import com.composite.model.*;

public class CompositeTest {
	public static void main(String[] args) {
		Component leaf1 = new Leaf("Leaf 1");
		Component leaf2 = new Leaf("Leaf 2");

		Composite composite = new Composite();
		composite.addComponent(leaf1);
		composite.addComponent(leaf2);

		Composite rootComposite = new Composite();
		rootComposite.addComponent(composite);

		rootComposite.showDetails();
	}
}
