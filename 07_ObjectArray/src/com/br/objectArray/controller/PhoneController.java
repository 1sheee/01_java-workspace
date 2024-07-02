package com.br.objectArray.controller;

import com.br.objectArray.model.vo.Phone;

// m(model)v(view)c(controller)

// 요청처리만을 담당하는 클래스



public class PhoneController {
	

	/**
	 * 판매중인 핸드폰 목록(배열)을 전달 받아
	 * 전체 출력시켜주는 기능의 메소드
	 * 
	 * 
	 * @param phones 판매중인 핸드폰목록의 배열객체
	 */
	
	public void selectAllPhone(Phone[] phones) {// 셀렉트는 조회할 때 쓴다
		/*
		for(int i=0;i<phones.length;i++) {
			System.out.println(phones[i].information());
		}
		*/
		for(Phone ph : phones) {
			System.out.println(ph.information());
		}
	}
	
	/**
	 * 판매중인 핸드폰목록(배열)을 전달받아
	 * 해당 핸드폰들의 평균 가격을 구해 반환해주는 기능 메소드
	 * 
	 * @param phones 판매중인 핸드폰 목록의 배열객체
	 * @return 핸드폰들의 평균 가격
	 */
	
	public double selectPhoneAvgPrice(Phone[] phones) {
		int sum = 0;
		/*
		for(int i=0;i<phones.length;i++) {
			sum += phones[i].getPrice();
		}
		*/
		for(Phone ph : phones) {
			sum += ph.getPrice();
		}
		
		return (double)sum / phones.length;
	}
	
	/**
	 * 판매중인 핸드폰목록과
	 * 검색하고자하는 핸드폰정보(핸드폰명+시리즈명)를 전달받아
	 * 검색된 핸드폰의 가격을 반환해주는 기능의 메소드
	 * 
	 * @param phones 판매중인 핸드폰 목록의 배열객체
	 * @param buy 검색하고자 하는 핸드폰의 정보
	 * @return 검색된 핸드폰의 가격 | 검색 결과가 없을 경우 0
	 */
	public int searchPhonePrice(Phone[] phones, String buy) {
		/*
		for(int i = 0; i<phones.length;i++) {
			if( (phones[i].getName() + phones[i].getSe()).equals(buy) ) {
			return phones[i].getPrice();
			}
		}
		*/
		for(Phone ph : phones) {
			if((ph.getName() + ph.getSe()).equals(buy)){
			return ph.getPrice();
			}
		}
		
		return 0;
		
	}
	
	/**
	 * 판매중인 핸드폰목록과
	 * 검색하고자하는 핸드폰정보(키워드값+시리즈명)를 전달받아
	 * 검색된 핸드폰의 가격을 반환해주는 기능의 메소드
	 * 단, 키워드 검색으로 구현
	 * (즉, 일치하는지 비교가 아닌 포함하고 있는지 비교하기)
	 * 
	 * 이때 검색결과가 여러개일 수 있으니
	 * 검색된 가격값들을 int[]에 담아서 반환
	 * 
	 * @param phones 판매중인 핸드폰 목록의 배열객체
	 * @param buy 검색하고자 하는 핸드폰의 정보
	 * @return 검색된 가격값들이 담겨있는 int[]객체 | 검색결과가 없을경우 {0,0,0,0,0}
	 */
	public int[] searchKeywordPhonePrice(Phone[] phones, String buy) {

		// 검색결과값을 담기 위한 int[]
		int[] prices = new int[phones.length]; // {0,0,0,0,0}
		/*
		for (int i = 0; i < phones.length; i++) {
			if ((phones[i].getName() + phones[i].getSe()).contains(buy)) {
				prices[i] = phones[i].getPrice();
			}

		}
		*/
		int i = 0;
		for(Phone ph : phones) {
			if((ph.getName() + ph.getSe()).contains(buy)) {
				prices[i] = ph.getPrice();
			}
			i++;
		}
		// 만약에 1, 2번 인덱스가 검색된 핸드폰일 경우
		// prices => {0,1000000,2000000,0,0}
		
		// 검색된 핸드폰이 없었다면 prices => {0,0,0,0,0}
		
		return prices;
	}
	
	
	
}
