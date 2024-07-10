package com.br.collection.controller;

import java.util.ArrayList;
import java.util.List;

public class ListController {//s
	
	/*
	 *  < java.util.Collection > List > ArrayList >
	 *  
	 *  1. 선형자료구조의 컬렉션으로 배열을 가지고 있어
	 *  	데이터가 순차적으로 보관되어 관리됨
	 *  2. 특징
	 *  	ㄴ 순서대로 데이터가(value)가 저장
	 *  	ㄴ 인덱스로 각 데이터가 관리
	 *  	ㄴ 중복 데이터 보관 가능
	 *  	
	 *  
	 */
	
	public void arrayListTest1() {
//		List list = new List(); // List는 인터페이스임 == 객체생성 불가능
		
		// 제네릭 타입을 지정하지 않을 경우 => Object클래스가 된다.
		List list = new ArrayList();
		
		list.add(10);
		list.add("안녕하세요");
		list.add(5.12);
		System.out.println(list/*.toString()*/); // 참조변수라
		
		list.add(2, "안녕하세요2");
		System.out.println(list);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4)); // IndexOutOfBoundsException
		
		
	}
	
	public void arrayListTest2() {
		
		// 정수값만 보관 가능한 list생성
		List<Integer> numlist = new ArrayList<Integer>();
		
		numlist.add(1);
		numlist.add(2);
		numlist.add(3);

		System.out.println(numlist);
		
		System.out.println("요소 갯수(리스트의 사이즈) : " + numlist.size());
		
		System.out.println("리스트의 마지막 인덱스 수 : "+ (numlist.size()-1));
		
		for(int i = 0 ; i<numlist.size() ; i++) {
			System.out.println(numlist.get(i));
		}
	}
	
	public void arrayListTest3() {
		
		// 문자열만 저장가능 list 생성
		
		List<String> strlist = new ArrayList<>(); // 뒤에 또 <String> 쓸 필요 x
		
		strlist.add("족발");
		strlist.add("보쌈");
		strlist.add("닭도리탕");
		
		System.out.println(strlist);
		
		System.out.println("요소 갯수(리스트의 사이즈) : " + strlist.size());
		
		System.out.println("리스트의 마지막 인덱스 수 : "+ (strlist.size()-1));
		
		for(int i = 0 ; i < strlist.size() ; i++) {
			System.out.println(strlist.get(i));
		}
		
		for(String lst :strlist) {
			System.out.println(lst);
		}
		
	}




}//e



