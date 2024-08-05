package com.observer.model;

public class SMSNotifier implements INotifier{

	@Override
	public void notify(Account account) {
		
		System.out.println("SMS Notification: ");
		System.out.println("Account number : "+ account.getAccountNumber() 
		+ " Account Balance: "+ account.getBalance());
		
	}

}
