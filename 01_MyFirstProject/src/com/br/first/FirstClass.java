package com.br.first; // 패키지 선언부 - 지우면 안된다.

public class FirstClass { // 진짜 클래스명 : com.br.first.FirstClass - 풀클래스명

	// single-line comment(주석) : 소스코드와 무관한 내용을 기술한다. / 코드로써 인직되지 않음.	
	
	/*
	 * multi-line comment
	 * 여러줄 주석
	 * 
	 * 1. 프로젝트 만들기
	 * 2. 패키지 만들기
	 * 3. 클래스 만들기
	 * 4. 클래스 내에 소스코드 작성
	 * 
	 * 프로젝트
	 * 		ㄴ 패지키1
	 * 			ㄴ 클래스1_1
	 * 			ㄴ 클래스1_2
	 * 				...
	 * 			ㄴ 패키지1_2
	 * 		ㄴ 패키지2
	 * 			ㄴ 패키지2_1
	 * --------------------------------------
	 * 
	 * public class 클래스 명 {
	 *		// 메소드 == 기능 
	 *  }
	 *  
	 *  
	 *  	메인메소드(실행용메소드) {
	 *  		소스코드;
	 *  }
	 *  
	 */
	/*
	 * 
	 * < 메인메소드 > 
	 * 1. 최초실행
	 * 2. 한개이상 존재 해야됨
	 * 3. 작성형식 public static void main(String[] args) {소스코드} - 메소드의 머리부
	 * 
	 */
	
	public static void main(String[] args) {
		
			System.out.println(1);
			System.out.println(2);
			System.out.print('A');
			System.out.print('B');
			System.out.println("CD\nEF");
			System.out.printf("안녕하세요 %s에 오신걸 환영합니다. \n%d월 %d일 까지 잘해봐요~~\n", "구디아카데미", 12, 11);
			//System.out.println();
			System.out.println("hello");
			
			
			/*
			 * 
			 * < 출력문 >
			 * 특정 값 출력하고자 할 때 명령문
			 * 1. println(출력값);						: 값 출력 후 줄바꿈
			 * 2. print(출력값);						: 값 출력만
			 * 2. printf(포맷, [출력값, ...]);			: 형식(포맷) 기반으로 값들을 출력 (줄 바꿈 x)
			 * 
			 * 
			 */
	}
	
	
	
	
	
	
	
	
	
	
}
