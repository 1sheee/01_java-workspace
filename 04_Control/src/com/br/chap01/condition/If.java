package com.br.chap01.condition;

import java.util.Scanner;

public class If {
	
	Scanner sc = new Scanner(System.in);
	
	/*
	 * 프로그램의 진행은 위에서부터 아래로 순차적으로 진행
	 * 
	 * 소스코드1;
	 * 
	 * 조건문(){
	 * 소스코드2; // 선택적으로 실행 => 조건문
	 * }
	 * 
	 * 반복문(){
	 * 소스코드3; // 반복적으로 실행 => 반복문
	 * }
	 * 
	 * 소스코드4;
	 * 
	 * 
	 * 
	 * 
	 * < 조건문 >
	 * 조건식을 제시해서 참이나 거짓이냐를 판단해서
	 * 해당 조건이 참일 경우 그에 해당하느 구문을 실행
	 * 
	 * 조건식은 반드시 true/false로 나오도록 작성
	 * 
	 * 1. if문 (단독if문 / if-else문 / if-else if문)
	 * 2. switch문
	 * 
	 */
	
	/*
	 *  * 단독 if문
	 *  
	 *  if(조건식) {
	 *	선택적으로 실행 시키고자 하는 코드;
	 *  
	 *  }
	 *  
	 */
	
	public void method1() {
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다");
		}
		
		if(num <= 0 ) {
			System.out.println("양수가 아니다");
		}
		
		
	}
	
	/*
	 * * if-else문
	 * 
	 * if(조건식) {
	 * 	해당 조건이 참일 경우 실행코드;
	 * }else {
	 * 	해당 조건이 거짓일 경우 실행코드;
	 * }
	 */

	public void method2() {
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("양수다");
		}else {
			System.out.println("양수가 아니다");
		}
		
	}
	
	/*
	 * if-else if문
	 * 
	 * 같은 비교대상으로 여러개의 조건을 제시해야 될 경우
	 * 
	 * if(조건식1){
	 * 	조건식 1이 참일 경우 실행코드;
	 * }else if(조건식2){
	 * 	조건식2가 참일 경우 실행코드;
	 * }else if(조건식3){
	 * 	조건식3이 참일 경우 실행코드;
	 * }[else{
	 * 	우의 조건들이 false일 경우 실행코드;
	 * }] - 필수는 아님!
	 * 
	 */
	
	public void method3() {
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num < 0 ) {
			System.out.println("음수다");
		} else if(num == 0) {
			System.out.println("0이다");
		} else if(num > 0) {
			System.out.println("양수다"); // else로 묶어도 됨
		}
		
	}
	
	public void method4() {
		
		/*
		 * 나이 입력받아
		 * 13세 이하 : 어린이
		 * 14세 초과 19세 이하 : 청소년
		 * 19세 초과 : 성인
		 */
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		/*
		if(age <= 13) {
			System.out.println("어린이");
		} else if(age < 19) { // age가 13초과는 이미 내제
			System.out.println("청소년");
		} else {
			System.out.println("성인");
		}
		*/
		//변수 활용 방법
		
		String result;
		
		if(age >= 0 && age <= 120) { // 유효한 범위로 나이값을 잘 입력함
		
			if(age <= 13) {
				result = "어린이";
			}else if(age <= 19) {
				result = "청소년";
			}else {
				result = "성인";
			}
			System.out.println(result);
			
		}else {
			System.out.println("나이를 잘 못 입력하셨습니다. 0 ~ 120 내에 숫자를 입력해야 합니다.");
		}
		
				//조건 검사가 끝난 후 result에 그에 맞는 결과값이 담겨있다
		
		
		
		
	}
	
	public void method5() {
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		// ㅇㅇㅇ님은 남학생이다.
		// ㅇㅇㅇ님은 여학생이다.
		
		/*
		if(gender == 'M') {
			System.out.println(name + "님은 " + "남학생이다.");
		} else if (gender == 'F') { // 좀 더 정확하게 표한하기 위해 else if
			System.out.println(name + "님은 " + "여학생이다.");
		} 
		*/
		
		String result= ""; // 변수를 미리 세팅 할 때 초기화하는 습관을 들이자
		
		if(gender == 'M') {
			result = "남학생";
		} else if (gender == 'F') { // 좀 더 정확하게 표한하기 위해 else if
			result = "여학생";
		} else {
			System.out.println("성별을 잘 못 입력하였습니다.");
			return; // 현재 속한 메소드를 빠져나가는 구문 ( 이 후 구문 수행 안한다.)
		} 
		
		System.out.println(name + "님은 " + result + "이다.");
	}
	
	public void method6() {
		
		// 사용자에게 이름 입력 받아
		// 홍길동과 일치할 경우 => "반갑습니다."
		// 아닐경우 "안녕히가세요."
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		if(name.equals("홍길동")) { //(name == "홍길동") X 
			System.out.println("반갑습니다.");
		} else {
			System.out.println("안녕히가세요.");
		}
		
		/* 
		 * 기본자료형 : boolean 1, byte 1, short 2, int 4, long 8, float 4, double 8, char 2  - 8가지
		 * 참조자료형 : String, ... 기본자료형을 제외한 나머지 자료형들
		 * 
		 * 기본자료형들끼리는 동등비교 시 == != 사용가능 (비교된다)
		 * 참조자료형들끼리는 동등비교 시 == != 사용 시 정상적 비교는 안된다.
		 * 		=> equals() 메소드를 이용해서 비교하면됨.
		 * 		=> 문자열.equals(문자열)
		 * 		=> !문자열.equals(문자열) <> 일치하지 않는 문자열 비교는 이렇게
		 * 
		 */
		
		
		
	}
	
	public void method7() {
		
		/*
		 * 사용자가 입력한 정수값이 양수가 아닐 경우 => "양수가 아닙니다."
		 * 							양수일 경우 => 이떄 3의 배수일 경우 => "3의 배수입니다."
		 * 							아닐 경우 => "3의 배수가 아닙니다" 출력
		 * 
		 */
		
		System.out.print("정수(양수) : ");
		int num = sc.nextInt();
		
		if(num > 0 ) {
			if(num % 3 == 0) {
				System.out.println("3의 배수입니다.");
			}else {
				System.out.println("3의 배수가 아닙니다.");
			}
			
		}else {
			System.out.println("양수가 아닙니다. 잘 못 입력");
		}
		
		
	}
	
	public void method8() {
		
		/*
		 * 사용자에게 점수, 학년을 입력 받아 합격, 불합격 여부를 출력
		 * 
		 * 1~3학년 : 60점이상이면  합격, 아니면 불합격
		 * 4~6학년 : 70점이상이면 합격, 아니면 불합격
		 * 
		 */
		
		System.out.print("점수 : ");
		int point = sc.nextInt();
		System.out.print("학년 : ");
		int gr = sc.nextInt();

		
		
//		if (gr >= 1 && gr <= 3) {
//			if (point >= 60) {
//				System.out.println("합격");
//			} else {
//				System.out.println("불합격");
//			}
//
//		} else if (gr >= 4 && gr <= 6) {
//			if (point >= 70) {
//				System.out.println("합격");
//			} else {
//				System.out.println("불합격");
//			}
//
//		}
		
		int pass = 0; // 합격점수 ( 60 || 70 )
		if(gr >= 1 && gr <= 3) {
			pass = 60;
		}else if(gr >= 4 && gr <= 6) {
			pass = 70;
		}
		//pass 변수에는 학년에 따른 합격 점수값이 담겨있다.
		
		if(point >= pass) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

	}//ctrl + shft + F 중괄호 정렬 시켜준다.
	
}
