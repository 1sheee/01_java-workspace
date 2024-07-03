package com.br.before.mode.vo;

public class Desktop {
	
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	private boolean allInOne;
	
	public Desktop() {}
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.allInOne = allInOne;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isAllInOne() { // 불린만 is로 처리한다.
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public String information() {
		return "브랜드명 : " + brand + ", 상품코드 : " + pCode
				+ ", 상품명 : " + pName + ", 상품가격 : " + price
				+ ", 일체여부 : " + allInOne;
	}

}
