package com.br.after.model.vo;

public class Desktop extends Product {
			//자식클래스 //부모클래스
			//후손		//조상
			//하위    	//상위
			//서브  	//슈퍼
			//this		//super

	private boolean allInOne;
	
	public Desktop() {} // super(); - jvm이 자동으로 작성해줌 안보이게
						// 부모 클래스에 기본생성자 존재해야됨
						// 기본생성자 작성하는 습관 꼭 들이기!
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		// brand~price 네개의 값들은 부모클래스(Product)의 필드에 대입
		// 자식클래스에서 부모클래스꺼를 접근 시 super.으로 접근가능 (단, private은 접근불가능)
		
		// 해결방법1. 부모클래스의 필드를 protected로 수정 - 같은패키지, 상속일 때 가능
		/*
		super.brand = brand;
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;
		*/
		
		// 해결방법2. 부모클래스에 있는 setter메소드 이용 (public이기 때문에 사용가능)
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		
//**		// 해결방법3. 부모클래스에 정의 된 부모생성자 호출하기
			super(brand, pCode, pName, price); // 항상 객체 생성먼저 super 먼저
		
		this.allInOne = allInOne; 
	}
	
	public boolean isALLinOne() {
		return allInOne;
	}
	
	public void setALLinOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	// 상속구조에서 오버라이딩 : 부모클래스에 있는 메소드를 자식클래스에서 재정의 과정, 오버로딩이랑 헷갈리면 안된다.
	public String information() {
		// brand~prie + allInOne
		return super.information() + ", allInOne : " + allInOne;
	}
	
}
