package com.br.after.model.vo;

public class SmartPhone extends Product{//다른패키지 프로덕트면 임포트해야됨

	private String mobileAgency;
	
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		
		super(brand, pCode, pName, price);
		this.mobileAgency = mobileAgency;
	}
	
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	public String information() {
		return super.information() + ",통신사 : " + mobileAgency;
	}
}
