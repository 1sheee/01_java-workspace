package com.br.array;

import java.util.Scanner;

public class Array { Scanner sc = new Scanner(System.in);
	
	/*
	 * > 변수 : 하나의 공간에 하나의 값을 담을 수 있음
	 * < 배열 >
	 * 
	 * 1. 여러개의 값들을 하나로 관리할 수 있는 자료구조
	 * 		(즉, 다수의 값들을 한 공간에 담을 수 있음)
	 * 2. 단, "같은 자료형의 값"들로만 담을 수 있음
	 * 3. 각 값들을 구분하기 위해 인덱스를 활용함
	 * 4. 배열을 이용하면 반복문을 활용할 수 있다는 장점이 있음
	 */

	public void method1() {
		/*// 변수를 활용해소 다수의 데이터 관리
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		// 일괄 출력 => 반복문 활용 불가
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		// 총합계 출력 => 반복문 활용 불가
		int sum = num1 + num2;
		*/
		
		/*
		 * < 배열 선언 및 생성(할당) >
		 * 
		 * 여러개의 값들을 보관할 공간을 메모리상에 할당받는 과정
		 * 어떤 자료형의 값들을 몇개 담을건지 고려해야함
		 * 
		 *  1. 배열 선언
		 *  
		 *  	[표현법] 자료형ex)int.. 배열명[]; 
		 *  			자료형 [] 배열명; - 추천!
		 *  
		 *  2. 배열 생성(할당)
		 *  	몇개의 값을 담을건지 그 크기만큼의 배열을 만들어야됨
		 *  	
		 *  	[표현법] 배열명 = new 자료형[배열의 크기 지정];
		 *  
		 *  3. 배열 선언과 동시에 생성 (1+2)
		 *  
		 *  	[표현법] 자료형 [] 배열명 = new 자료형[배열의 크기 지정];
		 *  
		 *  4. 배열 내에 값 대입
		 *  	배열이라는 공간 내에 특정위치(인덱스)에 값을 대입
		 *  
		 *  	[표현법] 배열명[인덱스] = 값;
		 *  
		 */
		//	변수 선언
		//int a;
		
		//	변수 선언
		//int arr[];
		//int [] arr;
		
		// 배열 생성
		//arr = new int[5];
		
		// 배열 선언과 동시에 생성
		int[] arr = new int[5]; // 0번인덱스...4번인덱스 방이 만들어짐
		
		// 배열에 값 대입
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		
		// 일괄출력
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		*/
		for(int i=0; i<=4; i++) {
			System.out.println(arr[i]);
		}
		
		// 총합계 출력 => 반복문 활용
		int sum = 0;
		for(int i=0; i<=4; i++) {
			sum += arr[i];
		}
		System.out.println("총합계 : " + sum);
		System.out.println("전체값 : " + arr);// 배열의 자료형@배열의주소값
		
	}
	
	public void method2() {
		
		int i  = 10;
		int[] iArr = new int[3];
		
		System.out.println(i);
		System.out.println(iArr);
		
		double[] dArr = new double[3];
		System.out.println(dArr);
		
		/*
		 * 실제 데이터값을 곧바로 담을 수 있는 변수를 일반 변수라고 함
		 * 주소값을 담고 있는 변수는 참조 변수(레퍼런스 변수)라고 함
		 * 
		 * 기본자료형(boolean, char, byte, short, int, long, flaoat, double)으로 선언된 변수
		 * == 일반 변수 == 실제 데이터값을 바로 담기 가능
		 * 
		 * 그 외 자료형(int[], double[]... String, Scanner, Variable...)
		 * == 참조 변수 == 주소값을 담는 변수
		 * 
		 */
		
	}
	
	public void method3() {
		
		int[] iArr = new int[3]; // 0~2번 인덱스
		double[] dArr = new double[2]; //0~1번 인덱스
		
		// 아직 초기화는 진행하지 않은 상태 (값 대입은 안함)
		
		for(int i=0; i<3 ; i++) {
			System.out.println(iArr[i]);
		}
		
		for(int i=0; i<2; i++) {
			System.out.println(dArr[i]);
		}
		
	}
	
	/*
	 * 내가 각 인덱스 자리에 초기화를 하지 않아도 값들이 담겨있음!
	 * 
	 * 
	 * 	< Heap 메모리 >
	 * 
	 * 	1. Heap에 생성된 공간(객체)마다 고유한 주소값을 부여해줌
	 * 		ㄴ 중복되지 않음 == 다른 객체들과 구별됨
	 * 	2. heap이라는 공간에는 절대 빈 공간이 존재 할 수 없음
	 * 		즉, 초기화를 진행해야됨
	 * 		****이때 초기화를 하지 않을 경우 JVM이 알아서 초기화를 해줌 (각 자료형에 맞는 기본값으로)****
	 * 
	 */
	
	public void method4() {
		int[] arr = new int[100]; // 0~4인덱스 (4번이 마지막 인덱스 == 배열의크기-1)
		/*
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 4;
		arr[4] = 5;
		*/
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr); //16진수 형태로 보여진다
		System.out.println(arr.hashCode()); //10진수로 보여지게 한다.
		System.out.println(arr.length);
		
		
		
	}
	
	public void method5() {
		
		int result1 = 0;
		
		// 논리형의 기본값 : fasle
		// 정수형의 기본값 : 0
		// 실수형의 기본값 : 0.0
		// 문자형의 기본값 : ' '
		
		// 참조자료형의 기본값 : null
		String result2= null;
		int[] arr = null;
		
		//int a = null;
		// NullPointerException : null을 가지고 특정인덱스에 접근하거나 메소드 호출하거나 할 때 발생되는 오류
		//	 						ㄴ해결방법 : 객체생성을 해야됨
		//System.out.println(arr);
		//System.out.println(arr[0]);
		//System.out.println(arr.length);
	}
	
	public void method6() {
		
		int [] arr = new int[5]; // 0~4번
		
		/*
		 * 02
		 * 14
		 * 26
		 * 28
		 * 410
		 */
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = 2+i*2; // arr[i] = 2 * (i+1)
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr.hashCode());
		System.out.println(arr.length);
		
		//추가적으로 값을 더 담고싶음
		/*
		 * ArrayIndexOutOfBoundsException : 배열에 부적절한 인덱스 제시시 발생
		 * 
		 */
		//arr[5] = 12;
		//arr[6] = 14;
		
		/*
		 * < 배열의 가장 큰 단점 >
		 * 한번 지정된 배열의 크기는 변경이 불가
		 * => 배열의 크기를 변경하고자 할 경우 다시 만들어야 됨
		 */
		
		arr = new int[7]; //7로 변경
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr.hashCode());
		System.out.println(arr.length);
		
		/*
		 * 연결이 끊겨진 기존 배열 Heap영역에 둥둥떠다님 == 불필요한 존재가 됨 == 지워주는 역할
		 * => 일정 시간이 지나면 "가비지컬렉터(gc)"가 알아서 지워줌 (자바의 특징)
		 * 		자바에서의 "자동메모리관리" 특징 == 개발자는 그냥 코드작성에만 신경쓰면됨
		 * 
		 *  배열을 강제로 삭제 시키고자 할 경우 == 연결고리르 끊으면 됨
		 *  ex) arr=null;
		 */
	}
	public void method7() {
		// 1. 크기 10짜리 정수 배열 생성
		
		// 2. 반복문을 활용해서 0~마지막 인덱스까지 순차적으로 접근하면서 값 대입
		//	매번 1~100사이의 랜덤값을 발생시켜서 대입
		
		// 3. 반복문을 활용해서 해당 배열의 모든인덱스에 담겨있는 값 출력
		// arr[x] : xx
		// + 홀수만 출력
		
		int [] arr = new int [10];
		
		
		for(int i = 0; i<arr.length;i++) {
			arr[i]  = (int)(Math.random() * 100 + 1);
		}
		int sum = 0; // 짝수일 경우
		int count= 0; // 짝수값들의 갯수를 담을 변수
		for(int i =0; i<arr.length;i++) {
			if(arr[i] % 2 == 1) {
			System.out.println("arr["+ i +"]" + ":" + arr[i]);
		} else{ // 짝수일 경우 + 짝수 값들의 총합계와 개수출력
			sum += arr[i]; // 총합계
			count++;
		}
		}
		System.out.println("짝수의 총 합 : "+ sum);
		System.out.println("짝수 갯수 : " + count);
	}
	public void method8(){//8시작
		
		// 1. 사용자에게 배열의 길이(크기) 입력 받고
		// 		그 크기만큼의 문자열 배열생성
		
		// 2. 반복문을 활용해서 대입, 매번 과일명을 입력받아
		// 각 인덱스 자리에 대입
		// + 사용자가 입력한 과일명 값이 exit일 경우 반복이 종료
		// 3. 반복문을 활용해서 모든 값 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		
		String[] arr = new String[size];
		
		sc.nextLine();
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print(i + "번째 과일명 입력 : ");
			//arr[i] = sc.nextLine();
			String fr =sc.nextLine();
			
			if(fr.equals("exit")){
				break;
			}
			arr[i] = fr;
		
		}
		for(int i =0;i<arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
	}//8끝
	
	public void method9() {//9s
		/*
		 * 세학생의 키 정보를 담기 위한 double배열 생성
		 * 반복적으로 사용자에게 키 정보를 입력받아 대입
		 * 각 인덱스에 대입된 값 출력
		 * 
		 * 
		 * x번 학생의 키 : xxx.xcm형식
		 * 
		 * 
		 */
		
		double[] arr = new double[3];
		
		double sum = 0.0;
		for(int i=0; i<arr.length; i++) {
			System.out.print("키 입력 : ");
			arr[i] = sc.nextDouble();
			}
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d번 학생의 키 : %.1fcm\n", i+1, arr[i]);
			sum += arr[i];
		}
		System.out.println("학생들의 키 총합 : " + sum);
		System.out.println("학생들의 키 평균 : " + (sum / arr.length));
		
	}//9e
	
	public void method10() {//10s
		
		/* 사용자에게 문자열 하나 입력 받은 후
		 * 각각의 인덱스에 있는 문자들을 char배열에 옮겨담고 출력
		 */
		
		/*	
		 *	1. 사용자에게 문자열 입력 받고
		 *	2. char 배열 생성해두기 (이때 배열의 크기 == 문자열의 길이)
		 *	3. 반복문을 활용해서 문자열의 각 인덱스 자리의 문자를
		 *		배열의 각 인덱스 자리에 대입
		 *	4. 배열에 담긴 값 전체 출력
		 */
		
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		char [] arr = new char [str.length()];
		
		for(int i = 0;i < str.length();i++) { //arr.length()도 써도 된다.
			arr[i] = str.charAt(i);

		}for(int i = 0;i < str.length();i++) {
			System.out.println(arr[i]);
		}
		
		
	}//10e
	
		public void method11(){//11s
			/*
			 * 사용자에게 문자열 입력 받아
			 * 이때 각 문자마다 +1이 진행된 문자열을 얻고싶다.
			 * ex) "AAP" (입력) => "BBQ" (출력)
			 * 		"GDKKN" (입력) => "HELLO" (출력)
			 * 
			 * 		해당 출력할 결과값을 String result에 기록한 후 출력하시오.
			 */
			
			// 1. 사용자에게 문자열 입력받기
			// 2. 문자열의 글자수만큼 문자를 보관할 char 배열 생성
			// 3. char배열의 각 인덱스 자리에 문자열로부터 추출된 문자값의 그 다음문자값을 대입
			// 4. char배열에 대입되어 있는 각 문자들을 문자열로 연이어줌
			// 5. result 출력
			
			System.out.print("문자열을 입력하세요 : ");
			String str = sc.nextLine();
			
			char [] arr = new char [str.length()];
						
			for(int i = 0;i < str.length();i++) {
				arr[i] = (char)(str.charAt(i) + 1); // 타입이 안 맞으면 같게 맞춰준다 문자+1은 int형이니
			}
			/*
			String result = "";
			*/
//			for(int i = 0;i < str.length();i++) {
//			
//				
//			}
			String result = String.valueOf(arr);
			
			// String.valueOf(문자열화 시키고자 하는 값); : 전달된 값을 가지고 문자열로 만들어 반환해주는 메소드
			System.out.println(result);		
			
			
		}//11e
		
		public void method12() {
			/*
			 * < 배열 선언과 동시에 초기화 >
			 * 배열 생성과 동시에 각 인덱스에 초기값 대입하는 과정
			 * 
			 * [표현법]
			 * 자료형[] 배열명 = new 자료형[]{}; 	- 방법1
			 * 자료형[] 배열명 = new {값1, 값2..};  - 방법2
			 * 
			 */
			
			int arr1 [] = new int[] {1, 2, 3, 4};
			int arr2 [] = {1, 2, 3, 4};
			
			//	배열을 먼저 선언 한 후에 초기화를 진행하고자 한다면 반드시 방법1을 이용
			int[] arr;
			//arr = {1, 2, 3, 4};
			arr = new int[]{1, 2, 3, 4}; 
			
			System.out.println(arr1 == arr2); // false
			// 각 변수에 담겨있는 주소값을 가지고 비교하기 때문에 false
			
		}
}
