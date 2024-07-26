package com.br.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.br.model.dao.CoffeeShopDao;
import com.br.model.vo.Bread;
import com.br.model.vo.Coffee;
import com.br.model.vo.CoffeeShop;
import com.br.model.vo.User;

public class CoffeeShopController {
	
	private CoffeeShopDao csDao = new CoffeeShopDao();
	
	private CoffeeShop shop;
	private User user;
	
	{
		// 커피숍 초기 정보 세팅
		List<Coffee> cList = new ArrayList<>();
		cList.add(new Coffee("아메리카노", 1000));
		cList.add(new Coffee("카페라떼", 2000));
		cList.add(new Coffee("카페모카", 3000));
		cList.add(new Coffee("헤이즐넛라떼", 4000));
		
		List<Bread> bList = new ArrayList<>();
		bList.add(new Bread("홍국식빵", 2000));
		bList.add(new Bread("샌드위치", 3000));
		bList.add(new Bread("생크림빵", 1500));
		bList.add(new Bread("소세지빵", 2500));
		
		shop = new CoffeeShop("인크커피", "서울시 금천구 가산동", "admin", cList, bList);
		
	}
	
	
	
	// * 커피숍주인, 커피숍손님 공통 메소드 =====================================================
	
	// 커피숍 정보 반환 
	public CoffeeShop selectCoffeeShopInfo() {
		return shop;
	}
	
	// 커피숍에서 판매하는 커피 목록 반환 
	public List<Coffee> selectCoffeeList() {
		return shop.getCoffeeList();
	}
	
	// 커피숍에서 판매하는 빵 목록 반환 
	public List<Bread> selectBreadList(){
		return shop.getBreadList();
	}
	
	
	// * 커피숍주인(관리자)용 메소드 =============================================================
	
	// 전달받은 이름으로 커피숍 이름 수정
	public void updateCoffeeShopName(String shopName) {
		shop.setShopName(shopName);
	}
	
	// 전달받은 주소로 커피숍 주소 수정
	public void updateCoffeeShopAddr(String shopAddr) {
		shop.setShopAddr(shopAddr);
	}
	
	// 전달받은 마스터id로 커피숍의 사장 id 수정
	public void updateCoffeeShopMasterId(String masterId) {
		shop.setShopMasterId(masterId);
	}
	
	// 전달받은 정보들로 새로운 커피 상품 추가 
	public int  insertCoffee(String coffeeName, String coffeePrice) {
		
		List<Coffee> cList = selectCoffeeList();
		
		// 추가할 Coffee 객체
		Coffee coffee = new Coffee(coffeeName, Integer.parseInt(coffeePrice));
		
		// 단, 기존에 동일한 상품이 없을 경우 => 추가 
		if(!cList.contains(coffee)) { // Coffee 클래스에 hashCode, equals 오버라이딩 되어있어야
			cList.add(coffee);
			return 1;
		}
		
		return 0;
	}
	
	// 전달받은 정보들로 새로운 빵 상품 추가
	public int insertBread(String breadName, String breadPrice) {
		List<Bread> bList = selectBreadList();
		
		// 추가할 Bread 객체 
		Bread bread = new Bread(breadName, Integer.parseInt(breadPrice));
		
		// 단, 기존에 동일한 상품이 없을 경우 => 추가
		if(!bList.contains(bread)) { // Bread 클래스에 hashCode, equals 오버라이딩 되어있어야
			bList.add(bread);
			return 1;
		}
		
		return 0;
	}
	
	public Map<String, List<Object>> paymentList(){
		return csDao.paymentFileRead();
	}
	
	public List<Object> paymentListByUserName(String userName){
		return csDao.paymentFileReadByUserName(userName);
	}
	
	// * 커피숍손님(사용자)용 메소드 =============================================================
	
	// 사용자 정보 반환
	public User selectUserInfo() {
		return user;
	}
	
	// 사용자 정보 등록
	public void insertUser(String name, String money) {
		user = new User(name, Integer.parseInt(money));
	}
	
	// 전달받은 가격으로 보유돈 추가
	public void increaseUserMoney(String money) {
		user.setUserMoney(user.getUserMoney() + Integer.parseInt(money));
	}
	
	// 사용자의 장바구니정보 반환 
	public List<Object> selectUserCart(){
		return user.getCart();
	}
	
	// 본인의 장바구니에 담겨있는 상품들의 총 가격 반환 
	public int selectCartTotalPrice() {
		
		List<Object> cart = selectUserCart();
		
		int total = 0;
		for(Object o : cart) {
			if(o instanceof Coffee) {
				total += ((Coffee)o).getCoffeePrice();
			}else {
				total += ((Bread)o).getBreadPrice();
			}
		}
		
		return total;
	}
	
	// 전달받은 index 번째의 커피 주문 (장바구니에 담기)
	public int orderCoffee(int index) {
		
		int result = 0;
		
		Coffee coffee = shop.getCoffeeList().get(index); // 주문하고자 하는 커피객체
		
		// 현재 사용자 보유금액 - 장바구니에 담겨있는 상품 총 금액 >= 주문할 커피금액   => 주문 가능 
		if(user.getUserMoney() - selectCartTotalPrice() >= coffee.getCoffeePrice()) {
			user.getCart().add(coffee); // 사용자의 장바구니에 커피 담기
			result++;
		}
		
		return result; // 1(주문성공) / 0(가격 부족으로 주문실패)
	}
	
	// 전달받은 index 번째의 빵 주문 (장바구니에 담기)
	public int orderBread(int index) {
		int result = 0;
		
		Bread bread = shop.getBreadList().get(index); // 주문하고자 하는 빵객체
		
		// 현재 사용자 보유금액 - 장바구니에 담겨있는 상품 총 금액 >= 주문할 빵금액   => 주문 가능 
		if(user.getUserMoney() - selectCartTotalPrice() >= bread.getBreadPrice()) {
			user.getCart().add(bread); // 사용자의 장바구니에 빵담기
			result++;
		}
		
		return result; // 1(주문성공) / 0(가격 부족으로 주문실패)
	}
	
	public void payment() {
		csDao.paymentFileSave(user);
		user.setUserMoney(user.getUserMoney() - selectCartTotalPrice());
		user.setCart(new ArrayList<Object>());
	}
	
	
	
	

}
