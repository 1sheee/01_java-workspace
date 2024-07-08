package com.br.chap04_date;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateTimeMain {

	public static void main(String[] args) {
		
		/*
		 * < java.time.LocalDate|LocalTime|LocalDateTime >
		 * 
		 * 1. 자바 8이상부터 사용 가능 클래스
		 * 2. 날짜만 또는 시간만 또는 둘 다의 정보를 가질 수 있음
		 * 3. 생성자가 정의 X, 객체 생성 불가
		 * 		ㄴ static 메소드인 now() : 현자 날짜 및 시간정보를 가져올 수 있음
		 * 		ㄴ static 메소드인 of() : 특정 날짜 및 시간 정보를 설정할 수 있음
		 * 		
		 */

		// * LocalDate -------------------------------------
		LocalDate date1 = LocalDate.now();
		System.out.println(date1);
		
		System.out.println(date1.getYear());
		System.out.println(date1.getMonth());
		System.out.println(date1.getMonthValue());
		System.out.println(date1.getDayOfMonth());
		
		LocalDate date2 = LocalDate.of(2024, 12, 11);
		System.out.println(date2);
		
		System.out.println("================");
		
		// * LocalTime --------------------------------------------
		LocalTime time1 = LocalTime.now(); // 현재 시간에대한 정보
		
		System.out.println(time1); // 24시형식 시 : 분 초 : 맨 마지막 붙은 긴 숫자는 n\s - 12:45:03.393957200
		System.out.println(time1.toString().substring(0,8)); // - 12:45:03 나노초만 떼었음.
		
		LocalTime time2 = LocalTime.of(13, 30, 20); // 시:분:초
		System.out.println(time2); // 나노초가 0일 경우 아래구문이 출력 안된다.
		
		System.out.println("================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
