package com.br.model.vo;

import java.util.List;

public class CoffeeShop {
	
	private String shopName; 		// 커피숍명
	private String shopAddr;		// 커피숍주소
	private String shopMasterId;	// 커피숍주인아이디
	
	private List<Coffee> coffeeList; // 판매하는 커피리스트
	private List<Bread> breadList;	 // 판매하는 빵리스트
	
	public CoffeeShop() {}
	
	public CoffeeShop(String shopName, String shopAddr, String shopMasterId) {
		this.shopName = shopName;
		this.shopAddr = shopAddr;
		this.shopMasterId = shopMasterId;
	}

	public CoffeeShop(String shopName, String shopAddr, String shopMasterId, List<Coffee> coffeeList,
			List<Bread> breadList) {
		this(shopName, shopAddr, shopMasterId);
		this.coffeeList = coffeeList;
		this.breadList = breadList;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopAddr() {
		return shopAddr;
	}

	public void setShopAddr(String shopAddr) {
		this.shopAddr = shopAddr;
	}

	public String getShopMasterId() {
		return shopMasterId;
	}

	public void setShopMasterId(String shopMasterId) {
		this.shopMasterId = shopMasterId;
	}

	public List<Coffee> getCoffeeList() {
		return coffeeList;
	}

	public void setCoffeeList(List<Coffee> coffeeList) {
		this.coffeeList = coffeeList;
	}

	public List<Bread> getBreadList() {
		return breadList;
	}

	public void setBreadList(List<Bread> breadList) {
		this.breadList = breadList;
	}

	@Override
	public String toString() {
		return "가게명 : " + shopName + "\n가게주소: " + shopAddr + "\n가게주인ID: " + shopMasterId;
	}


}
