package com.observer.model;

public class WhatsappNotfier implements INotifier {

	@Override
	public void notify(Account account) {
		System.out.println("Whatsapp Notification: ");
		System.out.println("Account number : " + account.getAccountNumber() 
		+ " Account Balance: " + account.getBalance());
	}

}
