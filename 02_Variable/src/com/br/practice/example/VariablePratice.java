package com.br.practice.example;

import java.util.Scanner;

public class VariablePratice {
	
	Scanner sc = new Scanner(System.in);
	
	public void method() {
		
		
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.print("키 " + height + "인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다^^");
	}
	
	public void method2() {
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int first = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		int second = sc.nextInt();
		
		System.out.println();
		System.out.println("더하기 결과 : " + (first + second));
		System.out.println("빼기 결과 : " + (first - second));
		System.out.println("곱하기 결과 : " + (first * second));
		System.out.println("나누기 몫 결과 : " + (first / second));
		
	}
	
	public void method3() {
		
		System.out.print("가로 : ");
		double x = sc.nextDouble();
		System.out.print("세로 : ");
		double y = sc.nextDouble();
		
		System.out.println();
		System.out.println("면적 : " + (x*y));
		System.out.println("둘레 : " + ((x+y)*2));
		
		
	}
	
	public void method4() {
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		System.out.println();
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
		
	}
	

}
