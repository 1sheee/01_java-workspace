package com.br.chap03_class.run;

import com.br.chap03_class.model.vo.Person;
import com.br.chap03_class.model.vo.Product;

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
		
		ps.setId("user01");
		ps.setPwd("pass01");
		ps.setName("닭도리");
		ps.setAge(20);
		ps.setGender('M');
		ps.setPhone("01012345678");
		ps.setEmail("goodee@naver.com");
		
		System.out.println(ps.getId());
		System.out.println(ps.getPwd());
		System.out.println(ps.getName());
		System.out.println(ps.getAge());
		System.out.println(ps.getGender());
		System.out.println(ps.getPhone());
		System.out.println(ps.getEmail());
		
		Product pd = new Product();
		
		pd.setpName("01012345678");	
		pd.setPrice(500);
		pd.setBrand("닭도리");
		/*
		System.out.println(pd.getpName());
		System.out.println(pd.getPrice());
		System.out.println(pd.getBrand());
		*/
		
		System.out.println(pd.information());
	}

}
