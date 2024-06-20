package com.br.operator;

import java.util.Scanner;

public class Triple {
	
	/*
	 * < 삼항 연산자 >
	 * 
	 * 조건식 ? 참일경우 돌려 줄 결과값 : 거짓
	 * 
	 * 
	 */
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		// 입력 받은 정수값이 양수인지 아닌지 판별 후 출력
		
		System.out.print("정수값 : ");
		int i = sc.nextInt();
		
//		System.out.println( i >0 ? "양수이다" : "양수가 아니다" );
		
		String str = (i >0 ? "양수이다" : "양수가 아니다");
//		System.out.println(str);
		System.out.println(i + "은" + str);
		
	}
	
	public void method2() {
		// 입력받은 정수값이 짝수인지 홀수인지 판별 후 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 != 0 ? "홀수" : "짝수");
		System.out.println("정수의 값은 " + result);
		
			
	}
	
	public void method3() {
		
		// 사용자에게 종료의사 입력 받아서 판별해서 출력
		// 사용자가 입력한 문자값이 소문자 y, Y일 경우 "프로그램 종료합니다." 출력
		// 그게 아니면 계속 진행하겠습니다 나오게끔
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종료하시겠습니까 ? : ");
		char ch = sc.nextLine().charAt(0);
		boolean result1 = (ch == 'y' || ch =='Y');
		String result2 = (result1 ? "프로그램 종료합니다." : "계속 진행하겠습니다");
		System.out.println(result2);
		
	}
	
	public void method4() {
		// 입력 받은 문자값이 영문자인지 아닌지 판별해서 출력
		// 사용자가 입력한 문자값이 영문자(소문자 또는 대문자)일 경우 "영문자이다."출력
																		//그게 아닐경우 "영문자가 아니다"출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자값을 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		String result2 = ((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z') ? "영문자이다." : "영문자가 아니다.");
		System.out.println(result2);
		
		
		
		
	}
	
	

}
