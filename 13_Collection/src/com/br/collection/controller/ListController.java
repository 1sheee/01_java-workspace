package com.br.collection.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.br.collection.model.vo.Music;

public class ListController {//s
	
	/*
	 *  < java.util.Collection > List > ArrayList >
	 *  
	 *  1. 선형자료구조의 컬렉션으로 배열을 가지고 있어
	 *  	데이터가 순차적으로 보관되어 관리됨
	 *  2. 특징
	 *  	ㄴ 순서대로 데이터가(value)가 저장
	 *  	ㄴ 인덱스로 각 데이터가 관리
	 *  	ㄴ 중복 데이터 보관 가능
	 *  	
	 *  
	 */
	
	public void arrayListTest1() {
//		List list = new List(); // List는 인터페이스임 == 객체생성 불가능
		
		// 제네릭 타입을 지정하지 않을 경우 => Object클래스가 된다.
		List list = new ArrayList();
		
		list.add(10);
		list.add("안녕하세요");
		list.add(5.12);
		System.out.println(list/*.toString()*/); // 참조변수라
		
		list.add(2, "안녕하세요2");
		System.out.println(list);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4)); // IndexOutOfBoundsException
		
		
	}
	
	public void arrayListTest2() {
		
		// 정수값만 보관 가능한 list생성
		List<Integer> numlist = new ArrayList<Integer>();
		
		numlist.add(1);
		numlist.add(2);
		numlist.add(3);

		System.out.println(numlist);
		
		System.out.println("요소 갯수(리스트의 사이즈) : " + numlist.size());
		
		System.out.println("리스트의 마지막 인덱스 수 : "+ (numlist.size()-1));
		
		for(int i = 0 ; i<numlist.size() ; i++) {
			System.out.println(numlist.get(i));
		}
	}
	
	public void arrayListTest3() {
		
		// 문자열만 저장가능 list 생성
		
		List<String> strlist = new ArrayList<>(); // 뒤에 또 <String> 쓸 필요 x
		
		strlist.add("족발");
		strlist.add("보쌈");
		strlist.add("닭도리탕");
		
		System.out.println(strlist);
		
		System.out.println("요소 갯수(리스트의 사이즈) : " + strlist.size());
		
		System.out.println("리스트의 마지막 인덱스 수 : "+ (strlist.size()-1));
		
		for(int i = 0 ; i < strlist.size() ; i++) {
			System.out.println(strlist.get(i));
		}
		
		for(String lst :strlist) {
			System.out.println(lst);
		}
		
	}
	
	public void arrayListTest4() {
		
		String[] seasonArr = {"봄", "여름", "가을", "겨울"};
		
		// 현재 배열을 List로 변경하고자 할 경우
		
		// * Arrays.asList(배열) : 전달된 배열을 List로 바꿔서 반환 (fixed-size를 반환)
		List<String> seasonList = Arrays.asList(seasonArr);
		System.out.println(seasonList);
		
		// * Arrays.asList 메소드 이용해서 리스트 생성 시 유의사항
		//	해당 메소드 호출 시 fixed-size list 반환함 (길이 변경이 불가한 리스트)
		//  새로운 요소 추가 및 요소 삭제 불가능 / 기존의 요소를 새로운 요소로 변경은 가능
		// seasonList.add("계절"); - UnsupportedOperationException, 추가 불가
		// seasonList.remove(1); - UnsupportedOperationException, 삭제 불가
		seasonList.set(0, "Spring"); // 수정가능
		System.out.println(seasonList);
		
		// * Arrays.asList(요소, 요소, ..) : 전달된 요소들을 List에 담아두고 싶다.
		List<String> carList = Arrays.asList("벤틀리","애스터마틴","맥라렌");
		System.out.println(carList);
		
		// carList.add("기아"); // UnsupportedOperationException
		
		
	}
	
	public void arrayListTest5() {
		// * List.of(요소, 요소, ...) : 전달된 요소들을 List에 담아 반환 (unmodifiable list)
		List<String> hobbyList = List.of("운동", "게임", "영화", "산책");
		System.out.println(hobbyList);
		
		// * List.of 이용해서 리스트 생성 시 유의사항
		//   해당 메소드 호출 시 unmodifiable list 반환함 (수정 자체가 불가능한 리스트)
		//   새로운 요소 추가, 삭제, 변경, 모두 안됨 (오로지 조회만 가능)
		// hobbyList.add("요리"); // UnsupportedOperationException
		// hobbyList.remove(1); // UnsupportedOperationException
		// hobbyList.set(1, "요리"); // UnsupportedOperationException
		
		
		
	}
	
	public void arrayListTest6() {
		
		// Music 객체들만 저장되는 list 생성
		
		List<Music> list = new ArrayList<>();		
		System.out.println("초기 list : " + list);
		
//		 ** add(E e) : 리스트 공간 끝에 전달된 요소들 추가시켜줌
		list.add(new Music("Good Bye", "박효신"));
		list.add(new Music("rain", "태연"));
		list.add(new Music("꽃길", "빅뱅"));
		
		System.out.println("추가 후 list : " + list);
	
		// * add(int index, E e) : 리스트 내에 특정 인덱스 위치에 전달된 요소를 추가시켜줌
	
		list.add(1, new Music("조항조","만약에"));
		
		System.out.println("추가 후 list : " + list);
		
		// ** remove(int index) : 리스트 내에 특정 인덱스 위치의 요소를 제거시켜줌
		list.remove(1);
		
		System.out.println("제거 후 list : " + list);
		
		// ** set(int index, E e) : 리스트 내에 특정 인덱스 위치의 요소를 새로이 전달

		list.set(0, new Music("술이 달다", "에픽하이"));
		System.out.println("변경 후 list : " + list);
		
//		 ** size() : 리스트내의 요소 갯수 반환 (즉, 리스트의 사이즈)
		System.out.println("list의 사이즈 : " + list.size());
		System.out.println("index의 마지막 : " + (list.size()-1));
		
//		 ** get(int index) : 리스트 내의 특정 인덱스 위치의 요소를 E 타입으로 반환
		System.out.println("0번인덱스 Music객체 : " + list.get(0));
		
		Music m = list.get(1);
		System.out.println("1번인덱스 Music객체 : " + m);
		System.out.println("제목만 : " + m.getTitle());
		System.out.println("제목만 : " + m.getArtist());
		
		System.out.println("2번인덱스 Music객체의 제목만 : " + list.get(2).getTitle());
		System.out.println("2번인덱스 Music객체의 제목만 : " + list.get(2).getArtist());
		
		// 특정 인덱스의 Music객체 내의 정보 변경
		// ex) 1번 인덱스 Music 객체의 제목을 "저 밤"으로 수정 1번인덱스를!
		
		list.get(1).setTitle("저 밤");
		System.out.println("수정 후 1번인덱스 Music객체 : " + list.get(1));
		
		// list 내의 전체 요소(Music객체들) 출력
		System.out.println("==== for loop문 ====");
		for(int i=0 ; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("==== for each문 ===="); // 조회할 때 만!
		for(Music lst : list) {
			System.out.println(lst);
		}
		System.out.println("========");
		
		// * subList(int fromIndex, int toIndex) : 리스트의 fromIndex부터 toIndex 이전까지 새로운 List 담아서 반환
		// 									ㄴ 범위에 해당 안됨
		List<Music> sub = list.subList(0, 2);
		System.out.println("추출한 list : " + sub);
		
		// * addAll(Collection c) : 기존 리스트에 전달된 컬렉션의 전체 데이터들을 통째로 추가시켜줌
		list.addAll(sub);
		System.out.println("추가 후 list : " + list);
		
		// * clear() : 리스트 내의 요소들을 다 제거시켜줌 (초기화)
		list.clear();		
		System.out.println("초기화 후 list : " + list);
		
//		 ** isEmpty() : 리스트가 비어있을 경우 true 반환
		System.out.println("비어있나요? : " + list.isEmpty());
		
		
	}
	
		public void arrayListTest7() {
			
			// 타입 미지정 시 E == object 결정
			List list = Arrays.asList(new Music("술이 달다", "에픽하이")
									, new Music("이 밤", "양다일")
									, "끝");
			
			System.out.println(list);
			
			String str = (String)list.get(2);
			Music m1 = (Music)list.get(0); // 객체를 꺼내 특정 변수에 담을 때 매번 형변환 해야됨
			System.out.println(m1);
			
			// 1번 인덱스 Music객체 정보 변경
			((Music)list.get(1)).setTitle("저 밤");
			((Music)list.get(1)).setArtist("다일"); // 객체에 접근해서 setter 수행 시 매번 형변환 해야됨
			
			/*
			 *  < 컬렉션 사용 시 타입을 지정해두는걸 권장 > 
			 *  1. 명시된 타입의 객체만 저장 가능하도록 제한을 둘 수 있어 데이터의 안정성 확보
			 *  2. 컬렉션에 저장된 객체에 접근 시 매번 형변환하는 절차를 없앨 수 있음
			 */
			
			
		}
	


}//e



