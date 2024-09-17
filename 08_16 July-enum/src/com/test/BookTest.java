package com.test;

import java.util.Scanner;

import com.model.Book;

public class BookTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Book books[] = new Book[5];

		for (int i = 0; i < books.length; i++) {
			System.out.println("Enter Book ID");
			int bookId = sc.nextInt();

			System.out.println("Enter Name");
			String name = sc.next();

			System.out.println("Enter Athor");
			String author = sc.next();

			System.out.println("Enter Price");
			double price = sc.nextDouble();

			System.out.println("Enter Publication");
			String publication = sc.next();

			books[i] = new Book(bookId, name, author, price, publication);

		}

		for (int i = 0; i < books.length; i++) {
			System.out.println("Book ID is " + books[i].getBookId());
			System.out.println("Name " + books[i].getName());
			System.out.println("Author is " + books[i].getAuthor());
			System.out.println("Price is " + books[i].getPrice());
			System.out.println("Publication is " + books[i].getPublication());
		}
		sc.close();
	}
}
