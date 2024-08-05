package com.creational.factory.test;

import com.creational.factory.model.*;

public class IAccountTest {
	public static void main(String[] args) {
		AccountFactory accountFactory = new AccountFactory();

		IAccount savings = accountFactory.makeSavingsAccount(12345, "Yadullah", 1000, 500);
		System.out.println(savings);
		savings.debit();

		IAccount current = accountFactory.makeCurrentAccount(67890, "Suhas", 2000, 1000);
		System.out.println(current);
		current.debit();
	}
}
