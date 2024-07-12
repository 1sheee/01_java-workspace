package com.hw1.controller;

import java.util.ArrayList;
import java.util.List;

import com.hw1.model.vo.Book;

public class BookController {

	
	List<Book> bookList = new ArrayList<>();
	{bookList.add(new Book("자바언어의 정석", "홍길동", "기타", 20000));
	bookList.add(new Book("C언어의 보람", "김말똥", "기타", 15000));
	bookList.add(new Book("도움이 되었나요", "강보람", "인문", 17500));
	bookList.add(new Book("여러분", "홍홍홍", "의료", 10000));
	}
	
	public void insertBook(String title, String author, int category, String price) {	
		String str = Integer.toString(category);
		int num = Integer.parseInt(price);
		bookList.add(new Book(title, author, str, num));
		
		
		
	}
	
	
	
}
