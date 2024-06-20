package com.br.operator;

import java.util.Scanner;

public class Logical {
	
	/*
	 *  < 논리연산자 (이항연산자) >
	 *  논리값을 연산해주는 연산자 => 결과값 마저 논리값이 나온다.
	 *  
	 *  논리값 && 논리값 : AND 연산자, 즉 왼쪽 오른쪽 둘 다 true일 경우 최종값을 true로 만들어준다
	 *  논리값 || 논리값 : OR 연산자, 왼쪽 또는 오른쪽 둘 중에 하나라도 true일 경우 최종 결과값은 true
	 *  
	 *  => 주로 여러개의 조건을 연결시켜서 하나의 조건으로 만들고자 할 때 사용
	 *  
	 *  
	 *  
	 */
	
	public void method1() {
		// 사용자가 입력한 정수값이 1부터 100사이의 값인지 확인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		// num값이 1이상 100이하인지 비교
//		boolean result = (1 <= num <= 100);
		boolean result = (num >= 1 && num <= 100);
		
		System.out.println("사용자가 입력한 값이 1이상 100이하입니까 : " + result); // 보통 비교대상을 왼쪽에 쓰는 것을 권장
		
	}
	
	public void method2() {
		// 사용자가 입력한 문자값이 영문 대문자인지 확인
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		// 'A' ~ 'Z' 실제로 컴퓨터에서는 65 ~ 90
		boolean result = (ch >= 65 && ch <= 90);
		// boolean result = (ch >= 'A') && (ch <= 'Z');
		
//		System.out.println("사용자가 입력한 X값이 영문 대문자입니까 : " + result);
		System.out.println("사용자가 입력한 " + ch + "문자는 대문자입니까 : " + result);
		
		
	}
	
	public void method3() {
		// 사용자에게 성별을 입력받은 후 M OR F 남자인지 확인

		Scanner sc = new Scanner(System.in);
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0); // M, F
		
		boolean result = (gender == 'm' || gender == 'M'); // || or : ~이거나, 또는
		System.out.println("사용자가 남자입니까 : " + result);
		System.out.println("사용자가 여자입니까 : " + !result);
		
	}
	
	public void method4() {
		// 사용자에게 종료의사를 입력받고 확인
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종료하시려면 y를 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		boolean result = (ch == 'y' || ch == 'Y');
		System.out.println("\n사용자가 종료의사를 밝혔습니까 : " + result);
		
	}
	
	/*
	 * && : 두개의 조건이 조건이 모두 true여야 결과값이 true
	 * ㄴ 앞쪽 조건 기준으로 앞의 결과값이 false일 경우 뒤의 조건은 굳이 실행이 안된다.
	 * 
	 * || : 두개의 조건 중 하나라도 true라면 결과값이 true
	 * ㄴ 앞쪽 조건 기준으로 앞의 결과값이 true일 경우 뒤의 조건은 굳이 실행이 안된다.
	 * 
	 */
	
	public void method5() {
//		Dead Code - 절대 실행될 일 없는 코드, 불필요한 코드
//		System.out.println(false && true); 
//		System.out.println(true || false);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num =sc.nextInt();
		boolean result = ((num <5) && (++num >0));
		
		System.out.println("num : "+ num);
		System.out.println("result : " + result);
		
	}
	
	
	
	

}
