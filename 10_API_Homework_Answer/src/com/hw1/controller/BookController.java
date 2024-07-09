package com.hw1.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.hw1.model.vo.Book;

public class BookController {
	
	private Book[] list = new Book[5];
	{ 	// 초기화블럭
		list[0] = new Book("자바의 정석", "제임스 고슬링", "나무", new GregorianCalendar(2018, 4-1, 15), 20000);
		list[1] = new Book("여러분들 성공할꺼에요", "보람쌤", "BR", new GregorianCalendar(2019, 6-1, 15), 30000);
		list[2] = new Book("API의 모든것", "강보람", "BR", new GregorianCalendar(2017, 2-1, 13), 15000);
		list[3] = new Book("씨언어 프로그래밍", "김절차", "문학동네", new GregorianCalendar(2016, 8-1, 30), 10000);
	}
	
	public BookController() {}
	
	// 1. 도서 전체 출력 기능 메소드
	public void printAll() {
		
		// list에 담긴 전체 Book객체의 정보 출력하는 구문 작성하시오.
		
		// 1) for loop문 방법
		/*
		for(int i=0; i<list.length; i++) { // 0번 인덱스부터 마지막인덱스(4)까지 순차적으로 접근하면서 출력 
			
			//System.out.println(list[i]); // 이렇게 바로 출력하면.. 마지막 인덱스는 아직 Book객체가 담겨있지 않기 때문에 null 출력됨!!
			
			if(list[i] != null) { // 따라서 해당 list[i]가 null이 아닐 경우(즉, Book객체 담겨있을 경우)만 출력될 수 있도록 조건처리 필요!
				System.out.println(list[i]);
			}
			
		}
		*/
		
		// 2) for each문 방법 (향상된 for문)	
		for(Book bk : list) { // 이 for문도 무조건 0번인덱스부터 마지막인덱스까지 반복문 돔!!
			
			// for loop문에서의 조건은 list[i]가 null이 아닐때 출력되게끔 했다면
			// 이번엔 매번 출력하기 전에 비교하여 만일 null일 경우 (즉, 마지막인덱스가 되었을 때)
			// 이 반복문을 빠져나가게끔 
			if(bk == null) {
				break;
			}
			
			System.out.println(bk);
			
		}
		
	}
	
	
	// 2. 도서 추가 기능 메소드
	public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice) {
		
		// 1. 매개변수로 전달받은 newPrice값  ==>      String --> int로 변환 작업 (int price라는 변수에 담으시오)
		//     								     "20000" -->  20000
		int price = Integer.parseInt(newPrice); // 파싱
		
		// --------------------------------------------------------
		// 2. 매개변수로 전달받은 newDate값   ==>        String --> Calendar로 변환 작업    (Calendar publishDate에 담으시오)
		//	  '-'를 구분자로 StringTokenizer 또는 split메소드를 이용하여 문자열 분리 후 각각 년,월,일 을 Calendar에 적용
		
		// 1) StringTokenizer를 이용한 방법
		/*
			//  1_1) StringTokenizer를 이용하여 먼저 "2020-07-01" 을 각각 문자열로 분리("2020", "07", "01")
			StringTokenizer stn = new StringTokenizer(newDate, "-"); 
			
			//  1_2) 각 분리된 문자열들을 매번 뽑아서 int 변수들에 담기
			//int year = stn.nextToken(); // stn.nextToken()으로 처음 뽑으면 "2020" 일거임 (즉, 엄연히 문자열 상태) --> 바로 int형 변수에 대입 불가 (파싱해야됨!!)
			
			int year = Integer.parseInt(stn.nextToken()); // "2020" --> 2020
			int month = Integer.parseInt(stn.nextToken());// "07"   --> 7
			int date = Integer.parseInt(stn.nextToken()); // "01"   --> 1
			
			//  1_3) year, month, date 가지고 Calendar객체 생성하기
			Calendar publishDate = new GregorianCalendar(year, month - 1, date);
		*/
		
		
		// 2) split 메소드를 이용한 방법
		// 2_1) split 메소드를 이용하여 먼저 "2020-07-01" 을 각각 문자열로 분리후 String[] 배열에 담기
		String[] arr = newDate.split("-");
		
		// 2_2) 각 분리된 문자열들이 담겨있는 해당 배열에 인덱스에 접근해서 int 변수들에 담기
		int year = Integer.parseInt(arr[0]);
		int month = Integer.parseInt(arr[1]);
		int date = Integer.parseInt(arr[2]);
		
		// 2_3) year, month, date 가지고 Calendar객체 생성하기
		Calendar publishDate = new GregorianCalendar(year, month - 1, date);
				
		// ------------------------------------------------------
		// 3. 나머지 전달받은 값들과 위에서 변환작업을 해준 price와 date값을 가지고
		//	  Book클래스의 매개변수 생성자를 통해 생성
		Book bk = new Book(newTitle, newAuthor, newPublisher, publishDate, price);
		list[4] = bk;
	
	}
	
	
	// 3. 도서 출간일 출력 기능 메소드
	public void printBookPublishDate() {
		// 새로 입력받은 도서 (5번째 도서)의 출간일 출력
		// "xxxx년 xx월 xx일 출간" 과 같은 패턴으로 출력
		// SimpleDateFormat을 이용하여 출력
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 출간");
		System.out.println(sdf.format(list[4].getPublishDate().getTimeInMillis())); // 바로 진행 (별도의 문자열에 보관안하고)
	}
	
	
	// 4. 도서 검색 기능 메소드
	public void searchBook(String searchTitle) {
		
		// 도서 리스트를 전체적으로 조회하면서 (for문 이용)
		// 전달받은 검색명을 포함(HINT : String클래스의 contains메소드 활용)한!! 도서들 전체 출력  
		
		// 1) for loop문 방법
		/*
		for(int i=0; i<list.length; i++) {
			if(list[i].getTitle().contains(searchTitle)) {
				System.out.println(list[i]);
			}
		}
		*/
		
		// 2) for each문 방법 (향상된 for문)
		for(Book bk : list) {
			if(bk.getTitle().contains(searchTitle)) {
				System.out.println(bk);
			}
		}
	
		
	}
	
	
	

}
