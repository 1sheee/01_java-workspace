package com.br.after.run;

import com.br.after.model.vo.Desktop;
import com.br.after.model.vo.SmartPhone;
import com.br.after.model.vo.Tv;

public class AfterMain {

	public static void main(String[] args) {
		
		/*
		 * < 상속 >
		 * 
		 * 1. 부모(상위) 자식(하위) 간의 구조로 클래스를 구성하는 개념
		 * 2. 상위 클래스가 가지고 있는 멤버(필드 및 메소드)들을
		 * 		하위 클래스에서 새로 작성 필요없이 사용 가능
		 * 
		 * < 상속의 장점 >
		 * 
		 * 1. 공통적인 코드를 부모 클래스로 한번 정의해두면 
		 * 		새로운 클래스 작성 시 보다 적은 양의 코드로 작성 가능
		 * 2. 중복되는 코드를 별도로 관리하기 때문에 
		 * 		중복되는 코드를 변경하거나 새로이 추가할 때 용이
		 * 		=> 즉, 프로그램 생산성과 유지보수에 크게 기여됨
		 * 
		 * < 상속의 특징 >
		 * 
		 * 1. 클래스와 클래스에 있어 다중상속이 불가 (부모클래스를 여러개 둘 수 없음)
		 * 2. 자식타입으로 객체 생성 시 부모생성자 항상 먼저 호출
		 * 		=> 내부적으로 부모객체가 먼저 생성됨
		 * 3. 자식타입의 객체를 통해 부모클래스에 정의 된 멤버에 접근 가능(단, private은 안됨)
		 * 4. 부모클래스에 있는 메소드를 자식클래스에서 재정의 할 수 있음 (==오버라이딩)
		 * 		=> 오버라이딩 된 메소드가 우선권을 가짐
		 * 5. 모든 클래스들은 Object 클래스를 상속받고 있음 (즉, 모든 클래스들은 Object클래스의 하위클래스)
		 * => 모든 객체들은 Object 클래스 내의 메소드를 사용할 수 있음
		 * => 모든 클래스에서는 Object클래스 내의 메소드를 오버라이딩을 통해 재정의 가능
		 */
		
		// Desktop객체 생성
		// brand, pCode, pName, priece, allInOne
		Desktop d = new Desktop("삼성", "d-01","짱짱데스크탑",1500000,true);
		
		// Tv객체 생성
		// brand, pCode, pName, priece, inch
		Tv t = new Tv("엘지","t-1003","올레드",3500000,65);
		
		// SmartPhone객체 생성
		// brand, pCode, pName, priece, mobileAgency
		SmartPhone s = new SmartPhone("애플","s-2001","아이폰",1300000,"KT");
		
		d.setALLinOne(false); // Desktop클래스 메소드 호출
		d.setPrice(2000000);  // Product클래스 메소드 호출
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
	}

}
