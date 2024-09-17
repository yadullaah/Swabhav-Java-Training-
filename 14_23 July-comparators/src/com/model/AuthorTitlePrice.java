package com.model;

import java.util.Comparator;

public class AuthorTitlePrice implements Comparator<Book>{

	public int compare(Book b1,Book b2) {
		return Comparator.comparing(Book::getAuthor)
        .thenComparing(Book::getTitle)
        .thenComparingDouble(Book::getPrice)
        .compare(b1, b2);
	}



}
