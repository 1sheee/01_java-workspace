package com.br.chap02_string;

public class StringBuilderMain {
	
	public static void main(String[] args) {
		
		
		/*
		 *  < String >
		 *  - 클래스지만 기본자료형처럼 쓸 수 있는 것 => "" (리터럴)로 제시 가능
		 *  - 불변클래스 (수정이 불가능함)
		 *  	ㄴ 그자리에서 변경이 불가능함 => 새로운 주소값을 참조
		 *    
		 *  < StringBuilder, StringBuffer >
		 *  - 객체 생성을 통해서 사용해야됨 => new 로 생성한 후 사용
		 *  - 가변클래스 (수정이 가능함)
		 *  	ㄴ 그 자리에서 변경이 진행 => 매번 동일한 주소값 참조
		 *  
		 *  
		 *  - StringBuilder, StringBuffer는 생성자, 메소드 모두 다 동일
		 *  	다만 차이점 속도 차이있음
		 *  	ㄴStringBuilder = 동기화 제공 x	=> 속도가 빠름 (데이터 안정성 확보 x)
		 *  	ㄴStringBuffer  = 동기화 제공 o	=> 속도가 느림 (데이터 안정성 확보 o)
		 */
		
		String str = "반가워!";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
		str+= "난 String이야"; // str = str + "새문자열";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		// 변경을 할 때마다 새로운 주소값이 대입 == 매번 새로운곳을 참조 (기존 자리에서 변경되는게 아님)
		// 기존에 참조하던 객체를 매번 GC가 지워줘야되는 번거로움
		
		System.out.println("=================================");
		
		// StringBuilder 객체 생성 시 기본적으로 16개의 문자를 담을 수 있는 버퍼가 생성
		
		StringBuilder sb = new StringBuilder("반가워!"); // 초기버퍼값 16 + 글자수
		System.out.println("sb : " + sb);
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " +System.identityHashCode(sb));
		
		System.out.println("=================================");
		
		// sb.append(추가시킬 문자열) : 기존의 문자열에 전달된 문자열을 추가 시켜주는 메소드
		sb.append("안녕!");
		
		System.out.println("sb : " + sb);
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " +System.identityHashCode(sb));
		
		System.out.println("=================================");
		
		// sb.delete(시작인덱스, 끝인덱스) : 기존의 문자열 시작인덱스 <=     <끝인덱스 범위의 문자열 삭제 메소드
		sb.delete(3, 4); 
		System.out.println("sb : " + sb);
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " +System.identityHashCode(sb));
		
		System.out.println("=================================");
		
		// sb.insert(위치, 추가시킬 문자열) : 해당위치에 전달된 문자열 추가
		sb.insert(3, "ㅎㅎㅎ");
		System.out.println("sb : " + sb);
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " +System.identityHashCode(sb));
		
		System.out.println("=================================");
		
		// sb.reverse() : 기존의 문자열을 역으로 순서를 바꿔줌
		sb.reverse();
		sb.insert(3, "ㅎㅎㅎ");
		System.out.println("sb : " + sb);
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " +System.identityHashCode(sb));
		
		System.out.println("=================================");
		
		// 변경용 메소드 실행 시 해당 StringBuilder 객체를 다시 반환해줌
		// 따라서 메소드를 연속적으로 호출할 수 있음 == 메소드 체이닝
		sb.append("ㅋㅋㅋㅋ")
		.delete(0, 4)
		.reverse()
		.insert(0, "!!!");
		
		System.out.println("sb : " + sb);
		System.out.println("수용량 : " + sb.capacity());
		System.out.println("문자열의 길이 : " + sb.length());
		System.out.println("주소값 : " +System.identityHashCode(sb));
		
		// 최종적으로 String 타입에 담고자 할 경우
		String result = sb.toString();
		
	}

}
