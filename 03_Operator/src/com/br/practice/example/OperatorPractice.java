package com.br.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
	
		// 키보드로 입력 받은 하나의 정수가 양수이면 "양수다", 양수가 아니면 "양수가 아니다"를 출력하세요.
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		String str = (num >= 0 ? "양수다" : "양수가 아니다");
		System.out.println(str);
					
		
	}
	
	public void practice3() {
		
		// 키보드로 입력 받은 하나의 정수가 짝수이면 "짝수다", 아니면 "홀수다"를 출력하세요.
		
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		
		String str = (num % 2 == 0 ? "짝수다" : "홀수다");
		System.out.println(str);
		
		
		
	}
	
	public void practice4() {
		
		// 인원수와 사탕개수를 입력 받고
		// 1인당 동일하게 나눠 가진 사탕개수와 나눠주고 남은 사탕의 개수를 출력하세요
		
		/*
		 * ex) 인원 수 : 29
		 * 		사탕 개수 : 100
		 * 
		 * 		1인당 사탕 개수 : 3
		 * 		남는 사탕 개수 : 12
		 */
		
		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();
	
		int a = (num2 / num1);
		int b = (num2 - (a * num1));
		
		System.out.println("1인당 사탕 개수 : " + a);
		System.out.println("남는 사탕 개수 : " + b);	
		
		
	}
	
	public void practic5() {
		
		/*
		 * 성별이 'M'이면 남학생, 'M'이 아니면 여학생을 출력
		 * 
		 * 이름 : 홍길동
		 * 학년(숫자만) : 3
		 * 반(숫자만) : 15
		 * 번호(숫자만) : 1
		 * 성별(M/F) : F
		 * 성적(소수점 아래 둘째 자리까지) : 95.75
		 * 
		 * 3학년 15반 1번 홍길동 여학생의 성적은 95.75이다.
		 * 
		 * 
		 */
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		int gr = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int cl = sc.nextInt();
		
		sc.nextInt();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.println("성적(소수점 아래둘째 자리까지) : " );
		double point = sc.nextDouble();
		
		String result = (gender == 'M'?"남학생":"여학생");
		
		System.out.printf("gr : %d");
		
		
		
		
		
	}
	


}
