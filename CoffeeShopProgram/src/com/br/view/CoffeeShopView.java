package com.br.view;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import com.br.controller.CoffeeShopController;
import com.br.model.vo.Bread;
import com.br.model.vo.Coffee;
import com.br.model.vo.CoffeeShop;
import com.br.model.vo.User;

public class CoffeeShopView {
	
	Scanner sc = new Scanner(System.in);
	CoffeeShopController cs = new CoffeeShopController();
	
	// * 메인 화면
	public void welcomePage() {
		
		System.out.println("어서오세요. 저희 커피숍에 오신걸 환영합니다.");
		System.out.println("[참고] 초기관리자의 아이디는 admin입니다.");
		
		while(true) {
			
			System.out.println("\n===== 메인 메뉴 =====");
			System.out.println("1. 관리자 메뉴 진입");
			System.out.println("2. 사용자 메뉴 진입");
			System.out.println("0. 프로그램 종료");
			System.out.print(">> 메뉴 선택: ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu == 1) {
				System.out.println("\n===== Sign In =====");
				System.out.print("아이디: ");
				String id = sc.nextLine();
				
				if(id.equals(cs.selectCoffeeShopInfo().getShopMasterId())) {
					System.out.println("\n어서오세요 관리자님. 관리자메뉴로 이동합니다.");
					adminPage();
				}else {
					System.out.println("관리자의 masterId를 잘못 입력하셨습니다.");
				}
			}else if(menu == 2) {
				System.out.println("\n어서오세요 사용자님. 사용자메뉴로 이동합니다.");
				userPage();
			}else if(menu == 0) {
				System.out.println("\n프로그램을 종료합니다.");
				return;
			}else {
				System.out.println("메뉴를 잘못 선택하셨습니다. 다시 선택해주세요.");
			}
			
		}
		
		
	}
	
	// * 커피숍 주인(관리자) 화면 ==================================================================
	// > 관리자 메인 화면
	public void adminPage() {
		
		while(true) {
			System.out.println("\n===== 관리자 메뉴 =====");
			System.out.println("1. 가게 정보 관리");
			System.out.println("2. 가게 상품 관리");
			System.out.println("3. 가게 매출 관리");
			System.out.println("0. 메인 화면으로 돌아가기");
			System.out.print(">> 메뉴 선택: ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: coffeeShopManage(); break;
			case 2: coffeeShopProductManage(); break;
			case 3: coffeeShopPaymentManage(); break;
			case 0: System.out.println("메인 화면으로 돌아갑니다."); return;
			default: System.out.println("메뉴를 잘못 선택하셨습니다. 다시 선택해주세요.");
			}
		}
		
	}
	
	// > 관리자용 가게 정보 관리 화면
	public void coffeeShopManage() {
		
		while(true) {
			System.out.println("\n===== 가게정보 관리 =====");
			System.out.println("1. 가게 정보 조회");
			System.out.println("2. 가게 이름 수정");
			System.out.println("3. 가게 주소 수정");
			System.out.println("4. 가게 마스터 ID 수정");
			System.out.println("0. 관리자 메인 화면으로 돌아가기");
			System.out.print(">> 메뉴 선택: ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			CoffeeShop shop = null;
			if(menu == 1) {
				shop = cs.selectCoffeeShopInfo();
				System.out.println("\n" + shop);
			}else if(menu == 0) {
				System.out.println("\n관리자 메인 화면으로 돌아갑니다."); 
				return;
			}else if(menu >= 2 && menu <= 4) {
				
				System.out.print(">> 수정할 내용: ");
				String updateInfo = sc.nextLine();
				
				switch(menu) {
				case 2: cs.updateCoffeeShopName(updateInfo); break;
				case 3: cs.updateCoffeeShopAddr(updateInfo); break;
				case 4: cs.updateCoffeeShopMasterId(updateInfo); break;
				}
				
				shop = cs.selectCoffeeShopInfo();
				System.out.println("\n< 수정된 가게 정보 >\n" + shop);
				
			}else {
				System.out.println("메뉴를 잘못 선택하셨습니다. 다시 선택해주세요.");
			}
			
			
		}
		
	}
	
	// > 관리자용 판매 상품 관리 화면 
	@SuppressWarnings("rawtypes")
	public void coffeeShopProductManage() {
		
		while(true) {
			System.out.println("\n===== 판매 상품 관리 =====");
			System.out.println("1. 판매중인 커피 목록 조회");
			System.out.println("2. 판매중인 빵 목록 조회");
			System.out.println("3. 신규 커피 메뉴 추가");
			System.out.println("4. 신규 빵 메뉴 추가");
			System.out.println("0. 관리자 메인 화면으로 돌아가기");
			System.out.print(">> 메뉴 선택: ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: case 2:
				List list = menu == 1 ? cs.selectCoffeeList() 
									  : cs.selectBreadList();
				System.out.println("\n-----------------------");
				for(Object o : list) {
					System.out.println(o);
				}
				System.out.println("-----------------------");
				break;
			case 3: case 4:
				System.out.print("이름: ");
				String name = sc.nextLine();
				System.out.print("가격: ");
				String price = sc.nextLine();
				int result = menu == 3 ? cs.insertCoffee(name, price) 
									   : cs.insertBread(name, price);
				System.out.println(result > 0 ? "성공적으로 추가되었습니다." : "동일한 상품이 존재합니다.");
				break;
			case 0:
				System.out.println("\n관리자 메인 화면으로 돌아갑니다."); 
				return;
			default: System.out.println("메뉴를 잘못 선택하셨습니다. 다시 선택해주세요.");
			}
			
		}
		
		
	}
	
	// > 관리자 매출 관리 화면
	public void coffeeShopPaymentManage() {
		
		while(true) {
			System.out.println("\n===== 가게 매출 관리 =====");
			System.out.println("1. 전체 판매 내역 조회");
			System.out.println("2. 특정 고객 구매 내역 조회");
			System.out.println("0. 관리자 메인 화면으로 돌아가기");
			System.out.print(">> 메뉴 선택: ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu == 1) {
				Map<String, List<Object>> paymentMap = cs.paymentList();
				
				if(paymentMap.isEmpty()) {
					System.out.println("판매 내역이 존재하지 않습니다.");
				}else {
					Iterator<Entry<String, List<Object>>> iterator = paymentMap.entrySet().iterator();
					while(iterator.hasNext()) {
						Entry<String, List<Object>> entry = iterator.next();
						System.out.println("\n-- < 고객명: " + entry.getKey() + "> --");
						List<Object> list = entry.getValue();
						for(Object o : list) {
							System.out.println(o);
						}
					}
				}
				
				
			}else if(menu == 2) {
				System.out.print("\n조회할 고객명: ");
				List<Object> paymentList = cs.paymentListByUserName(sc.nextLine());
				if(paymentList.isEmpty()) {
					System.out.println("해당 고객의 주문내역이 존재하지 않습니다.");
				}else {
					for(Object o : paymentList) {
						System.out.println(o);
					}
				}
				
			}else if(menu == 0) {
				System.out.println("\n관리자 메인 화면으로 돌아갑니다."); 
				break;
			}else {
				System.out.println("메뉴를 잘못 선택하셨습니다. 다시 선택해주세요.");
			}
		}
	}
	
	// * 커피숍 손님(사용자) 화면 ==================================================================
	// > 사용자 메인 화면
	public void userPage() {
		
		if(cs.selectUserInfo() == null) {
			System.out.println("\n처음 방문하셨군요. 회원등록부터 진행하겠습니다.");
			System.out.print("성함: ");
			String name = sc.nextLine();
			System.out.print("보유돈: ");
			String money = sc.nextLine();
			
			cs.insertUser(name, money);
			System.out.println("성공적으로 등록되었습니다. 메뉴판을 확인하시고 이용서비스를 선택해주세요.");
		}
		
		while(true) {
			
			System.out.println("\n===== 사용자 메뉴 =====");
			System.out.println("1. 사용자 정보 조회");
			System.out.println("2. 장바구니 조회");
			System.out.println("3. 메뉴 주문 하기");
			System.out.println("0. 메인 화면으로 돌아가기");
			System.out.print(">> 메뉴 선택: ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: showUserInfo(); break;
			case 2: showUserCartList(); break;
			case 3: orderMenu(); break;
			case 0: System.out.println("메인 화면으로 돌아갑니다."); return;
			default: System.out.println("메뉴를 잘못 선택하셨습니다. 다시 선택해주세요.");
			}
			
		}
		
	}
	
	// > 사용자 본인 정보 조회 화면
	public void showUserInfo() {
		
		User user = cs.selectUserInfo();
		System.out.println("\n" + user);
		
		System.out.print("\n돈을 충전하시겠습니까(y/n): ");
		if(sc.nextLine().toUpperCase().charAt(0) == 'Y') {
			System.out.print("충전금액: ");
			cs.increaseUserMoney(sc.nextLine());
			System.out.println("\n성공적으로 충전되었습니다.");
		}
				
		System.out.println("\n사용자 메인 화면으로 돌아갑니다.");
		
	}
	
	// > 사용자 주문 화면
	public void orderMenu() {
		
		List<Coffee> cList = cs.selectCoffeeList();
		List<Bread> bList = cs.selectBreadList();
		
		System.out.println("\n------- 커피메뉴 -------");
		for(int i=0; i<cList.size(); i++) {
			System.out.println(i+1 + ". " + cList.get(i));
		}
		System.out.println("\n------- 빵 메뉴 --------");
		for(int i=0; i<bList.size(); i++) {
			System.out.println(i+1 + ". " + bList.get(i));
		}
		System.out.println("------------------------");
		
		while(true) {
			
			System.out.print("\n계속 주문하시겠습니까(y/n): ");
			char yn = sc.next().toUpperCase().charAt(0);
			if(yn == 'N') {
				showUserCartList();
				break;
			}else if(yn == 'Y') {
				System.out.print("\n커피 주문시 1, 빵 주문시 2 입력: ");
				int flag = sc.nextInt();
				System.out.print("주문 메뉴 번호: ");
				int menu = sc.nextInt();
				
				int result = flag == 1 ? cs.orderCoffee(menu-1)
									   : cs.orderBread(menu-1);
				
				if(result > 0) {
					System.out.println("\n성공적으로 장바구니에 담겼습니다.");
				}else {
					System.out.println("\n잔액부족으로 장바구니에 담지 못했습니다.");
					
					System.out.println("\n현재 보유 금액: " + cs.selectUserInfo().getUserMoney());
					System.out.println("장바구니에 담긴 상품 총 금액: " + cs.selectCartTotalPrice());
					System.out.println("구매하고자 하는 메뉴 금액: " + (flag == 1 ? cList.get(menu-1).getCoffeePrice()
																				  : bList.get(menu-1).getBreadPrice()));
				
					System.out.println("\n사용자 메인 화면으로 돌아갑니다.");
					break;
				}
			}else {
				System.out.println("y또는 n으로 다시 입력해주세요.");
			}
			
			
			
		}
	}
	
	public void showUserCartList() {
		System.out.print("\n장바구니 정보를 확인하시겠습니까(y/n): ");
		char yn = sc.next().toLowerCase().charAt(0);
		
		if(yn == 'y') {
			List<Object> cartList = cs.selectUserCart();
			int total = 0;

			if(cartList.isEmpty()) {
				System.out.println("\n현재 장바구니가 비어있습니다.");
			}else {
				System.out.println("\n----------------------");
				for(Object o : cartList) {
					System.out.println(o);
					total += o instanceof Coffee ? ((Coffee)o).getCoffeePrice() : ((Bread)o).getBreadPrice();
				}
				System.out.println("총 가격:\t" + total + "원");
				System.out.println("-----------------------");
				
				System.out.print("장바구니 상품들을 결제하시겠습니까(y/n): ");
				if(sc.next().toUpperCase().charAt(0) == 'Y') {
					cs.payment();
					System.out.println("\n성공적으로 결제되었습니다. 보유금액이 차감되었습니다.");
				}
				
			}
			
		}
	}

}
