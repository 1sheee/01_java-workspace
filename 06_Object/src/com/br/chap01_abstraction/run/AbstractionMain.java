package com.br.chap01_abstraction.run;

import com.br.chap01_abstraction.model.vo.Student;

public class AbstractionMain {

	public static void main(String[] args) {
		
		// Student클래스를 가지고 객체를 생성
		
		// 1. 객체 생성
		// 		클래스명 변수명 new = 클래스명();
		Student hong = new Student();
		
		// .2 생성된 객체에 속성값을 대입
		
		hong.name = "홍길동";
		hong.age = 20;
		hong.height = 172.3;
		
		System.out.println(hong); // 자료형@주소값의16진수
		System.out.println(hong.name + "님의 나이는"
				+ hong.age + "이고, 키는 "
				+ hong.height + "cm 입니다.");
		
		System.out.printf("%s님의 나이는 %d이고, 키는 %.1fcm 입니다.", hong.name, hong.age, hong.height);
		
		// 김말똥 학생 객체 만들기
		// 김말똥, 21, 160.2
		
		Student kim = new Student();
		
		kim.name = "김말똥";
		kim.age = 21;
		kim.height = 160.2;
		System.out.println();
		System.out.printf("%s님의 나이는 %d이고, 키는 %.1fcm 입니다.",
				kim.name, kim.age, kim.height);
		
		/*
		 * 필드를 public으로 했기 때문에
		 * 객체명.필드명 직접접근이 가능했던거임!
		 * 	=> 보안이 안 좋고, 수정이 맘대로 가능
		 * 	=> 캡슐화 적용해야됨
		 */
	}
	
	
	

}
