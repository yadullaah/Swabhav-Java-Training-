package com.assignmentmodel;

public class BookApp {

	private int bookId;
	private String name;
	private String author;
	private double price;
	private String publication;

	public BookApp() {

	}

	public BookApp(int bookId, String name, String author, double price, String publication) {
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.price = price;
		this.publication = publication;

	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getname() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

}