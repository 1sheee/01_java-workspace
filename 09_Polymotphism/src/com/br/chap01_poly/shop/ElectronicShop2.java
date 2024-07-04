package com.br.chap01_poly.shop;

import com.br.chop01_poly.model.vo.Electronic;

// 전자제품 판매 가게
public class ElectronicShop2 { // 다형성 적용
	
	// 부모타입 배열로 모든 자식객체 수용 가능
	
	private Electronic[] elec = new Electronic[3];
	private int count = 0;
	
	public void insert(Electronic any) { // Electronic any = Desktop
											// Electronic any = Tablet...
		elec[count++] = any; // 차곡차곡 count++
	}
	
	public Electronic select(int index) {
		return elec[index];
	}
	
}
