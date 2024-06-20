package com.br.operator;

public class Compound {
	
	/*
	 * < 복합 대입 연산자 >
	 * 산술연산자와 대입연산자가 결합된 형태
	 * 연산처리 속도가 빨라지기 때문에 사용하는걸 권장
	 * 
	 * += -= *= /= %=
	 */
	
	public void method1() {
		
		int num1 = 12;
		
		num1++;
		
		System.out.println(num1);
		
		num1 = num1 + 3; 
		System.out.println(num1);
		
		num1 +=3;
		System.out.println(num1);
		
		num1 -=5;
		System.out.println(num1);
		
		num1 *=3;
		System.out.println(num1);
		
		num1 /=2;
		System.out.println(num1);
		
		num1 %=4;
		System.out.println(num1);
		
		String str = "hello";
		//str = str + "World";
		str += "World";
		//문자산술연산은 +만 가능하다.
		System.out.println(str);
		
		System.out.println(str += "ttt");
		
	}

}
