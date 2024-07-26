package com.br.run;

import java.io.File;

import com.br.view.CoffeeShopView;

public class CoffeeShopProgram {

	public static void main(String[] args) {
		
		/*
		 * * 커피숍 프로그램
		 * 
		 * 0. 메인 화면
		 * 	  1) 관리자 화면 진입
		 * 		  ㄴ 관리자 ID로 로그인
		 * 	  2) 사용자 화면 진입
		 * 
		 * 1. 관리자 기능 
		 * 	  1) 가게 정보 관리
		 * 		 1_1) 가게 정보 조회
		 * 		 1_2) 가게 이름 수정
		 * 		 1_3) 가게 주소 수정
		 * 		 1_4) 가게 마스터 id 수정 
		 * 
		 * 	  2) 가게 상품 관리
		 * 	 	 2_1) 판매중인 커피 목록 조회
		 * 		 2_2) 판매중인 빵 목록 조회
		 * 		 2_3) 신규 커피 메뉴 추가
		 * 			   ㄴ 동일한 이름, 동일한 가격 정보 조회시 추가 불가하도록 해놓았음
		 * 		 2_4) 신규 빵 메뉴 추가 
		 * 			   ㄴ 동일한 이름, 동일한 가격 정보 조회시 추가 불가하도록 해놓았음 
		 * 
		 *    3) 가게 매출 관리
		 *    	 3_1) 전체 판매 내역 조회
		 *    	 3_2) 특정 고객 구매 내역 조회 
		 *    
		 *    
		 * 2. 사용자 기능
		 * 	  1) 사용자 정보 조회
		 * 		  ㄴ 보유금액 충전 가능
		 * 
		 * 	  2) 장바구니 조회
		 * 		  ㄴ 장바구니 내역 결제 가능
		 * 			 => 파일로 저장됨 
		 * 
		 *    3) 메뉴 주문 하기 
		 *    	  ㄴ 커피목록, 빵목록 조회
		 *    	  ㄴ 반복적으로 주문 가능 
		 */
		
		
		
		// 사용자가 결제시 주문내역을 보관시킬 폴더 생성 
		File paymentFolder = new File("payment");
		if(!paymentFolder.exists()) {
			paymentFolder.mkdir();
		}
		
		new CoffeeShopView().welcomePage();

	}

}
