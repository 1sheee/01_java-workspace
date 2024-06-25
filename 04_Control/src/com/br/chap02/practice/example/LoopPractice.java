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
			for (int i = num; i >= 1; --i) {
				System.out.print(i + " ");
			}

		} else {
			System.out.println("잘못입력함");

		}

	}
	
	public void practice4() {
		
	}
	public void practice5() {
		
	}
	public void practice6() {
		
	}
	public void practice7(){
		
	}
	public void practice8() {
		
	}
	public void practice9() {
		
	}
	public void practice10() {
	
	}
	public void practice11() {
		
	}
	public void practice12() {
		
	}
}


