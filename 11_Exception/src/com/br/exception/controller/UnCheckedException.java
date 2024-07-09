package com.br.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnCheckedException {
	
	/*
	 * < RuntimeException 후손클래스들 >
	 * 프로그램 실행 시 발생되는 예외클래스들
	 * 
	 * 1. IndexOutofBoundsException		: 부적절한 인덱스로 접근 시 발생되는 예외
	 * 2. NullPointException 			: 레퍼런스가 null인 상태에서 접근 시 발생되는 예외
	 * 3. ArithmeticException 			: 나누기 연산 시 0으로 나눠질 때 발생되는 예외
	 * 4. ClassCastException			: 허용되지 않는 형변환 시 발생되는 예외
	 * 5. NegativeArraySizeException 	: 배열 할당 과정에서 배열의 크기를 음수로 지정하는 경우 발생되는 예외
	 * ...
	 * 
	 * 	=> 충분히 예측가능한 상황이라 적절한 조건을 통해서 예외가 발생이 안되도록 코드 작성
	 * 		즉, 조건문으로 충분히 관리할 수 있음 (예외처리 구문이 필요 없음)
	 * 
	 */
	
	Scanner sc =new Scanner(System.in);
	
	public void method1() {
		// ArithmeticException
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		// 애초에 예외 자체가 발생이 안되도록 if문으로 조건검사
		/*
		int result = 0;
		if(num2 != 0) {
			result = num1 / num2;
		}
		
		System.out.println("결과 안내");
		System.out.println("나눗셈 결과 : " + result);
		*/
		
		// 예외처리 : 예외가 "발생 시" 실행 할 내용을 미리 정의
		/*
		 * 	* try~catch구문
		 * 	
		 * try{
		 * 		예외가 발생될 수 있는 구문;
		 * }catch(발생 될 예외클래스 매개변수){
		 * 		해당 예외가 발생됐을 경우 실행시킬 구문;
		 * }
		 */
		
		try {
			int result = num1 / num2;
			System.out.println("result : " + result);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace(); // 강제로 오류난 이력 볼 때
		}
//*		
		System.out.println("프로그램이 종료됩니다.");									
		
		
	}
	
	public void method2() {
		//	* NegativeArraySzieException
		//	* ArrayIndexOutOfBoundsException
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		
		// 예측 가능한 상황이므로 if문 조건검사를 통해 실행되도록
		/*
		if(size > 0) {
		int[] arr = new int[size];
		System.out.println("성공적으로 배열이 만들어졌습니다.");
		
		if(size>100) {
		System.out.println("99번 인덱스 : " + arr[99]);
		}
		}
		*/
		
		// 예외처리
		try {
			
			int[] arr = new int[size]; // NegativeArraySzieException
			System.out.println("성공.");
			System.out.println("99번 인덱스 : " + arr[99]); // ArrayIndexOutOfBoundsException}
		
		}catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기는 음수로 지정할 수 없습니다.");
		
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("배열에 부적절한 인덱스로 접근했습니다.");
		}
//*		//다중 catch 블럭 작성 가능
		
		System.out.println("프로그램을 종료합니다.");
		
		
	
		
		
		
		
		
	}
	
	public void method3() {
		//	* NegativeArraySzieException
		//	* ArrayIndexOutOfBoundsException
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		
		// 예외처리
		try {			
			int[] arr = new int[size]; // NegativeArraySzieException
			System.out.println("성공.");
			System.out.println("99번 인덱스 : " + arr[99]); // ArrayIndexOutOfBoundsException}
		
		}catch(RuntimeException e) { 
			System.out.println("배열의 크기가 잘 못 됐거나 부적절한 인덱스가 제시됨");
		}
//*		 // 부모 예외클래스 작성 시 모든 자식예외 발생하면 다 받아서 처리
		System.out.println("프로그램을 종료합니다.");
		

	
	}
	
	public void method4() {
		//	* NegativeArraySzieException
		//	* ArrayIndexOutOfBoundsException
		System.out.print("배열의 크기 : ");
		
		
		// 예외처리
		try {			
			int size = sc.nextInt(); // InputMismatchException
			int[] arr = new int[size]; // NegativeArraySzieException
			System.out.println("성공.");
			System.out.println("99번 인덱스 : " + arr[99]); // ArrayIndexOutOfBoundsException}
		
		}catch(InputMismatchException e) {
			System.out.println("정수가 아닌 값을 입력하셨습니다.");
		}catch(RuntimeException e) { // 부모 예외클래스 작성 시 모든 자식예외 발생하면 다 받아서 처리
			System.out.println("배열의 크기가 잘 못 됐거나 부적절한 인덱스가 제시됨");
		}
//*	    // 부모예외클래스랑 자식예외클래스를 같이 기술 할 경우
		// 자식예외클래스의 catch블럭이 위에 있어야 됨 (아니면 unreachable catch block 오류 발생)
		
		System.out.println("프로그램을 종료합니다.");		

	
	}
	
	/*
	 * 	* RuntimeException == UnCheckedException (예외처리구문이 필수는 아님)
	 *	if문 : 애초에 예외자체가 발생되기 전에 소스코드 관리
	 *	try~catch문 : 예외가 "발생됐을 경우" 처리 구문을 작성
	 */
	
	
}
