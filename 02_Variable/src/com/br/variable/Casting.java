package com.br.variable;

public class Casting {

	/*
	 * < 컴퓨터에서의 값 처리 규칙>
	 * 
	 * 1. 대입연산자를 기준으로 왼쪽, 오른쪽은 동일한 타입이어야됨
	 *		즉, 같은 자료형의 값만 대입 가능함
	 *		다른 자료형의 값을 대입하고자 할 경우 자료형을 바꿔줘야됨
	 * 
	 *		[표현법] 자료형 변수명 = (자료형)값;
	 *
	 * 2. 같은 타입끼리만 연산이 가능 (연산 결과 값도 같은 자료형으로 나옴)
	 * 
	 * 		[표현법] 값 + (자료형)값
	 * 
	 * < 형변환>
	 * 값의 자료형을 바꾸는 것
	 * 
	 * 1. 자동형변환(묵시적형변환) : 자동으로 자료형이 변경됨
	 * 
	 * 2. 강제형변환(명시적형변환) : 형변환 연ㅅ나자를 통해서 자료형을 변경해야됨
	 *
	 * 3. 주의사항 : boolean은 형변환이 불가 (true or false만 가질 수 있음)
	 */
	
	public void autoCasting() {
		
		/*
		 *  < 자동형변환 > 
		 *  자료형이 다른 두 값 간의 연산(대입, 계산 등)시
		 *  자동으로 값의 범위가 작은 자료형이 큰 범위의 자료형으로 변환 돼 처리됨
		 *  
		 *  byte, short, int, long, float, double
		 */
		
		// 1. int -> double
		int i1 = 12;
		double d1 = i1;
		System.out.println("d1의 값 : " + d1);
		
		int i2 = 12;
		double d2 = 3.3;
		System.out.println(i2 + d2);  // 12.0 + 3.3 (double 자료형)
		
		// 2. int -> long
		int i3 = 1000;
		long l3 = i3;
		System.out.println(l3);
		
		long l4 = 1000000; // 자바에서의 정수리터럴은 기본적으로 int형으로 취급
		
		// 3. float -> double
		float f5 = 1.0f;
		double d5 = f5;
		
		// == 특이케이스 ==
		//long -> float
		//float은 실수형이기 떄문에 long 보다 표현 범위가 크다
		long l6 = 1000;
		float f6 = l6;
		
		// 5. char <=> int
		int num = 'A';
		char ch = 65;
		
		System.out.println("num : " + num);
		System.out.println("ch : " + ch);
		
		ch =53021;
		System.out.println("변경후 : " + ch);
		
		//6. byte 또는 short간의 연산
		byte b1 = 1;
		byte b2 = 10;
		
		//byte b3 = b1 + b2;
		// 에러발생 : byte나  short는 연산시 무조건 int형으로 처리
		
		byte b3 = (byte)(b1 + b2); // "강제형변환" 하면 저장이 가능하다
		
		
		
	}
	
	public void forceCasting() {
		// 강제형변환 : 큰 범위의 자료형을 작은 범위의 자료형으로 바꾸는 과정
		
		// 1. double -> float
		double d1 = 4.0;
		float f1 = (float)d1;
		
		float f2 = 4.0f; // f도 강제형변환 중 하나
		
		// 2. double -> int
		
		int iNum = 10;
		double dNum = 5.89;
		
		//int iSum = iNum + (int)dNum;
		
		// 해결방법 1. 연산결과를 최종적으로 int형으로 강제형변환
		int iSum = (int)(iNum + dNum); // int 15.89 -> 15 소수점 사라짐
		System.out.println("iSum의 결과 : " + iSum);
		// 해결방법 2. double형 값만을 int형으로 강제형변환
		int iSum2 = iNum + (int)dNum;
		System.out.println("iSum2의 결과 : " + iSum2);
		// 해결방법 3. 아싸리 그냥 double형 변수에 담는 방법
		double dSum = iNum + dNum;
		System.out.println("dSum의 결과 : " + dSum);
		
		// 방법1, 2는 실수값을 정수형으로 강제형변환했기 때문에 소수점 아래부분은 버림 - > 데이터 손실
		
		// ** 데이터 손실 테스트**
		int i =290;
		byte b = (byte)i;
		System.out.println("b의 결과 : " + b);	
		
		// 강제형변환은 항상 신중하게!
		
	}
	
	
}
