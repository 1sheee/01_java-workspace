package com.br.chap02.loop;

import java.util.Scanner;

public class While {
	
	Scanner sc = new Scanner(System.in);
	
	/*
	 * 
	 * while(조건식){
	 *	반복적으로 실행시키고자하는 코드;
	 * 	[증감식;]
	 * }
	 */
	
	public void method1() {
		// 안녕하세요. 5번 출력

		int i = 1;
		while (i <= 5) {// while () 안에 무조건 조건을 써줘야함
			System.out.println("안녕하세요");
			i++;
		}
		System.out.println("끝");
		System.out.println(i);
	} 
	
	public void method2() {
		// 1 2 3 4 5
		
		int i = 1;
		while(i <= 5) {
			//System.out.print(i + " ");
			//i++;
			System.out.print(i++ + " ");
		}
		
	}
	
	public void method3() {
		// 1부터 랜덤값(1~100사이의 정수)까지의 합계
		
		int random = (int)(Math.random() * 100 * 1);
		int i = 1;
		int sum = 0;
		while(i <= random) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터 " + random + "까지의 총합계 : " + sum);
	}
	
	public void method4() {
		// 무한반복문 쓰는 케이스
		
		while (true) {//for(;;) - for의 무한반복문
			System.out.println("=== 메뉴 ====\n");
			System.out.println("1. 안녕하세요 5번 출력");
			System.out.println("2. 1부터 5까지 출력");
			System.out.println("3. 1부터 랜덤값까지의 합계 출력");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 > ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				method1();
				break;
			case 2:
				method2();
				break;
			case 3:
				method3();
				break;
			case 0:
				System.out.println("이용해 주셔서 감사합니다.");return;
			default:
				System.out.println("메뉴오류, 재입력요청");
			}
		}
		
		
	}
}
