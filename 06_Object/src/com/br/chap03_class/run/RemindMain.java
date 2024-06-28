package com.br.chap03_class.run;

import java.util.Scanner;

import com.br.chap03_class.model.vo.Snack;

public class RemindMain {

	public static void main(String[] args) {
		
		Snack dak = new Snack();
		
		dak.setsName("닭다리");
		//dak.setBrand("양계장");
		dak.setPrice(2000);
		dak.setKcal(500);
		
		System.out.println(dak.information());
		
		// 객체 생성을 해야 해당 객체의 멤버(멤버변수, 멤버메소드) 접근가능
	
		// 사용자에게 과자 정보를 입력 받아 대입
		Scanner sc = new Scanner(System.in);
		System.out.print("과자명 : ");
		String name = sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		System.out.print("칼로리 : ");
		int kcal = sc.nextInt();
		/*
		Snack s1 = new Snack();
		s1.setsName(name);
		s1.setPrice(price);
		s1.setKcal(kcal);
		*/
		
		//System.out.println(s1.information());
		
		Snack s = new Snack(name, price, kcal);
		System.out.println(s.information());
		
	}

}
