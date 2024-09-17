package com.test;

import java.util.Scanner;

import com.exceptions.EmailNotValidException;
import com.exceptions.PasswordNotValidException;
import com.assignment.Authentication;

public class AuthenticationTest {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	
		System.out.println("Enter your Email ID: ");
		String email = scanner.next();
		System.out.println("Enter your Passsword: ");
		String password = scanner.next();
		try {
		Authentication user = new Authentication(email, password);
				System.out.println(user);
	}catch(EmailNotValidException e) {
		System.out.println(e.getEmailNotValidException());
	}catch(PasswordNotValidException e) {
		System.out.println(e.getPasswordNotValidException());
	}
}
}
