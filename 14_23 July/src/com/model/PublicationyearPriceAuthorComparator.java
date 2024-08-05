package com.model;

import java.util.Comparator;

public class PublicationyearPriceAuthorComparator implements Comparator<Book> {

	public int compare(Book b1,Book b2) {
		return Comparator.comparingInt(Book::getPublicationYear)
        .thenComparingDouble(Book::getPrice)
        .thenComparing(Book::getAuthor)
        .compare(b1, b2);
	}

}
