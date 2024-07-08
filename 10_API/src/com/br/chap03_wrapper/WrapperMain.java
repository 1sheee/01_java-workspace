package com.br.chap03_wrapper;

import java.util.Scanner;

public class WrapperMain {

	public static void main(String[] args) {

		/*
		 * < Wrapper 클래스 >
		 * 기본자료형을 객체로 포장시킬 수 있는 클래스
		 * 즉, 기본자료형을 Wrapper클래스를 통해 객체화 시킬 수 있음
		 * 
		 * * 기본자료형을 객체로 취급해야 될 경우
		 * 1) 기본자료형 데이터를 통해서 메소드를 호출하고자 할 경우
		 * 2) 메소드의 매개변수로 기본자료형이 아닌 객체 타입만이 요구 될 경우
		 * 3) 다형성을 적용시키고 싶을 때
		 * 
		 *		기본자료형 <--> Wrapper - 총 8개
		 * 		boolean			Boolean
		 * 		char			Character	**
		 * 		byte			Byte
		 * 		short			Short
		 * 		int				Integer		**
		 * 		long			Long
		 * 		float			Float
		 * 		double			Double
		 * 
		 */
		
		// * Boxing : 기본자료형 => Wrapper 클래스 자료형 (객체화) ------------------
		int num1 = 10;
		int num2 = 15;
		
		// 방법1. 객체 생성구문을 통한 방법	(jdk9버전 이상부터 deprecated => 권장x)
		 Integer i1 = new Integer(num1); // num1 => i1
		 Integer i2 = new Integer(num2); // num2 => i2
		 
		 System.out.println(i1);
		 System.out.println(i2);
		 
		 System.out.println(i1.equals(i2));
		 System.out.println(i1.compareTo(i2)); // 두 값을 비교해서 앞쪽이 크면 1반환
		 
		 // 방법2. 단순 대입을 통한 방법 (AutoBoxing)
		 Integer i3 = num1;
		 Integer i4 = 15;
		
		 System.out.println(i3);
		 System.out.println(i4);
		 
		 // 번외. 문자열데이터("123")를 Wrapper클래스 객체화
		 
		 //Integer i5 = "123"; - 오류
		 //Integer i5 = new Integer("123"); // "123" -> 123 권장은 x
		 Integer i5 = Integer.valueOf("123");	 
		 System.out.println(i5);
		 
		 System.out.println("=================");
		 System.out.println("//3교시////////////////////////////////////////////////////////////////////////////////");
		 
		// * UnBoxing : wrapper 클래스 자료형 => 기본자료형 -------------------------
		// 방법1. Wrapper 클래스의 xxxValue 메소드 이용 방법
		 int num3 = i3.intValue(); // i3 => num3
		 int num4 = i4.intValue(); // i4 => num4
		 
		 System.out.println(num3);
		 System.out.println(num4);
		 
		 // 방법2. 단순 대입을 통한 방법 (AutoUnBoxing)
		 int num5 = i5;
		 
		 System.out.println(num5);
		 
		 System.out.println("=================");
		 
		 // **************** 기본자료형 <--> String ****************
		 String str1 = "10";
		 String str2 = "15.3";
		 
		 System.out.println(str1 + str2); // 문자열로 작업
		 
//*****  // 1. String --> 기본자료형 (파싱한다)
		 // 	Wrapper클래스.parseXXX(변환시키고자하는 문자열)
		 //		"10"  --> 10 (int자료형)
		 //		"15.3"--> 15.3 (double자료형)
		 int i = Integer.parseInt(str1);
		 double d = Double.parseDouble(str2);
		 
		 System.out.println(i+ d);
		 // 웹에서는 화면으로부터 입력된 값을 자바측으로 넘어올 때
		 // 무조건 넘어옴 => 기본자료형 변수에 대입시키고자 할 때 (파싱해야됨!!)
		 
		 // 2. 기본자료형 --> String
		 //			10    --> "10"
		 //			15.3  --> "15.3"
		 String strI = String.valueOf(i);
		 String strD = String.valueOf(d);
		 
		 System.out.println(strI);
		 System.out.println(strD);
		 
		 Scanner sc =new Scanner(System.in);
		 
		 System.out.print("나이 : ");
		 int age = Integer.parseInt(sc.nextLine()); // "10" -> 10
		 System.out.println(age);
		 
		 System.out.print("키 : ");
		 double height = Double.parseDouble(sc.nextLine());
		 System.out.println(height);
		 
		
	}

}
