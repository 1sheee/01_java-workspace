package com.br.chap06_method.controller;

public class OverLoadingTest {

	/*
	 * < 오버로딩 > 
	 * 한 클래스 내에서 동일한 이름의 메소드명으로
	 * 정의하는 개념
	 * 
	 * 성립조건 : 매개변수의 자료, 갯수, 순서가 다 달라야됨
	 */
	
	public void test() {
		
	}
	
//	public void test() {
//		
//	}
	
	public void test(int a) {
		
	}
	
	public void test(int a, String s) {
		
	}
	public void test(String s, int a) {
		
	}
	public void test(int a, int b) {
		
	}
//	public int test(int c, int d) {
//		return 0;
//	}
//	private void test (int c, int d) {
//		
//	}
	// 매개변수명이랑은 상관없이 매개변수자료형, 갯수, 순서가 다르게
	// 작성되어 있어야
	// int 라는 반환형으로 바꿔도 안된다.
	// 접근제한자라도 안된다.
	
	
}
