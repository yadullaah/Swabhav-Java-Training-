package com.observer.model;

public class EmailNotifier implements INotifier {

	@Override
	public void notify(Account account) {
		System.out.println("Email Notification: ");
		System.out.println("Account number : "+ account.getAccountNumber() 
		+ " Account Balance: "+ account.getBalance());		
	}

}
