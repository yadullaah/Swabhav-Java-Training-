package com.test;

import com.training.Base;
import com.training.Derived1;
import com.training.Derived2;

public class BaseTest {
	public static void main(String[] args) {
		Base base = new Base();
		Derived1 derived1 = new Derived1();
		Derived2 derived2 = new Derived2();
		
		base.display();
		derived1.display();
		derived2.display();
		
		base= derived1;
		base.display();
		
		base = new Derived2();
		base.display();
		
	}

}
