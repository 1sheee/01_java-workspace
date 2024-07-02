package com.br.objectArray.model.vo;

public class Phone {
	
	// 이름, 브랜드명, 가격, 시리즈

	private String name;
	private String brand;
	private int price;
	private String se;
	
	public Phone() {}
	public Phone(String name, String brand, int price, String se) {
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.se = se;
		}
	// get, set 자동완성 우클릭, source, ge get set (작성되어 있으면 x)
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getSe() {
		return se;
	}
	public void setSe(String se) {
		this.se = se;
	}
	
	public String information() {
		return "이름 : " + name + ", 브랜드명 : " 
				+ brand + ", 가격 : "
				+ price + ", 시리즈 : " + se;
	}
	
}
