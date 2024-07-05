package com.br.chap03_interface.model.vo;

public interface Behavior { // 인터페이스도 클래스의 일종
	
		// 오로지 상수필드랑 추상메소드만 작성
	/*public static final*/ int NUM = 10;
	// 묵시적 인식
	// 인터페이스 선언 시 상수필드로 인식해서
	
	//인터페이스로 선언 시
	// 메소드 작성은 무조건 추상메소드로 인식
	//생략가능 /*public abstract*/ 
	void eat();
	public abstract void sleep();
	
}
