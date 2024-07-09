package com.br.exception.run;

import java.io.IOException;

import com.br.exception.controller.CheckedException;
import com.br.exception.controller.UnCheckedException;

public class ExceptionMain {
	
	/*
	 * < 에러 종류 >
	 * 
	 * 1. 시스템 에러 : 컴퓨터의 오작동으로 인해 발생되는 에러(소스코드로 해결 안됨)
	 * 2. 컴파일 에러 : 컴파일 시 발생되는 오류, 소스코드 문법상 오류(빨간줄) => 소스코드로 해결(개발자의 실수)
	 * 3. 런타임 에러 : 프로그램 실행 중 발생되는 오류, 소스코드 상에는 문제없지만 프로그램 실행 시 오류(사용자의 실수일수도, 개발자의 실수일수도)
	 * 
	 * [4. 논리 에러 : 문법적으로 문제 없고, 실행 시 문제없지만 프로그램 의도상 맞지 않는 것]
	 * 
	 * 시스템 에러를 제외한 비교적 덜 심각한 에러 == 예외 == Exception
	 * 
	 * < 예외 처리 >
	 * 위와 같은 예외가 "발생"됐을 경우 "처리"하는 방법을 정의하는 것
	 * 예외처리를 하지 않고 그대로 예외가 발생되도록 두면 프로그램이 비정상적으로 종료됨
	 * 
	 * 1. try~catch 구문
	 * 2. throws로 넘기기
	 * 
	 * > UnCheckedException	: 예외차리를 반드시 작성 안해도 됨
	 * > CheckedException 	: 예외처리를 반드시 작성
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) { //main에서마저 throws 넘기면 => JVM이 해결
		
		UnCheckedException uc = new UnCheckedException();
		//uc.method1();
		//uc.method2();
		//uc.method3();
		//uc.method4();
		
		CheckedException c = new CheckedException();
		//c.method1();
		try {
			c.method2();
		}catch(IOException e) {
			System.out.println("예외가 발생됨");
		}
		
	}

}
