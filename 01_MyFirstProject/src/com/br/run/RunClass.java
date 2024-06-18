package com.br.run;

import com.br.first.SecondClass;
import com.br.first.ThirdClass;

public class RunClass {
	
	public static void main(String[] args) {
		// 메소드 호출 : 메소드명();
		
		//methodA();
		
		/*
		 *  < 다른 클래스 정의 메소드 호출 방법 >
		 *  
		 *  1. 해당 클래스 생성(new) 하기
		 *  [표현법] 클래스명 사용할이름 = new 클래스명();
		 *  
		 *  2. 생성된 해당 클래스를 통해서 메소드를 호출
		 *  [표현법] 사용할이름.메소드명();
		 */
		
		// 클래스명 빨간줄 이유 : 다른패키지에 존재 해서 - 곧 바로 찾을 수 X
		//SecondClass second = new SecondClass ();
		
		// 다른패키지 클래스 사용 방법
		// 1. 해당 클래스가 어떤 패키지 안에 있는지 표기 (풀클래스명)
		//com.br.first.SecondClass second = new com.br.first.SecondClass ();
		
		
		// 2. import문으로 한번만 선언
		SecondClass second = new SecondClass ();
		
		//메소드 호출
		/*
		second.methodA();
		second.methodB();
		second.methodC();
		*/
		//------------------------------------------------------
		
		// ThirdClass에 javaVlaue 메소드 호출
		
		ThirdClass third = new ThirdClass();
		
		third.javaValue();
		
		
		
		
	}

}
