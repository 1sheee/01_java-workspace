package com.br.chap03_interface_practice.model.vo;

public class Dolphin extends Animal implements Swimable{

	public Dolphin() {}
	public Dolphin(String name, String kind) {
		super(name, kind);
	}
	
	@Override
	public void swim() {
		System.out.println(super.getName() + "이(가) 헤엄칩니다.");
	}

	@Override
	public void dive() {
		System.out.println(super.getName() + "이(가) 포물선을 그리면서 다이빙합니다.");
	}

	@Override
	public String bark() {
		return "끄아아아앙";
	}

	
	
}
