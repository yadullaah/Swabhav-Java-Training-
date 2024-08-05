package com.test;

import java.util.ArrayList;
import java.util.List;
import com.training.AccountModel;

public class AccountTest {
	public static void main(String[] args) {

		List<AccountModel> accounts = new ArrayList<>();

		accounts.add(new AccountModel(1001, "Yadullah", 1500));
		accounts.add(new AccountModel(1002, "Suhasmurthy", 2500));
		accounts.add(new AccountModel(1003, "Parag", 500));
		accounts.add(new AccountModel(1004, "Jateen", 4500));
		
		accounts.stream()
                .min((account1, account2) -> Double.compare(account1.getBalance(), account2.getBalance()))
                .ifPresent(accountWithMinBalance ->
       System.out.println( "Account with minimum balance: Account Number: " + accountWithMinBalance.getNumber()
                                     +", Name: " + accountWithMinBalance.getName()
                                     +  ", Balance: " + accountWithMinBalance.getBalance() ));
		
		System.out.println();
		
		accounts.stream()
        .max((account1, account2) -> Double.compare(account1.getBalance(), account2.getBalance()))
        .ifPresent(accountWithMaxBalance ->
        System.out.println( "Account with maximum balance: Account Number: " + accountWithMaxBalance.getNumber()
                             +", Name: " + accountWithMaxBalance.getName()
                             +  ", Balance: " + accountWithMaxBalance.getBalance() ));
		
		System.out.println();
		
		 accounts.stream()
         .filter(account -> account.getName().length() > 6)
         .forEach(account -> System.out.println("Name having greater than 6 characters is " + account.getName()));

		 System.out.println();
		 
		 double sum = accounts.stream()
				 .map((account)-> account.getBalance())
		         .reduce(0.0, (balance1, balance2) -> balance1+balance2);
                 System.out.println("Sum of all account balance : "+sum);

	}

}
