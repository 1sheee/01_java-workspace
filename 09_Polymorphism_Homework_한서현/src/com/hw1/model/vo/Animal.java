package com.hw1.model.vo;

// 1. 추상클래스인 Animal을 만든다.
public abstract class Animal {
	
	private String name;
	private String kinds;
	
	public Animal() {}

	public Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	@Override
	public String toString() {
		return "저의 이름은" + name + "이고, 종류는 " + kinds + "입니다.";
	}
	
	public abstract void speak(); //추상메소드로 구현

	
	
	

}
