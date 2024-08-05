package com.observer.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.observer.model.*;

public class AccountTest {
	public static void main(String[] args) {
		List<INotifier> notifyme = new ArrayList<INotifier>();

		Account account = new Account(1001, "Yadullah", 2000, notifyme);

		Scanner scanner = new Scanner(System.in);

		System.out.println("How do you want to get notified");
		System.out.println("Press 1 for SMS Notification");
		System.out.println("Press 2 for Email Notification");
		System.out.println("Press 3 for Whatsapp Notification");

		int choice = scanner.nextInt();

		if (choice == 1)
			account.registernotifiers(new SMSNotifier());
		if (choice == 2)
			account.registernotifiers(new EmailNotifier());
		if (choice == 3)
			account.registernotifiers(new WhatsappNotfier());

		account.deposit(300);

		// try {
		// account.withdraw(2500);
		// } catch(InsufficientBalanceException e) {
		// System.out.println(e.getLocalizedMessage());
		// }
		//

	}

}
