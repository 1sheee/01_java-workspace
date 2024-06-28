package com.br.chap04_filed.model.vo;

public class FieldTest1 { //FieldTest1 start
	
	/*
	 * < 멤버 변수 | 인스턴스변수 >
	 * 
	 * 1. 객체가 가질 수 있는 값을 보관하기 위한 변수
	 * 2. 멤버변수를 선언만 해둘 경우 해당 클래스를 통해
	 * 		객체 생성 시 JVM이 자료형에 맞는 기본값으로 초기화
	 * 3. 전역변수로 선언된 셈이기 때문에 동일한 클래스내라면
	 * 		아무 제한 없이 해당 멤버변수를 사용할 수 있음
	 * 4. 라이프사이클
	 * 		ㄴ 생성시점 : 해당 클래스를 통해 객체 생성 시 메모리상에 할당
	 * 		ㄴ 소멸시점 : 해당 객체 소멸 시 같이 사라짐		
	 * 
	 * [표현법]
	 * 접근제한자 [예약어] 자료형 변수명; [= 값];
	 * 
	 * 
	 */
	
	private int global; // - 멤버변수
	
	public void test(int num) {// test start
		
		/*
		 * < 지역 변수 >
		 * 
		 * 1. 클래스 영역을 제외한 그 외(메소드, 제어문) 블럭 내에서 선언된 변수
		 * 2. 매개변수(parameter)도 지역변수에 해당
		 * 3. 해당 블럭내에서만 사용 가능
		 * 4. 라이플사이클
		 * 		ㄴ 생성시점 : 해당 변수가 속해있는 블럭이 실행될 때
		 * 		ㄴ 소멸시점 : 해당 블럭이 종료될 때 소멸된다.
		 */
		
		int local = 10;
		
		// 멤버변수 출력 : 해당 객체생성 시 JVM이 초기화를 진행해줌
		System.out.println(global);
		// 매개변수 출력 : 해당 메소드 호출 시 전달된 값으로 초기화가 진행되어있을 것
		System.out.println(num);
		// 지역변수 출력 : 직접 초기화를 진행해둬야됨
		System.out.println(local); // - 초기화 해줘야한다.
		
		FieldTest2 f2 = new FieldTest2();
		
		System.out.println(f2.pub); // public이기 때문에 다른패키지에 있어도 직접접근가능
		System.out.println(f2.pro); // protected일 때 다른패키지의 클래스에서는 접근 불가능
		System.out.println(f2.def); // default도 다른 패키지일 경우 접근 불가능
		//System.out.println(f2.pri); // private는 그 클래스안에서만 가능
		
		
	}// test end
	

}//FieldTest1 end
