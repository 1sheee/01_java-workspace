package com.hw1.model.vo;

public class Product {

	private String productId;
	private String productName;
	private String Area;
	private int price;
	private double tax;
	
	public Product() {}
	public Product(String productId, String productName, String Area
			, int price, double tax) {
		this.productId = productId;
		this.productName = productName;
		this.Area = Area;
		this.price = price;
		this.tax = tax;
		}
	
	
	public void setProductid(String productId) {
		this.productId = productId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setArea(String Area) {
		this.Area = Area;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	
	public String Productid() {
		return productId;
	}
	public String ProductName() {
		return productName;
	}
	public String Area(){
		return Area;
	}
	public int Price() {
		return price;
	}
	public double Tax() {
		return tax;
	}
	public String information() {
		return productId + " " + productName + " " + Area + " " + price +" " + tax;
	}
	
	
	
	
}
