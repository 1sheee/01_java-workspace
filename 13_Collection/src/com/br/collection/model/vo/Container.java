package com.br.collection.model.vo;

/*
 * < 제네릭 Generics >
 * 클래스 내부에 사용 할 타입을 클래스 외부에 지정하는 기법
 * 
 */

public class Container<T> {
	
	private T item; // T 타입의 Item을 가질 수 있는 필드
//			ㄴ E 라고 해도 됨, 주로 T라고 쓴다.
	
	public T getItem() {
		return item;
	}
	
	public void setItem(T item) {
		this.item = item;
	}
	
	public String toString() {
		return String.valueOf(item);
	}
	
	
}
