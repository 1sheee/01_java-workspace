package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력1(1~9) : ");
		int num1 = sc.nextInt();
		System.out.print("정수입력2(1~9) : ");
		int num2 = sc.nextInt();
		
		int result = num1 * num2;
		
		if(num1 >= 1 && num1 <= 9 && num2 >= 1 && num2 <= 9) {
						
			if(result >= 10) {
				System.out.println("두 자리 수 입니다.");	
				}else {
					System.out.println("한 자리 수 입니다.");
				}
			
		}
	}

}
