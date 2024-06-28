package com.br.chap04_filed.run;

import com.br.chap04_filed.model.vo.FieldTest2;
import com.br.chap04_filed.model.vo.FieldTest3;

public class FieldMain {

	public static void main(String[] args) {
		/*
		FieldTest1 f1 = new FieldTest1();
						// global 메모리상에 만들어짐 = JVM이 0;
		
		f1.test(100);	// num = 100
						// local = 10
		
		// null, local 소멸
		
		f1 = null; // 아무것도 참조 않겠다, 객체소멸 => global 변수 소멸
		
		System.out.println("프로그램을 종료");
		*/
		
		//FieldTest2 f2 = new FieldTest2();
		
		
		//System.out.println(f2.pub); // public이기 때문에 다른패키지에 있어도 직접접근가능
		//System.out.println(f2.pro); // protected일 때 다른패키지의 클래스에서는 접근 불가능
		//System.out.println(f2.def); // default도 다른 패키지일 경우 접근 불가능
		//System.out.println(f2.pri); // private는 그 클래스안에서만 가능
		
		// 클래스명.static변수
		System.out.println(FieldTest3.sta);
		FieldTest3.sta = "새로운값";
		System.out.println(FieldTest3.sta);
		
		System.out.println(FieldTest3.STA_FIN);
		//ieldTest3.STA_FIN = "새로운값";
		
		System.out.println(Math.PI);
	}

}
