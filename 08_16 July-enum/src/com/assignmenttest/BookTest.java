package com.assignmenttest;

import java.util.*;

import com.assignmentmodel.BookApp;

public class BookTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter number of books ");
		int size = sc.nextInt();

		BookApp books[] = new BookApp[size];

		for (int n = 0; n < size; n++) {
			System.out.println("ENter BookId");
			int bookId = sc.nextInt();

			System.out.println("Enter Book name ");
			String name = sc.next();

			System.out.println("Enter Book author name ");
			String author = sc.next();

			System.out.println("enter price ");
			double price = sc.nextDouble();

			System.out.println("Enter Book publication name ");
			String publication = sc.next();

			books[n] = new BookApp(bookId, name, author, price, publication);

		}

		for (int n = 0; n < size; n++) {
			double minPrice = books[n].getPrice();

			for (int i = n + 1; i < size; i++) {
				double price = books[i].getPrice();

				if (minPrice > price) {
					BookApp temp = books[i];
					books[i] = books[n];
					books[n] = temp;
					n--;
					break;
				} else if (minPrice == price) {
					BookApp temp = books[i];
					books[i] = books[n + 1];
					books[n + 1] = temp;
					i++;
				}
			}
		}

		for (BookApp d : books) {

			System.out.println(" Name : " + d.getname());
			System.out.println(" Book id " + d.getBookId());
			System.out.println(" Book Author " + d.getAuthor());
			System.out.println(" Price " + d.getPrice());
			System.out.println(" Publication " + d.getPublication());
			System.out.println();
		}

	}
}
