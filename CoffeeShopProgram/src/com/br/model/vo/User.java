package com.br.model.vo;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String userName;	// 사용자명
	private int userMoney;		// 사용자보유금액
	private List<Object> cart = new ArrayList<>();; 	// 사용자장바구니
	
	public User() {}

	public User(String userName, int userMoney) {
		super();
		this.userName = userName;
		this.userMoney = userMoney;
	}
	
	

	public User(String userName, int userMoney, List<Object> cart) {
		this(userName, userMoney);
		this.cart = cart;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserMoney() {
		return userMoney;
	}

	public void setUserMoney(int userMoney) {
		this.userMoney = userMoney;
	}

	public List<Object> getCart() {
		return cart;
	}

	public void setCart(List<Object> cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "이름: " + userName + "\n보유돈: " + userMoney;
	}
	
	

}
