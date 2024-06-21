package com.br.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
						
		System.out.print("메뉴 번호를 입력하세요 : 	");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 : System.out.println("입력 메뉴입니다.");break;
		case 2 : System.out.println("수정 메뉴입니다.");break;
		case 3 : System.out.println("조회 메뉴입니다.");break;
		case 4 : System.out.println("삭제 메뉴입니다.");break;
		case 9 : System.out.println("종료 메뉴입니다.");break;
		
		}
		
	}
	
	public void practice2() {

		System.out.print("숫자를 한개 입력하세요 : ");
		int num = sc.nextInt();

		if (num % 2 == 0 && num > 0) {
			System.out.println("짝수다");
		} else if (num % 2 == 1) {
			System.out.println("홀수다");
		} else {
			System.out.println("양수만 입력해주세요.");
		}

	}
	
	public void practice3() {
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학점수 : ");
		int ma = sc.nextInt();
		
		int sum = kor + eng + ma;
		int avg = sum / 3;
		double avg2 = avg;
				
		if(sum >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + ma);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg2);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
		
	}
	
	public void practice4() {
		
		/*
		 * 4~5봄
		 * 6~8여름
		 * 9~11가을
		 * 1~3겨울
		 */
		
		System.out.print("1~12 사이의 정수 입력: " );
		int month = sc.nextInt();
		
		switch(month) {
		case 1 : case 2 : case 3 :
			System.out.println(month + "월은 겨울입니다.");break;
		case 4 : case 5 :
			System.out.println(month + "월은 봄입니다.");break;
		case 6 : case 7 : case 8 :
			System.out.println(month + "월은 여름입니다.");break;
		case 9 : case 10 : case 11 :
			System.out.println(month + "월은 가을입니다.");break;
		default :
			System.out.println(month + "월은 잘못 입력된 달입니다.")
			;
		}
		
		
	}
	
	public void practice5() {
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		int pw = sc.nextInt();
							
		if (id.equals("goodee") && pw == 1234) {
			System.out.println("로그인 성공");

		} else if (!id.equals("goodee")) {
			System.out.println("아이디가 틀렸습니다.");
		} else if (pw != 1234) {
			System.out.println("비밀번호가 틀렸습니다.");
			
		}
		
		
		
		
		
	}
	
	public void practice6() {
		/*
		 * 관리자, 회원, 비회원
		 */
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String grade = sc.nextLine();
		
		switch(grade) {
		case "관리자" : 
			System.out.println("회원관리, 게시글관리");
			System.out.println("게시글 작성, 댓글 작성");
			System.out.println("게시글 조회");break;
		case "회원" : 
			System.out.println("게시글 작성, 댓글 작성");
			System.out.println("게시글 조회");break;
		case "비회원" :
			System.out.println("게시글 조회");break;
		default :
			System.out.println("잘못 입력했습니다.");
			
		}
	}
	
	public void practice7() {
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double h = sc.nextDouble();
		System.out.print("몸무게를 입력해 주세요 : ");
		double w = sc.nextDouble();
				
		
		double bmi = w / (h*h);
		
		if(bmi < 18.5) {
			System.out.println("BMI 지수 " + bmi);
			System.out.println("저체중");
			
		}else if (bmi >= 18.5 && bmi <= 23) {
			System.out.println("BMI 지수 " + bmi);
			System.out.println("정상체중");
		}else if (bmi >= 23 && bmi <= 25) {
			System.out.println("BMI 지수 " + bmi);
			System.out.println("과체중");
		}else if (bmi <= 25 && bmi <= 30) {
			System.out.println("BMI 지수 " + bmi);
			System.out.println("비만");
		}else {
			System.out.println("BMI 지수 " + bmi);
			System.out.println("죽기직전");
		}
					
						
			
	}
	
	public void practice8() {
		
	}

}
