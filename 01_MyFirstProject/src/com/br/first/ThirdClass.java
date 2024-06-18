package com.br.first;

/*
 * 1. 패키지명 : 소문자로 시작 
 * 2. 클래스명 : 대문자로 시작
 * 3. 메소드명 : 소문자로 시작
 * 4. 변수명 : 소문자로 시작
 * 
 * < 식별자의 이름 규칙 (표기법) >
 * 1. 파스칼 : 각 단어의 첫 글자는 대문자, 나머지는 소문자
 * 2. 카멜 : 파스칼과 비슷, 첫 글자는 소문자로 (메소드명, 변수명)
 * 3. 스네이크 :각 단어의 연결을 언더바로 표시 (상수명, 폴더명)
 * 
 */

public class ThirdClass { // 풀클래스명 : com.br.first.ThirdClass
	
	public void javaValue( ) { // com.br.first.ThirdClass.javaValue
		
		// 1. 숫자 (정수값, 실수값)
		System.out.println(123);
		System.out.println(1.23);
		
		
		// 2. 문자 (한글자) : 홑따옴표와 함께
		System.out.println('A');
		//System.out.println('ABC');
		
		// 3. 문자열 (여러글자) : 쌍따옴표와 함께, 한글자도 가능
		System.out.println("\"안녕\"하\t세요");
		System.out.println("B");
				
		// 4. 논리값
		System.out.println(true);
		System.out.println(false);
		
		// 번외 연산결과 출력
		// 숫자간의 산술연산
		System.out.println(123 + 456);
		System.out.println(1.23 - 0.12); // 컴퓨터에서 실수값 연산은 불완전해서 오차가 생길 수 있다.
		
		// 문자와 숫자간의 연산결과
		// 'A' == 65
		System.out.println('A' + 1);
		System.out.println('A' - 1);
		// 각 문자들 마다 컴퓨터가 인식하는 고유 숫자값 존재
		
		// 문자열과 그 외 값 간의 연산 결과(덧셈만 가능)
		System.out.println("A" + 1);
		System.out.println(1 + "A");
		System.out.println("안녕" + true);
		System.out.println("안녕" + 1 + 2 + '!');
		System.out.println(1 + 2 + "잘가" + (3 + 4));
	}

}
