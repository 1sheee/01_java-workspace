package com.br.override.model.vo;

public class Book /* extends Object */{

	private String title;
	private String author;
	private int price;
	
	public Book() {}
	
	public Book(String title, String author, int price) {// 단축키 alt + shft + s => o(알파벳)
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() { // alt + shft + s => r
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	/*
	 * < 오버라이딩 >
	 * 자식클래스에 상속받고 있는 메소듣를 재정의하는 개념
	 * 
	 * < 오버라이딩 성립 조건 >
	 * 
	 * 1. 부모메소드명과 동일
	 * 2. 부모메소드의 매개변수 갯수, 자료형, 순서 동일
	 * 3. 부모메소드의 반환형 동일 (JDK 버전업되면서 부모메소드 반환형의 자식타입까지는 가능)
	 * 4. 부모메소드의 접근제한자보다 범위가 같거나 커야됨
	 * 		ex) 부모메소드 protected => 자식메소드 protected, public
	 * 
	 * 
	 * < @Override 어노테이션 >
	 * 1. JVM에게 해당 메소드는 오버라이딩 된 메소드임을 알리는 역할
	 * 		+ 다른 개발자에게도 알리는 역할
	 * 2. 생략 가능 (단, 작성 권장함)
	 * 		ㄴ 후에 부모메소드가 변경되었을 경우 => 자식클래스에 오류 발생 => 수정해야되는걸 알려줌
	 * 			또는 자식메소드 작성 시 실수로 잘못작성 경우 => 오류 발생 => 수정해야되는걸 알려줌
	 * 		
	 */
	
	@Override
	public String toString() {
		// 재정의 : 해당 객체의 멤버변수의 값들을 반환
		return "title : " + title + ", author : " + author + ", price" + price;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 재정의 : this객체와 obj객체의 모든 필드값들이 다 일치할경우 true / 아니면 false
		
		/*
		 *  bk3.equals(bk4) 실행 될 경우
		 *  
		 *  this       obj
		 *  bk3		   bk4
		 *  Book       Object
		 *  
		 *  this.title vs obj.title
		 *  this.author vs obj.author
		 *  this.price vs obj.price
		 */
		
		Book other = (Book)obj;
		
		if(this.title.equals(title) // 여기서 this는 생략 가능
				&& this.author.equals(author)
					&& this.price == other.price) {
			return true;
		}else {
			return false;
		}
		
		
		}
	@Override
		public int hashCode() {
		return (title + author + price).hashCode();
		// 재정의 : 현재객체의 멤버변수값들을 가지고 10진수 숫자 변환
		// 같은 문자열일 경우 해당 문자열의 hashCode는 같도록 String에서 이미 정의되어 있음
	}
	
	
}
