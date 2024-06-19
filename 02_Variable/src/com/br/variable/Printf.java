package com.br.variable;

public class Printf {
	
	public void printfTest() {
		
	/*
	 * print(출력값) : 값 출력만 해줌 (줄 바꿈x)
	 * println([출력값]) : 값 출력 후 줄 바꿈까지 해준다
	 * 
	 * printf("출력하고자 하는 형식 (포맷))", [출력값, ...])
	 * : 출력 하고자 하는 값들이 내가 제시한 형식에 맞춰서 출력을 해준다 (줄바꿈 x)
	 * 
	 * <포맷 안에 쓰일 수 있는 키워드>
	 * %d : 정수값이 들어갈 자리 확보
	 * %f : 실수값이 들어갈 자리 확보
	 * %s : 문자열이 들어갈 자리 확보 (문자도 가능)
	 * %c : 문자값이 들어갈 자리 확보 (문자열은 x)
	 * 
	 * %% : % 문자가 출력
	 * %n : 개행문자 => printf에서만 사용 가능
	 */
		
		
		int iNum1 = 10;
		int iNum2 = 20;
		
		// 10 20
		
		System.out.println(iNum1 + " " + iNum2 + "%");
		System.out.printf("%d %d%% %n",iNum1,iNum2);
		
		System.out.printf("%d\n", iNum1, iNum2); // 두번째 값은 무시됨
		//System.out.printf("%d %d\n", iNum1); // 두번째 포맷에 들어갈 값이 없기 때문에
		
		System.out.printf("%5d\n", iNum1); // 5칸의 공간 확보 후 오른쪽 정렬해서 출력, 음수일 경우는 왼쪽 정렬이다
		System.out.printf("%5d\n", 250);
		System.out.printf("%5d\n", 3000);
		System.out.printf("%5d\n", 2);
		
		double dNum1 = 1.23456789;
		double dNum2 = 4.53;
		
		System.out.printf("%f %f\n",dNum1,dNum2); // %f는 무조건 소수점 아래 6째 자리까지 표현한다
		System.out.printf("%.2f %.1f",dNum1,dNum2);
		
		
		char ch = 'a';
		String str = "hello";
		
		System.out.printf("%c %10s %s\n",ch,str,ch);
		
		System.out.printf("%C %S",ch,str); // 대문자로 변환
		
		
	}

}
