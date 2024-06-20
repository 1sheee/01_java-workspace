package com.br.operator;

public class Arithmetic {
	/*
	 * < 산술연산자 (이항연산자) >
	 * 			*    /    %   >   +      -
	 */
	
	public void method1() {
		
		int num1 = 10;
		int num2 = 3;
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		
//		System.out.println(num1 / 0); 0으로 나누려고 하는 순간 ArithmeticException 발생
		
		System.out.println(num1 + num2 * num1 - num2 / num1);
		System.out.println((num1 + num2) * (num1 - num2) / num1);
		
	}
	
	public void method2() {
		
		int a = 5;
		int b = 10;
		int c = (++a) + b;
		int d = c / a ;
		int e = c % a;
		int f = e++;
		int g = (--b) + (d--);
		int h= 2;
		
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		
		
	}

}
