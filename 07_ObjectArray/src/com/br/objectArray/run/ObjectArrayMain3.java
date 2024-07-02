package com.br.objectArray.run;

import java.util.Scanner;

import com.br.objectArray.model.vo.Phone;

public class ObjectArrayMain3 {

	public static void main(String[] args) {
		Phone[] phones = new Phone[3];
		/*
		System.out.println(phones);
		System.out.println(phones[0]); // null == 참조하는 객체가 없다
		phones[0].setName("아이폰"); // 수행 시 NullPointerException
		*/
		
		// 각인덱스 자리에 적어도 Phone객체 생성은 해야됨
		phones[0] = new Phone("갤럭시","삼성",100000,"z플립");
		phones[1] = new Phone("아이폰","애플",120000,"13");
		phones[2] = new Phone("아이폰","애플",150000,"15pro");
		
		phones[1].setPrice(1300000);
		
		// 판매하는 핸드폰들 다 조회하는 기능
		for(int i = 0;i<phones.length;i++) {
			System.out.println(phones[i].information());
		}
		
		// 평균 가격이 궁금
		
		int sum = 0;
		for(int i = 0;i<phones.length;i++) {
			sum += phones[i].getPrice();
			
		}
		System.out.println("평균가 : "  + sum/phones.length + "원");
	
		// 사용자에게 구매하고자 하는 핸드폰 정보를 입력 받아서
		// 해당 검색된 핸드폰의 가격을 조회하는 기능
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("핸드폰명(핸드폰명+시리즈명): ");
		String buy = sc.nextLine(); // ex) 아이폰12pro
		
		
		for(int i = 0;i<phones.length;i++) {
			if((phones[i].getName() + phones[i].getSe()).equals(buy)) {
				System.out.println("당신이 구매하고자하는 핸드폰의 가격은 : " 
								+ phones[i].getPrice());
			}
			
		}
		
	
	
	}

}
