package com.br.variable;

public class Variable {
	
	/*
	 * < 메모리 >
	 * 
	 * 1. 램
	 * 2. 자바 프로그램이 동작할 때, 필요한 값들이 저장되는 장소
	 * 3. 휘발성이기 때문에 프로그램 종료 시 메모리 상에 존재하는 것들은 사라짐
	 * 4. 특정값을 메모리상에 기록하고자 할 경우 변수라는걸 먼저 메모리에 만들어야함
	 * 
	 */
	
	public void whyUseVariable() {
		
		System.out.println("변수 사용 전");
		System.out.println(9860 * 8);
		System.out.println(9860 * 8 * 5);
		System.out.println(9860 * 8 * 5 * 4);
		System.out.println(9860 * 8 * 5 * 4 * 0.1);
		
		/*
		 * < 변수 >
		 * 특정 값을 메모리 상에 기록하기 위한 공간(박스)
		 * 
		 * 
		 * 
		 */
		
		int pay = 10000;
		int hour = 7;
		int day = 5;
		int week = 4;
		double tax = 0.1;
		
		System.out.println("변수 사용 후 ");
		System.out.println(pay * hour);
		System.out.println(pay * hour * day);
		System.out.println(pay * hour * day * week);
		System.out.println(pay * hour * day * week * tax);
		
		/*
		 * < 변수 사용 이유>
		 * 
		 * 1. 값에 의미 부여 (가독성이 좋아짐)
		 * 2. 자주 사용하는 값을 변수에 담아두면 동일한 값을 계속 사용할 수 있음
		 * 3. 유지보수에 용이하다
		 * 
		 */
		
		System.out.println("안녕하세요, 여러분");
		
		
	}
	
	public void declareVariable() {
		
		
		/*
		 * 
		 *  < 변수 선언 및 값 대입 >
		 *  
		 *  1. 변수 선언
		 *  	저장할 값을 기록하기 위한 변수를 메모리 공간에 확보해 놓는 과정
		 *  
		 * 		 [표현법] 자료형 변수명;
		 *  
		 *  2. 변수에 값 대입
		 *  
		 *  	[표현법] 변수명 = 값;
		 *  
		 *  3. 변수 선언과 동시에 값 대입 (초기화)
		 *  
		 *  	[표현법] 자료형 변수명 = 값;
		 *  
		 *  - 자료형 : 어떤 값을 담아낼건지, 어떤 크기의 값을 담아낼건지에 따라서 변수의 크기 및 모양을 정하는 부분
		 *  - 변수명 : 변수의 이름을 정하는 부분 (의미 부여)
		 *  
		 * 
		 */
	
	
	/*
	 * < 기본자료형 > (primitive type)
	 * 1. 논리형 : boolean (1byte)
	 * 2. 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
	 * 3. 실수형 : float(4byte), double(8byte)
	 * 4. 문자형 : char(2byte)
	 * 
	 * < 참조자료형> (reference type)
	 * 1. 문자열 : String
	 * ... 기본자료형을 제외한 모든 자료형들 ..
	 * 
	 * 
	 */
	
	boolean bool1; // 변수 선언
	bool1 = true; // 변수에 값 대입
	boolean bool2 = false; // 변수 선언과 동시에 초기화
	
	System.out.println("불1 값 : " + bool1);
	System.out.println("불2 값 : " + bool2);
	
	byte b = 100; // -128 ~ 127
	short s = 32000; // -32xxx ~ 32xxx
	int i = 2100000000; // -21억대 ~ 21억대 => 정수형중에 대표자료형
	long l = 1000000000l; // 엄청크다
	
	System.out.println("b의 값 : " + b);
	System.out.println("s의 값 : " + s);
	System.out.println("i의 값 : " + i);
	System.out.println("l의 값 : " + l);
	
	float f = 4.123456789123f; // 4바이트
	double d = 4.123456789123; // 8바이트 => 실수형 중 가장 대표적인 자료형 ( 좀 더 정확한 값을 담을 수 있어서)
	
	System.out.println("f의 값 : " +  f );
	System.out.println("d의 값 : " +  d );
	
	char c1 = 'a'; // 0 ~ 65xxx
	char c2 = '힇';
	
	System.out.println("c1의 값 : " + c1);
	System.out.println("c2의 값 : " + c2);
		System.out.println("c1의 숫자값 : " + (int)c1);
		System.out.println("c2의 숫자값 : " + (int)c2);
		
	System.out.println((int) '강');
	
	String str = "안녕하세요"; // 참조자료형
	System.out.println("str의 값 : " + str );
	
	
	}

	
	public void namingRule( ) {
		/*
		 * < 변수 명명 규칙>
		 * 
		 * 1. 동일한 영역 {} 내에서 중복된 변수 선언 불가
		 * 2. 예약어(자바에서 이미 사용하고 있는 키워드들) 사용 불가
		 * 	ㄴ ex) public, void ...
		 * 3. 숫자 사용가능 (단, 숫자로 시작은 불가)
		 * 4. 특수문자는 _, $ 만 가능
		 * 5. 낙타 표기법으로 작성 권장
		 * 6. 한글 권장 x
		 * 
		 */
		
		int age;
		//double age;
		int Age;
		
		//int true;
		//int public;
		//int class;
		//int void;
		
		int num1;
		int nu1m;
		//int 1num;
		
		int num_1;
		int num$1;
		int $num1;
		//int num#1;
		
		String userName; // 권장 O
		String usename; // 권장 x
		String 이름; // 권장 x
			
		
		
	}
	
	public void constant() {
		
		int age = 10;
		age = 20; // 변수는 값을 변경할 수 있다.
		
		/*
		 * < 상수>
		 * 
		 * 1. 변수와 동일하게 값을 기록하기 위한 공간
		 * 2. 단, 한번 담긴 값을 변경할 수 없음
		 * 3. 상수로 선언되는 이름은 다 대문자로 작성하는걸 권장
		 * 
		 * [표현법] final 자료형 변수명; 
		 * 
		 * 
		 */
		
		final int AGE = 30;
		//AGE = 40; 항상 고정적인 값을 담아둘 때만 쓴다
		
		System.out.println(AGE);
		
		System.out.println(Math.PI); // 대표적인 상수 (Math 클래스 안에 정의 되어있는 PI 상수)
		
		
	}
	
	/*
	 *  ** 정리 **
	 *  
	 * 1. 값(리터럴) : 프로그램 상에 필요한 명시적인 data , 사용자가 마우스 또는 키보드로 입력한 data
	 * 2. 변수 : 값을 메모리 상에 저장하기 위한 공간
	 *				한개의 값만 담을 수 있고 새로운 값을 다시 대입할 수 있음 (변경)
	 * 3. 상수 : 변수 선언 구문 앞에 final 붙여서 선언
	 * 				변수와 	비슷하나 한번 담긴 값을 변경할 수 없다.
	 */
	
	
	
	
	
	

}

