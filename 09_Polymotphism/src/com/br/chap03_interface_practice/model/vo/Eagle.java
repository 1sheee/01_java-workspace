package com.br.chap03_interface_practice.model.vo;

public class Eagle extends Animal implements Flyable, Moveable{

	public Eagle() {}
	
	public Eagle(String name, String kind) {
		super(name, kind);
	}
		
	@Override
	public void forward() {
		System.out.println(super.getName() + "이(가) 푸드덕거리며 나아갑니다.");
	}

	@Override
	public void back() {
		System.out.println(super.getName() + "이(가) 쫄아서 뒤로갑니다.");
	}

	@Override
	public void jump() {
		System.out.println(super.getName() + "이(가) 짬프를 합니다.");
	}

	@Override
	public void fly() {
		System.out.println(super.getName() + "이(가) 날아갑니다.");
	}

	@Override
	public String bark() {
		return "꼬끼오";
	}
	

}
