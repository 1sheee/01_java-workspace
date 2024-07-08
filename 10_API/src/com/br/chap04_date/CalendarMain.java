package com.br.chap04_date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain {

	public static void main(String[] args) {
		
		/*
		 * 	< java.util.Calendar >
		 * 
		 * 1. 날짜 및 시간에 대한 정보를 가질 수 있는 클래스
		 * 2. 단, 추상클래스이므로 객체 생성은 불가함
		 * 		국가별, 시간대별로 구체화시켜둔 자식 클래스들이 존재함
		 * 		다형성 적용시켜 자식 객체를 사용하면 됨
		 * 
		 */
		
		// * 현재 시스템 날짜 및 시간 정보로 설정
		// Calendar today = new Calendar();
		
		// 방법1. 우리나라에 맞는 GregorianCalendar 객체를 직접 생성
		//Calendar today = new GregorianCalendar();
		//System.out.println(today);
		
		// get 메소드로 현재 날짜 및 시간 정보 따로 알아보기
//		int year = today.get(1); // int year = today.get(Calendar.YEAR); - 까먹으면 이렇게 알 수 있다.
//		int month = today.get(2) + 1 ; // 1월(0) ~ 12월(11)
//		int date = today.get(5);
//		int ampm = today.get(Calendar.AM_PM);
//		int hour12 = today.get(Calendar.HOUR);
//		int hour24 = today.get(Calendar.HOUR_OF_DAY);
//		int minute = today.get(Calendar.MINUTE);
//		int second = today.get(Calendar.SECOND);
		
		System.out.println("//4교시////////////////////////////////////////////////////////////////////////////////");
		
		// 방법2. Calendar에서 제공하는 getIntance static메소드를 이용
		
		Calendar today = Calendar.getInstance();
		int year = today.get(1); // int year = today.get(Calendar.YEAR); - 까먹으면 이렇게 알 수 있다.
		int month = today.get(2) + 1 ; // 1월(0) ~ 12월(11)
		int date = today.get(5);
		int ampm = today.get(Calendar.AM_PM);
		int hour12 = today.get(Calendar.HOUR);
		int hour24 = today.get(Calendar.HOUR_OF_DAY);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		
		System.out.printf("%d년 %d월 %d일 %d %d(%d)시 %d분 %d초 \n",
							year, month, date, ampm, hour12, hour24, minute, second);
		
		System.out.println("=======================");
		
		// * 내가 원하는 특정 날짜 및 시간으로 설정 ---------------------------------
		// 방법1. 우선 생성 후 set으로 수정하기
		Calendar cal1 = Calendar.getInstance();
		
		cal1.set(Calendar.YEAR, 2024);
		cal1.set(Calendar.MONTH, 6-1); // 0에서부터 카운트 해서
		cal1.set(Calendar.DATE, 17);
		
		// 한큐에
		cal1.set(2024, Calendar.JUNE, 17);
		
		System.out.println(cal1);
		
		// 방법2. 객체 생성 시 바로 값 전달하기
		Calendar cal2 = new GregorianCalendar(2024, Calendar.JUNE, 17, 15, 30, 20);
		System.out.println(cal2);
		
		
		
		
		
	}

}
