package com.br.objectArray.run;

import java.util.Scanner;

import com.br.objectArray.model.vo.Book;

public class ObjectArrayMain1 {
	
	// 다수의 객체들을 하나의 배열로 관리해보기
	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		// 세 개의 Book객체를 담기 위한 배열
									// 전부 북타입
		Book[] books = new Book[3];	// books[0] <= null books[1] <= null books[2] <= null
		
		Scanner sc = new Scanner(System.in);
		
			for(int i=0;i<3;i++) { // i=0 => i=1 => i=2
			
			System.out.println((i+1) + "번째 도서정보 입력");
			
			System.out.print("도서명 : ");
			String title = sc.nextLine();
			System.out.print("저자명 : ");
			String author = sc.nextLine();
			System.out.print("가격 : ");
			int price = sc.nextInt();
			sc.nextLine(); // 버퍼를 비워줌
			System.out.print("출판사명 : ");
			String publisher = sc.nextLine();
			
			// 매번 조건검사 후 각 객체 생성해야됨, 기존 코드 살린다면
//			if(i == 0) {
//				books[0] = new Book(title, author, price, publisher);
//			}else if (i == 1){
//				books[1] = new Book(title, author, price, publisher);
//			} else {
//				books[2] = new Book(title, author, price, publisher);
//			}
			// 각각의 인덱스 자리에 차곡차곡 객체 생성 대입
			books[i] =  new Book(title, author, price, publisher);
			
		}
			// 전체 조회 서비스
//			System.out.println(books[0].information());
//			System.out.println(books[1].information());
//			System.out.println(books[2].information());
			/*
			for(int i=0;i<books.length;i++) {
				System.out.println(books[i].information());
			}
			*/
			
			for(Book bk:books) { // 변수 = book[0]; => 변수 = book[1]; = > ...=> 변수 = books[마지막]
				System.out.println(bk.information());
			}
			
			// 검색 서비스
			System.out.print("검색할 책 제목 : ");
			String search = sc.nextLine();
			/*
			for(int i = 0 ; i<books.length;i++) {
				if (books[i].getTitle().equals(search)) {
					System.out.println(books[i].information());
				}
			}
			*/
			for(Book bk : books) {
				if(bk.getTitle().equals(search)) {
					System.out.println(bk.information());
				}
			}
	}

}
