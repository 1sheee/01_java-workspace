package com.br.chap03_class.run;

import com.br.chap03_class.model.vo.Person;
import com.br.chap03_class.model.vo.Product;
import com.br.chap03_class.model.vo.Snack;

public class ClassMain {

	public static void main(String[] args) {
		
		/*
		 * 					 new   생성된 객체들(인스턴스)
		 * 클래스(틀)    ----생성----> A객체
		 *  -			 ----생성----> A객체
		 *  			 ----생성----> A객체
		 *         		 ----생성----> A객체
		 *         		인스턴스화 한다.
		 * 				실체화 한다.
		 */
		
		Person ps = new Person ();
		
		//System.out.println(ps.getId());
		// 생성 직후에는 JVM이 초기값들을 세팅해준다.
		
//		ps.setId("user01");
//		ps.setPwd("pass01");
//		ps.setName("닭도리");
//		ps.setAge(20);
//		ps.setGender('M');
//		ps.setPhone("01012345678");
//		ps.setEmail("goodee@naver.com");
//		
//		System.out.println(ps.getId());
//		System.out.println(ps.getPwd());
//		System.out.println(ps.getName());
//		System.out.println(ps.getAge());
//		System.out.println(ps.getGender());
//		System.out.println(ps.getPhone());
//		System.out.println(ps.getEmail());
//		
		// 내가 원하는 데이터가 담긴 객체를 생성하기 위한 방법
		// 방법1. 기본생성자로 생성 후 setter메소드를 이용해서 값 대입
		Product pd1 = new Product();
		
		pd1.setpName("01012345678");	
		pd1.setPrice(500);
		pd1.setBrand("닭도리");
		/*
		System.out.println(pd.getpName());
		System.out.println(pd.getPrice());
		System.out.println(pd.getBrand());
		*/
			
		System.out.println(pd1.information());
		//방법2. 매개변수 생성자를 정의해두고 실행시켜 생성과 동시에 값 대입
		Product pd2 = new Product("아이폰", 1500000, "애플");
		System.out.println(pd2.information());
		
		// 두번째 상품의 10프로 할인한다고한다.
		// 두번째 상품의 정상가격과, 할인가격을 출력
		
		System.out.println("두번째 상품의 정상가 : " + pd2.getPrice() + "원");
		System.out.println("두번째 상품의 할인가 : " + pd2.getPrice()*0.9  + "원");
		
		
		
	}

}
