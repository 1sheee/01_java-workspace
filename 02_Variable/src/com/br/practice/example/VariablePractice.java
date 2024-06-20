package com.br.practice.example;

import java.util.Scanner;

public class VariablePractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void method() {
		
		
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		sc.nextLine(); // 버퍼 비워주는 코드가 필요하다
		
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
		//System.out.println("/n더하기 결과 : " + (first + second)); - 이렇게 줄 바꿔서 쓸 수 있다.
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
		
		// 추출한 문자값을 char변수에 담은 후 출력하는 방법
//		char ch1 = str.charAt(0)
		

	}
	
	// 추가 문제 -----------------------------------------------------------------------
//	public void method5() {
//		
//		/*
//		 * 키보드로 문자 하나를 입력 받아 그 문자와 그 문자의 고유숫자 값을 출력하시오. 
//		 * 
//		 * ex) 
//		 * 
//		 * 문자 : A		 (=> 사용자가 입력한 값)
//		 * 
//		 * A 숫자값 : 65 (결과 출력)
//		 */
//		
//				
//		
//	}
//	
//	public void method6() {
//		/*
//		 * 정수형으로 국어, 영어, 수학 세 과목의 점수를 입력받아 총점과 평균을 출력하시오.
//		 * 단, 평균은 실수형으로 출력되도록 하시오. 
//		 * 
//		 * ex) 
//		 * 국어 : 90 (=> 사용자가 입력한 값)
//		 * 영어 : 91 (=> 사용자가 입력한 값)
//		 * 수학 : 85 (=> 사용자가 입력한 값)
//		 * 
//		 * 총점 : 266  	  (결과 출력)
//		 * 평균 : 88.67   (결과 출력, 반드시 소수점아래 둘째짜리까지 출력되도록)
//		 */
//		
//		
//	}
//	
//	public void method7() {
//		/*
//		 * 아래의 코드에 선언된 5개의 변수를 가지고 
//		 * 산술연산(+,-,*,/)과 형변환을 적절히 활용하여
//		 * 주석에 적힌 값과 같은 값이 나올 수 있도록
//		 * 출력문 안의 구문을 수정하시오. 
//		 * (출력문 안에 이미 쓰여져있는 변수를 활용할 것)
//		 */
//		
//		int iNum1 = 10;
//        int iNum2 = 4;
//        
//        float fNum = 3.0f; 
//        double dNum = 2.5;
//        
//        char ch = 'A';
//        
//        System.out.println( iNum1 iNum2 ); // 2
//        System.out.println( dNum ); // 2
//        
//        System.out.println( iNum2 dNum ); // 10.0
//        System.out.println( iNum1 ); // 10.0
//        
//        System.out.println( iNum1 iNum2 ); // 2.5
//        
//        System.out.println( fNum ); // 3
//        System.out.println( iNum1  fNum ); // 3
//
//        System.out.println( iNum1 fNum );// 3.3333333
//        System.out.println( iNum1 fNum ); // 3.333333333333335
//        
//        System.out.println( ch ); // 65
//        System.out.println( ch  iNum1 ); // 75
//        System.out.println( ch  iNum1 ); // 'K'
	

}
