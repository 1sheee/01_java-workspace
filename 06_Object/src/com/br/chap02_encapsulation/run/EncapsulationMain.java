package com.br.chap02_encapsulation.run;

import com.br.chap02_encapsulation.model.vo.Student;

public class EncapsulationMain {

	public static void main(String[] args) {
		
		Student hong = new Student();
		
		/*
		hong.name = "홍길동";
		hong.age = 20;
		hong.height = 172.3;
		hong.korScore = 80;
		hong.mathScore = 100;
		*/
		
		// private 때문에 직접 접근이 안됨
		// => 간접적으로 접근해서 대입할 수 있는 기능을 정의 해야됨
		// 		Student 클래스내에 setter메소드로 정의
		
		hong.setName("홍길동");
		hong.setAge(20);
		hong.setHeight(172.3);
		hong.setKorScore(80);
		hong.setMathScore(100);
		
		System.out.println(hong);
		
		//System.out.println(hong.name);
		
		// 간접적으로나마 해당 필드값을 돌려주는 기능의 메소드를 정의
		// => Student클래스 내에 getter메소드
		
		System.out.println(hong.getName());
		System.out.println(hong.getAge());
		System.out.println(hong.getHeight());
		System.out.println(hong.getKorScore());
		System.out.println(hong.getMathScore());
	}

}
