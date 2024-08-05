package com.accountfactory.test;

import com.accountfactory.model.*;

public class AccountTest {

	public static void main(String[] args) {
		AccountFactory accountFactory = new AccountFactory();
		IAccount account = accountFactory.getCurrentAccount(1001, "Yadullah", 45000);

		System.out.println("amount after debit is " + account.debit(1000));

		System.out.println("amount after credit  is " + account.credit(1000));

	}

}
