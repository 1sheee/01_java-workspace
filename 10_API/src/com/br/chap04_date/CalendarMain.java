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
		Calendar today = new GregorianCalendar();
		System.out.println(today);
		
		// get 메소드로 현재 날짜 및 시간 정보 따로 알아보기
		int year = today.get(1); // int year = today.get(Calendar.YEAR); - 까먹으면 이렇게 알 수 있다.
		int month = today.get(2) + 1 ; // 1월(0) ~ 12월(11)
		int date = today.get(5);
		int ampm = today.get(Calendar.AM_PM);
		int hour12 = today.get(Calendar.HOUR);
		int hour24 = today.get(Calendar.HOUR_OF_DAY);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		
		
	}

}
