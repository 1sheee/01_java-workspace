package com.hw1.view;

import java.util.Scanner;

import com.hw1.controller.BookController;

public class BookMenu {
	
	private BookController bc = new BookController();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		
		System.out.println("===== 메인 메뉴 =====");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제하기");
		System.out.println("0. 프로그램 종료하기");
		System.out.print("메뉴 번호 선택 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		
		case 1 : insertBook(); break;
		case 2 : //selectList(); break;
		case 3 : //searchBook(); break;
		case 4 : //deleteBook(); break;
		case 5 : System.out.println("프로그램 종료"); return;
		
		}

	}
	
	public void insertBook() {
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		sc.nextLine();
		System.out.print("저자명 : ");
		String author = sc.nextLine();
		System.out.print("장르번호 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) : ");
		int category = sc.nextInt();
		switch(category) {
		case 1 : System.out.println("인문");
		case 2 : System.out.println("자연과학");
		case 3 : System.out.println("의료");
		case 4 : System.out.println("기타");
		}
		sc.nextInt();
		System.out.print("가격 : ");
		String price = sc.nextLine();
		
		bc.insertBook(title, author, category, price);
		
		System.out.println("성공적으로 추가되었습니다.");
		
	}
	
	
	
	
	
	
}
