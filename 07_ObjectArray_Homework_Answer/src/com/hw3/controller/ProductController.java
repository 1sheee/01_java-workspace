package com.hw3.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {
	
	private Product[] pro = new Product[10];
	public static int count = 0;
	
	Scanner sc = new Scanner(System.in);
	
	
	public void mainMenu() {
		int menu = 0;
		while(true) {
			System.out.println("===== 제품 관리 메뉴 =====");
			System.out.println("1. 제품 정보 추가");
			System.out.println("2. 제품 전체 조회");
			System.out.println("3. 제품 수정");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: productInput(); break;
			case 2: productPrint(); break;
			case 3: productUpdate(); break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("잘못입력하였습니다. 다시 입력해주세요."); break;
			}
			
		}
	}
	
	public void productInput() {
		
		if(count == pro.length) {
			System.out.println("현재 10개의 제품 정보가 다 찼습니다. 더이상 추가할 수 없습니다.");
			return;
		}
		
		System.out.print("제품 번호 : ");
		int pId = sc.nextInt();
		sc.nextLine();
		System.out.print("제품 이름 : ");
		String pName = sc.nextLine();
		System.out.print("제품 가격 : ");
		int price = sc.nextInt();
		System.out.print("제품 세금 : ");
		double tax = sc.nextDouble();
		
		pro[count] = new Product(pId, pName, price, tax);			
		
		
	}
	
	public void productPrint() {
		for(int i=0; i<count; i++) {
			System.out.println(pro[i].information());
		}
	}
	
	public void productUpdate() {
		System.out.print("수정하고자하는 제품명 : ");
		String pName = sc.nextLine();
		
		System.out.print("변경할 제품명 : ");
		String newName = sc.nextLine();
		System.out.print("변경할 가격 : ");
		int newPrice = sc.nextInt();
		System.out.print("변경할 세금 : ");
		double newTax = sc.nextDouble();
		
		for(int i=0; i<count; i++) {
			if(pro[i].getpName().equals(pName)) {
				pro[i].setpName(newName);
				pro[i].setPrice(newPrice);
				pro[i].setTax(newTax);
			}
		}
	}

}
