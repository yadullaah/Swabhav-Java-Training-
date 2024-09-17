package com.model;

import java.util.Comparator;

public class BookPublicationYearComparator implements Comparator<Book>{

	@Override
	public int compare(Book book1, Book book2) {
		if (book1.getPublicationYear() > book2.getPublicationYear())
			return 1;

		if (book1.getPublicationYear() < book2.getPublicationYear())
			return -1;

		return 0;
	}

}
