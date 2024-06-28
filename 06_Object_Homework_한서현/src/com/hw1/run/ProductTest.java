package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		

		Product p1 = new Product("ssgnote9","갤럭시노트9","경기도 수원",960000,10.0);
		System.out.println(p1.information());
		Product p2 = new Product("1gcnote5","LG스마트폰5","경기도 평택",780000,0.7);
		System.out.println(p2.information());
		Product p3 = new Product("ktsnote3","LG스마트폰3","서울시 강남",250000,0.3);
		System.out.println(p3.information());
		
		System.out.println("==================================================");
					
		Product p4 = new Product("ssgnote9","갤럭시노트9","경기도 수원",1200000,0.05);
		System.out.println(p4.information());
		Product p5 = new Product("1gcnote5","LG스마트폰5","경기도 평택",1200000,0.05);
		System.out.println(p5.information());
		Product p6 = new Product("ktsnote3","KT스마트폰3","서울시 강남",1200000,0.05);
		System.out.println(p6.information());
		
		System.out.println("==================================================");
		
		System.out.println("상품명 = " + p4.ProductName() + "\n부가세 포함 가격 = " + (p4.Price() + (int)(p4.Price()*p4.Tax()))+ "원");
		System.out.println("상품명 = " + p5.ProductName() + "\n부가세 포함 가격 = " + (p5.Price() + (int)(p5.Price()*p4.Tax()))+ "원");
		System.out.println("상품명 = " + p6.ProductName() + "\n부가세 포함 가격 = " + (p6.Price() + (int)(p6.Price()*p4.Tax()))+ "원");
		
	}

}
