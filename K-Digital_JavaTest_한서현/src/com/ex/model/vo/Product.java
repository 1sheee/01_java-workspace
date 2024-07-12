package com.ex.model.vo;

public class Product {
	
	private String name;  // 제품명
	private String brand; // 제품브랜드 
	private int price;    // 제품가격
	
	public Product() {
		
	}

	public Product(String name, String brand, int price) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
	}

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

	@Override
	public String toString() {
		return "Product [name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}
	
}
