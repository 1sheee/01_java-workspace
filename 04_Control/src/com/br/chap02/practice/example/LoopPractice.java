package com.br.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			for(int i = 1;i <= num ;i++) {
				System.out.print(i + " ");
			}
			
		}else {
			System.out.println("잘못입력함");
			}
		
	}
	
	public void practice2() {
		
		
		while(true) {
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			for(int i = 1;i <= num ;i++) {
				System.out.print(i + " ");
			}break;
			
		}else {
			System.out.println("잘못입력함");
			}
		}
		
		
	}
	
	public void practice3() {
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}

		} else {
			System.out.println("잘못입력함");

		}

	}
}

