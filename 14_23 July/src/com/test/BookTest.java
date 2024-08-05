package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.model.AuthorTitlePrice;
import com.model.Book;
import com.model.BookAuthorComparator;
import com.model.BookPriceComparator;
import com.model.BookPublicationYearComparator;
import com.model.BookTitleComparator;
import com.model.PublicationyearPriceAuthorComparator;

public class BookTest {
	public static void main(String[] args) {

		List<Book> books = new ArrayList<Book>();

		books.add(new Book("Making India Awesome", "Chetan Bhagat", 750, 2001));
		books.add(new Book("Revolution 2020", "Chetan Bhagat", 865, 2023));
		books.add(new Book("Gitanjali", "Rabindranath Tagore", 550, 1910));
		books.add(new Book("Wings of Fire", "Arun Tiwari", 900, 1999));
		books.add(new Book("Anandmath", "Bankim Chandra Chatterjee", 690, 1965));

		System.out.println("Books List: ");
		for (Book book : books) {
			System.out.println(book);
		}

		Collections.sort(books, new BookTitleComparator());
		System.out.println();

		System.out.println("Books List sorted according to Title: ");
		for (Book book : books) {
			System.out.println(book);
		}

		Collections.sort(books, new BookAuthorComparator());

		System.out.println();

		System.out.println("Books List sorted according to Author: ");
		for (Book book : books) {
			System.out.println(book);
		}

		Collections.sort(books, new BookPriceComparator());
		System.out.println();

		System.out.println("Books List sorted according to Price: ");
		for (Book book : books) {
			System.out.println(book);
		}

		Collections.sort(books, new BookPublicationYearComparator());
		System.out.println();

		System.out.println("Books List sorted according to Book Publication: ");
		for (Book book : books) {
			System.out.println(book);
		}

		Collections.sort(books, new AuthorTitlePrice());
		System.out.println();

		System.out.println("Books List sorted : ");
		for (Book book : books) {
			System.out.println(book);
		}

		System.out.println();
		Collections.sort(books, new PublicationyearPriceAuthorComparator());
		System.out.println();

		System.out.println("Books List sorted : ");
		for (Book book : books) {
			System.out.println(book);
		}

	}
}
