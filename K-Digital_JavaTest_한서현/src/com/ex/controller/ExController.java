package com.ex.controller;

import java.util.ArrayList;
import java.util.List;

import com.ex.model.vo.Product;

public class ExController {
	
	// 제품들을 보관할 List 
	private List<Product> list = new ArrayList<>();
	{
		list.add(new Product("키보드", "레오폴드", 150000));
		list.add(new Product("게이밍마우스", "로지텍", 90000));
		list.add(new Product("게이밍모니터", "LG", 300000));
	}
	
	/**
	 * 1. 전체 제품 조회용 메소드
	 * @return 제품들이 담겨있는 ArrayList
	 */
	public List<Product> selectProduct(){
		// 제품 리스트를 반환시키기
		return list; // 우선 이렇게 써놓겠음 (수정해야됨)
	}
	
	/**
	 * 2. 새 제품 추가용 메소드
	 * @param name  추가시키고자 하는 제품의 제품명 
	 * @param brand 추가시키고자 하는 제품의 브랜드명
	 * @param price 추가시키고자 하는 제품의 가격 (문자열)
	 */
	public void insertProduct(String name, String brand, String price) {
		
		// 전달받은 제품명, 브랜드명, 가격을 가지고 새로운 Product객체 생성 후 list에 추가시키기
		// 이때 전달받은 가격은 현재 문자열이기 때문에 숫자로 변환시키는 작업을 해야됨
		
		int num = Integer.parseInt(price);
		
		list.add(new Product(name, brand, num));
		
	}
	
	/**
	 * 3. 제품 삭제용 메소드
	 * @param name  삭제시키고자 하는 제품의 제품명
	 * @param brand 삭제시키고자 하는 제품의 브랜드명
	 * @return 성공적으로 삭제시 1 | 삭제할 제품을 찾지 못했을 경우 0
	 */
	public int deleteProduct(String name, String brand) {
		
		// list에 담긴 모든 Product객체들의 제품명, 브랜드명과
		// 전달받은 제품명과 브랜드명이 둘다 "일치"하는 제품을 찾아 삭제시키기
		// 이때 성공적으로 삭제시 1을 반환하고 그게 아닐 경우 0이 반환될 수 있도록 작성
		
		int result = 0;
		
		for(int i = 0; i <list.size() ; i++) {
			if(list.get(i).getName().equals(name)&&list.get(i).getBrand().equals(brand)) {
				list.remove(i);
				result++;
				break;
			}
			
		}
	
		return result; // 우선 이렇게 써놓겠음 (수정해야됨)
	}
	
	/**
	 * 4. 제품명으로 키워드 검색용 메소드 
	 * @param nameKeyword 검색하고자 하는 제품명의 키워드
	 * @return 검색결과가 담긴 ArrayList (단 검색결과가 존재하지 않을 경우 텅 빈상태)
	 */
	public List<Product> searchProduct(String nameKeyword){
		
		// 검색결과를 담을 새로운 List 생성 
		// list에 담긴 모든 Product객체들의 제품명과 비교시
		// 해당 제품의 제품명에 전달받은 키워드가 "포함"되어 있을 경우
		// 해당 Product객체를 위의 검색결과를 담기 위해 생성한 ArrayList에 담기 
		
		// 해당 검색결과가 담긴 List 반환 
		List<Product> find = new ArrayList<>();
		for(int i = 0 ; i <list.size() ; i++) {
			if(list.get(i).getName().contains(nameKeyword)){
				find.add(list.get(i));
			}
		}
		
		
		
		
		
		return find; // 우선 이렇게 써놓겠음 (수정해야됨)
	}
	
	/**
	 * 5. 특정 제품 가격만 조회용 메소드 
	 * @param name  가격을 조회하고자 하는 제품의 제품명
	 * @param brand 가격을 조회하고자 하는 제품의 브랜드명
	 * @return 조회된 특정 제품의 가격값 (조회결과 없을 시 0 반환)
	 */
	public int selectPrice(String name, String brand) {
		
		// 검색된 제품의 가격을 보관시킬 변수 초기화 시켜두기 (우선은 0으로)
		
		// list에 담긴 모든 Product객체들의 제품명, 브랜드명과
		// 전달받은 제품명과 브랜드명이 둘다 "일치"하는 제품을 찾아 해당 제품의 가격값을 위의 변수에 대입하기
		
		// 가격이 담겨있는 변수값 반환
		
		int price = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(name) && list.get(i).getBrand().equals(brand)) {
				price = list.get(i).getPrice();			
				break;
			}
		}
		
		
		
		
		return price; // 우선 이렇게 써놓겠음 (수정해야됨)
	}
	
	
	

}
