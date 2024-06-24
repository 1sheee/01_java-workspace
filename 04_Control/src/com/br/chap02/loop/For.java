package com.br.chap02.loop;

import java.util.Scanner;

public class For {
	
	Scanner sc = new Scanner (System.in);
	
	/*
	 *  < 반복문 >
	 *  프로그램의 흐름을 제어하는 제어문 중 하나
	 *  특정 코드를 반복정으로 수행시켜줌
	 *  
	 *  두 종류 (for문 / while문(do-while문)
	 *  
	 *  for문
	 *  
	 *  for (초기식; 조건식; 증감식) { 반복 횟수 지정하기 위해 제시 해야됨
	 *  반복코드;     ㄴ 세미콜론은 무조건 있어야 됨, 식은 다 생략해도 됨
	 *  }
	 *  
	 *  - 초기식 : 반복문이 수행될 때 "처음에 단 한번만 실행되는 구문"
	 *  			보통 반복문 안에서 사용될 변수를 선언 및 초기화하는 구문
	 *  
	 *  - 조건식 : "반복문이 수행 될 조건" 작성하는 구문
	 *  			조건식이 true일 경우 해당 블럭안의 구문 실행
	 *  			조건식이 false일 경우 반복 멈추고 나옴
	 *  			보통 초기식에 제시된 변수를 가지고 조건식을 작성함
	 *  
	 *  - 증감식 : 반복문을 제어하는 변수 값을 증감 시키는 구문
	 *  			(보통 초기식에 제시된 변수를 가지고 증감연산자와 함께 작성)
	 *  
	 *  * 실행되는 순서
	 *  
	 *  초기식 => 조건식 검사 => true일 경우 블럭안의 코드 실헹 => 증감식
	 *  		=> 조건식 검사 =>								=> 증감식
	 *  ------------------------------------------------반복수행--------
	 *  		=> 조건식 검사 => false일 경우 그 즉식 반복문을 빠져나옴
	 *  
	 *  
	 */
	
	public void method1() {
		// 안녕하세요 5번 반복 출력
		/*
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		*/
		
		for(int i = 1; i<= 5;i++) { // 반복문이 돌 때마다 i는 1,2,... 순으로 증가
			System.out.println("안녕하세요");
		}
		
		for(int i = 0; i<= 4;i++) {
			System.out.println("반갑습니다");
		
	}
	
		/*
		 * Tip. 내가 원하는 횟수만큼 반복문 돌리고자 할 때
		 * for(int = 0 ; i  횟수; i++)
		 * 					ㄴ 내가 원하는 횟수보다 작을때까지
		 */
		for(int i=11;i <= 15;i++) {
			System.out.println("저리가세요");}
		
		for(int i = 1; i <= 9; i+=2) {
			System.out.println("hello");
		}// += 증감식을 지금 안쓰고 뒤에 이렇게 써도 된다.
		
		}
	
		public void method2() {
			
//			System.out.println(1);
//			System.out.println(2);
//			System.out.println(3);
//			System.out.println(4);
//			System.out.println(5);
//			
			for(int i=1; i <= 5;i++) {//i의 값이 1~5까지 수행
				System.out.print(i + " ");
				
			}
//			System.out.println(i); // 반복문안에 선언된 변수는 반목문 블럭 안에서만 사용 가능
			
			
			
		}
		
		public void method3() {
			// 5 4 3 2 1
			
			for(int i = 5;i >= 1;i--) {
				System.out.print(i + " ");
			}
			
		}
		
		public void method4() {
			
			// 1...10
			
			for(int i=0; i<10; i++) {
				System.out.print(1 + i + " ");
				
			}
		}
		
		public void method5() {
			
			// 1~10
			
			for(int i=1; i<=9;i+=2) {
				System.out.println(i);
			}
		
			for(int i=1; i<=10; i++) { // 반복횟수 자체는 10회이다.
				if(i % 2 != 0)
				System.out.print(i + " "); // 조건문을 같이 쓸 수 있다.
			}
			
		}
		
		public void method6() {
			
			// 1에서부터 10까지의 총 합계
				int sum = 0;
			for(int i=1; i <= 10; i++) {
				sum += i;
				
//				sum += 1;
//				sum += 2;
//				sum += 3;
//				... = > 10번 반복
//				더해지는 특정 값이 1~10까지 1씩 증가되는 값
				// for문이 안에 출력문이 안에 있으면 계속 출력된다.
				
			}
			System.out.println("1에서부터의 10까지의 총 합계 : " +sum);
		}
		
		public void method7() {
			
			// 1에서부터 사용자가 입력한 수까지의 합계
			
			System.out.print("정수(1이상의 정수) : ");
			int num = sc.nextInt();
			int sum = 0;
			
			if(num > 0) {
				for(int i=1;i <= num ;i++) {
					sum += i;
				}
				System.out.print("1에서부터 " + num + "까지의 총 합계 : " + sum);
			}else {
				System.out.println("잘못입력하셨습니다. 다시 입력해라.");
			}
			
		}
		
		public void method8() {
			
			// 1에서부터 랜덤값(1~10사이 정수랜덤값)까지의 총 합계
			/*
			 * java.lang.Math 클래스에서 제공하는 random() 메소드 호출 => 0.0 ~ 0.999999사이의 실수랜덤값
			 */
			
			//int random = Math.random(); // double형이라서 오류
			//			  0.0 <=    < 1.0      =>  0.0 ~ 0.99999999
			
			//int random = Math.random() * 10;
			//		  	  0.0 <=    < 10.0	   =>  0.0 ~ 9.99999999
			
			//int random = Math.random() * 10 + 1;
			//	  	 	  1.0 <=    < 11.0	   =>  1.0 ~ 10.99999999
			
			int random = (int)(Math.random() * 10 + 1);
			//			   1 <=     < 11	   =>  1 ~ 10
			
			System.out.println("1~10사이의 랜덤값 : " + random);
			
			int sum = 0;
			for(int i=1; i<=random; i++) {
				sum += i;
			}
			
			System.out.println("1에서부터 " + random + "까지의 총 합계 : " + sum);
			
			/*
			 * Tip. 랜덤값 발생 범위 지정
			 * (int)(Math.random() * 발생시킬랜덤값갯수 + 시작수)
			 * 
			 * ex) 1 ~ 10 => (int)(Math.random() * 10 + 1)
			 *    11 ~ 20 => (int)(Math.random() * 10 + 11)
			 * 
			 */
//다시 봐야됨			
			
			
		} 
		
	
		public void method9() {
			// 문자열로부터 각 인덱스의 문자들을 뽑아서 출력
			/*
			 * ex Stirng str = "hello" H => 출력(str.charAt(0)); E... L L O
			 * 
			 * 
			 * 0번 인덱스부터 마지막인덱스(4)까지 매번 1씩 증가되면서 반복 수행
			 */

			String str = "kiwi";

			//for (int i = 0; i <= 4; i++) {
			for(int i=0; i<str.length();i++) { //str.lenth 문자열 길이를 돌려준다.
				System.out.println(str.charAt(i));
			}

		}
		
		public void method10() {
			
			//사용자에게 문자열 입력 받아서 모든 인덱스의 문자 출력
			
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			
			// 0번인덱스 ~ 마지막인덱스(문자열의길이-1) 추출 후 입력
			
			
			System.out.println(str + "의 글자수(길이) : " + str.length());
			
			for(int i=0; i < str.length();i++) {//i <= str.lengh()-1로 쓸수도
				System.out.println(str.charAt(i));
				
			}
			
		}
		
		public void method11() {
			// 2단 출력
			/*
			 *  2 x 1 = 2
			 *  2 x 2 = 4
			 *  ...
			 */
			
			for(int i = 1; i <= 9;i++) {
				System.out.printf("%d x %d = %2d\n", 2, i, 2*i);
			}
		}
		
		public void method12() {
			// random(2-9)단을 출력하게 출력
			
			int random = (int)(Math.random() * 8 + 2);
			
			// 1개의 단을 랜덤으로 출력하는 for문
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %2d\n", random, i, random * i);
			}
			
		}
		
		public void method13() {
			// 중첩 for문
			/*
			 * 2단~9단 전체 출력하는 것
			 */
			
			for(int random =2; random <=9; random++) {
			
			System.out.println("====== " + random + "단 ======");
				for(int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %2d\n", random, i, random * i);
			} System.out.println();
			}
			
		}
		
		public void method14() {
			// 1 2 ...
			// 1 2 ...
			// 1 2 ...
			for(int j = 0; j < 3; j++) {
			for(int i = 1; i <= 5; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			}
		}
		public void method15() {
			// ****
			// ****
			// ****
			// ****
			
			// 행은 0~3까지 1씩 증가되는 형태 => 바깥쪽 for문
			// 각 행별 열 0열~3열까지 1씩 증가 => 안쪽 for문
			
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 4; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		public void method16() {
			// 1*** => 1행 1열
			// *2** => 2행 2열
			// **3* => 3행 3열
			// ***4 => 4행 4열

			for (int i = 1; i <= 4; i++) { // 행의 반복문
				for (int j = 1; j <= 4; j++) { // 각 행별 열의 반복문

					if (i == j) {
						System.out.print(j);
					} else {
						System.out.print("*");
					}

				}
				System.out.println();
			}

		}
}


