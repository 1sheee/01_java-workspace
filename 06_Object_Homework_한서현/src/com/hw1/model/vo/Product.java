package com.hw1.model.vo;

public class Product {

	private String productid;
	private String productName;
	private String Area;
	private int price;
	private double tax;
	
	public Product() {}
	public Product(String producid, String productName, String Area
			, int price, double tax) {
		this.productid = producid;
		this.productName = productName;
		this.Area = Area;
		this.price = price;
		this.tax = tax;
		}
	public String Producid() {
		return productid;
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
		return productid + " " + productName + " " + Area + " " + price +" " + tax;
	}
	
	
	
	
}
