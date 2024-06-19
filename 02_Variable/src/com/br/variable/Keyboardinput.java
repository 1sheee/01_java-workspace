package com.br.variable;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Keyboardinput {
	
	public void inputTest1() { //사용자에게 인적사항을 입력 받아 출력해보기)

		/*
		 * < 사용자로부터 키보드로 값 입력 받기>
		 * 자바에서 제공하는 Scanner 클래스의 메소드를 이용해서 값을 입력받을 수 있음
		 * 
		 * 1. Scanner 클래스 생성
		 * 2. Scanner 클래스 내의 nextXXX() 메소드 실행
		 *		next()			: 사용자가 입력한 값 중에 공백 이전까지의 값 문자열로 읽어들이기 -String 변수로 무조건
		 *		nextLine()		: 사용자가 입력한 값 중에 엔터 이전까지의 값 전체 읽어들이기 -String 변수로 무조건
		 *		nextInt()		: 사용자가 입력한 값 중에 정수값을 읽어들이기
		 *		nextDouble()	: 사용자가 입력한 값 중에 실수값을 읽어들이기
		 * 3. 읽어들인 값을 기록 하고자 한다면 변수에 대입해두기
		 *  
		 * 
		 */
		
		//java.util.Scanner sc = new java.util.Scanner();
		Scanner sc = new Scanner(System.in); // System.in : 입력받은 값을 바이트단위로 읽어 들이겠다는 의미
		
		System.out.print("당신의 이름은 무엇입니까 : ");
		//String name = sc.next();
		String name = sc.nextLine();
		
		System.out.print("당신의 나이는 몇살입니까 : ");
		int age = sc.nextInt();
		
		System.out.print("당신의 키는 몇입니까(소수점 포함해서 입력 가능) : ");
		double height = sc.nextDouble();
		
		// 출력형식 : xxx님은 xx살이며, 키는 xxx.xxcm입니다.
				
		System.out.println(name + "님은 " + age + "살이며, 키는" + height + "cm입니다.");
		
	}
		public void preactice() {
			// 사용자에게 이름, 학년, 반 순으로 입력 받은 후
			// 결과를 출력해보기
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("학년(정수값만 입력) : ");
			int grade = sc.nextInt();
			
			System.out.print("반(정수값만 입력) : ");
			int classNum = sc.nextInt();
			
			// xxx님은 x학년 x반입니다.
			
			System.out.print(name +"님은 " + grade + "학년 " + classNum + "반입니다.");
			
			
			
			
			
		}
		
		
		public void inputTest2() {
			
			//이름, 나이, 주소, 키(double)
			
			/*
			 * 키보드로 값을 입력(엔터) --> 버퍼에 값+엔터 들어옴
			 *							--> sc.nextxxx() 메소드 동작
			 *							  	ㄴ 버퍼에 들어온 값을 읽어 들이기 --> 변수에 기록 
			 * sc.nextLine() : 버퍼에서 "엔터" 이전까지의 모든 값을 읽어들인 후 "엔터"르 비워주는 역할
			 * 그 외의 메소드 : 버퍼에서 "엔터" 이전까지의 값을 읽어들인 후 "엔터"를 비워주지 않음
			 * 
			 * sc.nextxxx() 후 sc.nextLine()이 오게 될 경우
			 * 버퍼에 남아있는 "엔터"떄문에 사용자가 값을 입력했다고 인지
			 * 곧 바로 값을 읽어들임 (sc.nextLine() 바로 실행 됨)
			 * 
			 * 해결방법 : sc.nextxxx() 후에 sc.nextLine()이 와야 될 경우
			 * 				sc.nextLine() 수행되기 전에 남아있는 엔터를 비워 줘야함
			 * 				=> 강제로 sc.nextLine() 한번 더 수행 시켜주면 됨
			 * 
			 */
			
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("나이 : ");
			int age = sc.nextInt(); // 숫자값만 읽어들여지고 버퍼에는 엔터값만 남아있음
			
			// 버퍼에 남아 있는 엔터를 비워주는 과정을 추가해야됨
			
			sc.nextLine();
			
			System.out.print("주소 : ");
			String address = sc.nextLine(); // 버퍼에 남아있는 엔터를 사용자가 입력했다고 인식해서 곧바로 읽어들여짐 => "" 문자열이 읽어들여짐
			
			System.out.print("키 : ");
			double height = sc.nextDouble();
			
			sc.nextLine();
			
			System.out.print("학원 : ");
			String academy = sc.nextLine();
			
			
			// xx님은 xx살이며, 사는곳은 xxxx이고, 키는 xxx.xxcm입니다.
			
			
			System.out.print(name + "님은 " + age + "살이며, 사는곳은 " + address + "이고, 키는 " + height + "입니다. " + "학원은 " + academy + " 다닙니다.");
			System.out.printf("%s %d %s %.2d %s",name,age,address,height,academy);
			
		}
		
		public void inputTest3() {
			
			//문자열을 입력 받을 때 -->sc.nextLine() --> String
			//정수값을 입력 받을 때 -->sc.nextiInt() --> int
			//실수값을 입력 받을 때 -->sc.nextDouble() -->double
			
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			
			System.out.print("성별 (M/F): ");
			//char gender = sc.nextChar(); Scanner 클래스에 저 메소드가 없음
			char gender = sc.nextLine().charAt(0);
			// "M" => 0번 인덱스 자리의 문자를 하나 추출 => 'M'
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.println("===" + name + "님의 개인정보===");
			System.out.println("성별 : " + gender);
			System.out.println("나이 : " + age);
			
			
			
			
		}
		
		public void chatAtTest() {
			
			//문자열.chatAt(추출하고자 하는 인덱스 수를 반드시 써야함) --> 문자열로부터 해당 인덱스의 문자값 뽑아서 돌려줌
			
			
			System.out.println("apple".charAt(3));
			
			String fruit = "kiwi";
			System.out.println(fruit.charAt(2));
			//System.out.println(fruit.charAt(10)); // 문자열의 부적절한 인덱스 접근 시
			//StringIndexOutOfBoundsException                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("과일 : ");
			System.out.println(sc.nextLine().charAt(3));
			
			
		}
		
		public void practice2() {
			
			/*
			 * 상품을 등록하는 페이지라는 가정하에
			 * 
			 * 사용자에게 등록하고자 하는 상품의
			 * 상품명, 브랜드명, 가격, 제조국가, 할인율, 등급(A~D 캐릭터 자료형으로) 입력 받은 후
			 * 출력~~
			 *  
			 *
			 * 
			 */
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("상품명 : ");
			String name = sc.nextLine();
			System.out.print("브랜드명 : ");
			String brname = sc.nextLine();
			System.out.print("가격 : ");
			int price = sc.nextInt();
			System.out.print("제조국가 : ");
			String na = sc.nextLine();
			
			sc.nextLine();
			
			System.out.print("할인율 : ");
			double per = sc.nextDouble();
			
			sc.nextLine();
			
			System.out.print("등급 : ");
			char grade = sc.nextLine().charAt(0);
			
			System.out.print(" 상품명 " + name + " 브랜드명 " + brname + " 가격 "+ price + " 국가 " + na + " 할인율 " + (int)(per * 100) + " 등급 " +grade);
			
			
			
			
		}
		
		/*
		 * ** 정리 **
		 * 
		 * 1. 콘솔창(화면)에 출력하기 위해 : System.out.printxx()메소드 이용
		 * 2. 콘솔창(화면)으로 입력 받기 위해
		 * 			ㄴ Scanner sc = new Scanner(System.in);
		 * 			sc.next()...
		 * 			
		 * 			sc.nextxxx() 후에 넥스트 라인이 와야 될 경우 비워주는 과정 필수
		 * 
		 * 			문자 값을 입력 받아 char 변수에 기록하고자 할 경우
		 * 			chatAt 메소드 이용해서 추출
		 * 
		 * 
		 */

}
