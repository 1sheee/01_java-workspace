package com.br.chap01.condition;

import java.util.Scanner;

public class Switch {
	
	Scanner sc = new Scanner(System.in);
	
	/*
	 * 
	 * * switch 문
	 * 
	 * if문과 동일하게 조건문
	 * 차이점 : if문은 자유롭게 조건식을 작성
	 * 			switch문은 동등비교만을 수행
	 * 
	 * switch(동등비교 대상자){
	 * case 값1 : 실행코드1; break;
	 * case 값2 : 실행코드2; break;
	 * ...
	 * default: 위의 모든값들과 일치하지 않을 경우 실행코드; - 필수는 아님
	 * }
	 */

	public void method1() {
		
		/*
		 * 정수를 입력받아
		 * 1일 경우 "빨간색"
		 * 2일 경우 "파란색"
		 * 3일 경우 "초록색"
		 * 잘못입력했을 경우 : "잘못입력하였습니다."
		 */
		
		System.out.print("정수(1~3) : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("빨간색");break;
		case 2 :
			System.out.println("파란색");break;
		case	 3 :
			System.out.println("초록색");break;
		default : System.out.println("잘못입력"); // break 걸 필요 X
		}
		
	}
	
	public void method2() {
		// 메뉴에 따른 가격 출력
		
		System.out.print("구매하고자 하는 과일(사과, 바나나, 복숭아) : ");
		String fr = sc.nextLine();
		
		int price = 0; // double = 0.0;
		switch(fr) {
		case "사과": price = 1000;break;
		case "바나나": price = 2000;break;
		case "복숭이": price = 3000;break;
		default : System.out.println("제대로 입력해라");return; // 리턴 써야함 break 아님
		
		}
		System.out.println(fr + "의 가격은 " + price +"원입니다.");
		
		// ㅇㅇㅇ의 가격은 ㅇㅇㅇㅇ원입니다.
	}
	
	public void method3() {
		// 성별 입력 받아 => "남학생 || 여학생"
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		String result = "";
		
		switch(gender) {
		case 'm' : 
		case 'M' : result = "남학생";break;
		case 'f' : 
		case 'F' : result = "여학생";break;
		default : System.out.println("성별 오류");
		}
		if(!result.equals("")) {
			System.out.println("사용자는 : " + result + "입니다.");	
		}
		
		
	}
	
	public void method4() {
		// 달을 입력 받아 해당달의 마지막 날짜를 출력
		/*
		 * 
		 * 135781012 31일
		 * 46911 30일
		 * 2 = > 28 or 29일
		 * 
		 */
		
		System.out.print("1월~12월 중 하나를 입력 (정수) : ");
		int month = sc.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.print("입력하신 월은 31일까지입니다.");break;
		case 4: case 6: case 9: case 11:
			System.out.print("입력하신 월은 30일까지입니다.");break;
		case 2:
			System.out.print("입력하신 월은 28일 또는 29일까지입니다.");break;
		default:
			System.out.print("반드시 1~12월까지는 입력해야합니다.");
		
		}
		
		/*
		 *  * 유의사항
		 *		비교대상자는 int, char, String형만 가능 - double은 안됨
		 *		단, byte, short, char는 int로 인식되기 때문에 가능
		 */
		
		
	}
	
}
