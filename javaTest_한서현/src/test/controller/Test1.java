package test.controller;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력 해주세요 : ");
		int a = sc.nextInt();
		
		if(a > 0 && a <= 100 && a % 2 == 0) {
			System.out.println("2의 배수입니다.");
		}else {
			System.out.println("2의 배수가 아닙니다.");
		}
		
	}

}
