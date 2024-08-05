package com.training;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionTest {
	public static void main(String[] args) throws ClassNotFoundException {

		Class StringClass = Class.forName("java.lang.String");

		System.out.println(StringClass.getName());

		Method StringMethods[] = StringClass.getMethods();
		for (Method methods : StringMethods) {
			System.out.println(methods.getClass());
			Parameter parameters[] = methods.getParameters();
			for (Parameter parameter : parameters) {
				System.out.println(parameter.getName());
			}
		}
		Constructor constructors[] = StringClass.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor.getName());
		}
	}
}
