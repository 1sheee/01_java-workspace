package com.br.objectArray.model.vo;

public class Book {
	
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	public Book() {}
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public String getPublisher() {
		return publisher;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String information() {
		return "도서명 : " + title
				+ ", 작가명 : " + author
				+ ", 가격 : " + price + "원"
				+ ", 출판사 : " + publisher;
	}

}
