package com.ex.view;

import java.util.List;
import java.util.Scanner;

import com.ex.controller.ExController;
import com.ex.model.vo.Product;

public class ExMenu {
	
	Scanner sc = new Scanner(System.in);  // 사용자에게 키보드로 입력받기 위한 객체
	ExController ec = new ExController(); // ExController클래스 내의 메소드 호출을 위한 객체 
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("\n== Welcome 만물상 ==");
			System.out.println("1. 전체 제품 조회");
			System.out.println("2. 새 제품 추가");
			System.out.println("3. 제품 삭제");
			System.out.println("4. 제품명으로 키워드 검색");
			System.out.println("5. 특정 제품 가격만 조회");
			System.out.println("0. 프로그램 종료");
			System.out.print(">> 메뉴선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			// 각 메뉴 선택시에 호출되는 메소드는 현재 이 클래스에 있다. => 가볼것
			switch(menu) {
			case 1: selectProduct(); break; 
			case 2: insertProduct(); break;
			case 3: deleteProduct(); break;
			case 4: searchProduct(); break;
			case 5: selectPrice(); break;
			case 0: System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다."); return;
			default: System.out.println("메뉴를 잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}
	
	// 1. 전체 제품 조회용 화면 
	public void selectProduct() {
		System.out.println("\n==== 조회 결과 ====");
		
		// ec의 selectProduct메소드 호출하여 List 돌려받기
		
		// 해당 List가 비어있을 경우 => "더이상의 제품이 존재하지 않습니다. 새로 추가해주세요" 출력
		// 해당 List가 비어있지 않을 경우 => 반복문 돌려가며 모든 Product객체 출력
		
		List<Product> list = ec.selectProduct();
		
		for(int i=0; i <list.size() ; i++) {
			if(list.isEmpty()) {
				System.out.println("더이상의 제품이 존재하지 않습니다. 새로 추가해주세요");
			}else {
				System.out.println(list.get(i));
			}
		}
		
		
	}
	
	// 2. 새 제품 추가용 화면 
	public void insertProduct() {
		System.out.println("\n==== 제품 추가 ====");
		
		// 추가하고자 하는 제품의 제품명 입력받기 (String name 변수에 기록)
		
		// 추가하고자 하는 제품의 브랜드명 입력받기 (String brand 변수에 기록)
		
		// 추가하고자 하는 제품의 가격 입력받기 (String price 변수에 기록) 
		
		// ec의 insertProduct메소드 호출시 위의 입력값 전달하면서 호출
		
		// "성공적으로 추가되었습니다." 출력
		
		System.out.print("제품명을 입력해주세요 : ");
		String name = sc.nextLine();
		System.out.print("브랜드명을 입력해주세요 : ");
		String brand = sc.nextLine();
		System.out.print("가격을 입력해주세요 : ");
		String price = sc.next();
		
		ec.insertProduct(name, brand, price);
		System.out.println("성공적으로 추가되었습니다.");
		
		
		
	}
	
	// 3. 제품 삭제용 화면
	public void deleteProduct() {
		System.out.println("\n==== 제품 삭제 ====");
		
		// 삭제하고자 하는 제품의 제품명 입력받기 (String name 변수에 기록)
		
		// 삭제하고자 하는 제품의 브랜드명 입력받기 (String brand 변수에 기록)
		
		// ec의 deleteProduct메소드 호출시 위의 입력값 전달하면서 호출하고 이때 돌아오는 결과값(0 또는 1) 받기
		
		// 해당 결과값이 0일 경우 => "삭제할 제품을 찾지 못했습니다." 출력
		// 해당 결과값이 1일 경우 => "성공적으로 삭제되었습니다." 출력
		
		System.out.print("삭제할 제품명 : ");
		String name = sc.nextLine();
		System.out.print("삭제할 브랜드명: ");
		String brand = sc.nextLine();
		
		int result = ec.deleteProduct(name, brand);
		
		if(result == 1) {
			System.out.println("성공적으로 삭제되었습니다.");
		}else if(result == 0){
			System.out.println("삭제할 제품을 찾지 못했습니다.");
		}
		
	
	}
	
	// 4. 제품 검색용 화면
	public void searchProduct() {
		System.out.println("\n== 제품명 키워드 검색 ==");
		
		// 검색하고자 하는 제품의 제품명 입력받기 (String nameKeyword 변수에 기록) 
		
		// ec의 searchProduct메소드 호출시 위의 입력값 전달하면서 호출하고 이때 돌아오는 List 받기
		
		// 해당 List가 비어있을 경우 => "검색 결과가 없습니다."
		// 해당 List가 비어있지 않을 경우 => 반복문 돌려가며 Product객체 출력
		
		System.out.print("검색할 제품을 입력해주세요 : ");
		String nameKeyword = sc.nextLine();
		
		List<Product> find = ec.searchProduct(nameKeyword);
		
		if(find.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			for(int i = 0 ; i < find.size() ; i++) {
				System.out.println(find.get(i));
			}
		}
		
	}
	
	// 5. 특정 제품 가격만 조회용 화면 
	public void selectPrice() {
		System.out.println("\n=== 제품 가격 조회 ===");
		
		// 가격 검색하고자 하는 제품의 제품명 입력받기 (String name 변수에 기록)
		
		// 가격 검색하고자 하는 제품의 브랜드명 입력받기 (String brand 변수에 기록)
		
		// ec의 selectPrice메소드 호출시 위의 입력값 전달하면서 호출하고 이때 돌아오는 가격값 받기
		
		// 해당 가격값이 0일 경우 => "해당 제품을 찾지 못했습니다." 출력
		//      그게 아닐 경우 => "xxx 브랜드의 xxx 제품의 가격은 xxxx원입니다." 형식으로 출력
	
		System.out.print("제품명을 입력해주세요 : ");
		String name = sc.nextLine();
		System.out.print("브랜드명을 입력해주세요 : ");
		String brand = sc.nextLine();
		
		int price = ec.selectPrice(name, brand);
		
		if(price == 0 ) {
			System.out.println("해당 제품을 찾지 못했습니다.");
		}else {
			System.out.println(brand + " 브랜드의 " + name +" 제품의 가격은 " + price + "원입니다.");
		}
		
	
	
	
	
	
	
	
	
	}
	
	
	
	
	

}
