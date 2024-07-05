package com.br.chap03_interface_practice.model.vo;

public class Dog extends Animal implements Moveable, Swimable{

	public Dog() {}
	
	public Dog(String name, String kind) {
		super(name, kind);
	}
	
	@Override
	public void swim() {
		System.out.println(super.getName() + "이(가) 개헤엄을 칩니다.");
	}

	@Override
	public void dive() {
		System.out.println(super.getName() + "이(가) 물속으로 다이빙합니다.");
	}

	@Override
	public void forward() {
		System.out.println(super.getName() + "이(가) 네발로 앞으로 걸어갑니다.");
	}

	@Override
	public void back() {
		System.out.println(super.getName() + "이(가) 백스탭을 합니다.");
	}

	@Override
	public void jump() {
		System.err.println(super.getName() + "이(가) 점프를 합니다.");
	}

	@Override
	public String bark() {
		return "캉캉";
	}
	
	
	
}
