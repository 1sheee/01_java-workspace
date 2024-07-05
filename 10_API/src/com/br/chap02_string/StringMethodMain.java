package com.br.chap02_string;

public class StringMethodMain {
	
	
	public static void main(String[]args) {
		
		String str1 = "Hello World";
		
		// 문자열.charAt(인덱스) : 문자열에서 해당 인덱스의 문자를 반환
		char ch = str1.charAt(3);
		System.out.println(ch);
		
		// 문자열.concat(문자열) : 기존 문자열에 전달된 문자열이 덧붙여서 새로운 문자열로 반환 해주는 메소드
		// ㄴ기존문자열
		String str2 = str1.concat("!!!");
		System.out.println(str2);
		
		// 문자열.equals(문자열) : 두 문자열이 일치하는지 비교 결과값을 반환
		// 문자열.equalsIgnoreCase(문자열) : 두 문자열이 일치하는지 비교 결과값을 반환 (단, 대소문자는 무시)
		String str3 = "hello world";
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str3));
		
		// 문자열.length() : 문자열의 글자수 반환
		System.out.println(str1.length());
		
		// 문자열.contains(문자열) : 기준이 되는 문자열에 전달된 문자열이 포함된 경우 true반환
		System.out.println(str1.contains("llo"));
		
		// 문자열.substirng(시작인덱스)				: 문자열로부터 시작인덱스에서부터 끝까지 추출해서 반환
		// 문자열.substirng(시작인덱스, 끝인덱스)	: 문자열로부터 시작인덱스에서부터 끝 인덱스 이전 추출 및 반환
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(0, 4));
		
		// 문자열.indexOf(탐색할 문자열) : 문자열로부터 전달 된 문자열의 위치(시작인덱스) 반환
		// 문자열.lastIndexOf(탐색할 문자열) : 위와 동일하나 뒤에서부터 탐색
		System.out.println(str1.indexOf("l")); // 2 (앞에서부터 탐색)
		System.out.println(str1.lastIndexOf("l")); // 9 (뒤에서부터 탐색)
		System.out.println(str1.indexOf("a")); // -1 (찾지 못하면 -1반환)
		
		// 문자열.replace(old, new) : 문자열로부터 old문자열 찾아서 new문자열로 치환(변경)한 결과 반환
		System.out.println(str1.replace("l", "c")); // 원본데이터 자체가 바뀌는 것은 아님
		
		// 문자열.toUpperCase() : 문자열을 다 대문자로 변경해서 반환 
		// 문자열.toLowerCase() : 소문자로~
		System.out.println(str1.toUpperCase()); // 원본데이터 자체가 바뀌는 것은 아님
		System.out.println(str1.toLowerCase()); // 원본데이터 자체가 바뀌는 것은 아님
		
		// 문자열.trim() : 문자열의 앞 뒤 공백을 제거시킨 값 반환
		String str4 = "   JA VA   ";
		System.out.println(str4);
		System.out.println(str4.trim()); // 중간에 있는 공백은 제거가 안된다. 
		
		// 문자열.toCharArray() : 문자열의 각 문자들을 char[] 배열에 담아 반환 시켜주는 메소드
		char[]arr= str1.toCharArray();
		System.out.println(arr[0]);
		
		// 문자열.isBlank() : 빈문자열이든 공백문자열이든 true 반환
		// 문자열.isEmpty() : 빈문자열만 true 반환 (공백도 존재하는 문자열로 인식)
		System.out.println("".isBlank());
		System.out.println(" ".isBlank());
		
		System.out.println("".isEmpty());
		System.out.println(" ".isEmpty());
		
		// 문자열.split(구분자) : 문자열로부터 구분자들을 통해 분리시킨 후 String[]에 담아 반환
		String str5 = "Java,Oracle,HTML,CSS,JavaScript";
		String[] strs = str5.split(",");
		System.out.println("배열의 크기(분리된 문자열 수 ) : " + strs.length);
		for(String st :strs) {
			System.out.println(st);
		}
		
		String str6 = "강보람\n홍길동\n";
		String[] strs2 = str6.split("\n");
		System.out.println("배열의 크기(분리된 문자열 수 ) : " + strs2.length);
		for(String st2 : strs2) {
			System.out.println(st2);
		}
		
		
		
	}

}
