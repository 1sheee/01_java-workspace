package com.br.chap03_interface.model.vo;

public class Mother extends Person implements Behavior {

	private String babyBirth;
	
	public Mother() {}

	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}

	public String getBabyBirth() {
		return babyBirth;
	}

	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}

	@Override
	public String toString() {
		return "Mother [" + super.toString() + ", babyBirth=" + babyBirth;
	}

	@Override
	public void eat() {
		// 밥 먹으면 몸무게 10증가
		setWeight(getWeight() + 10);
		// 건강도 10 감소
		super.setHealth(getHealth() -10);
	}

	@Override
	public void sleep() {
		// 잠자면 건강도 20 증가
		super.setHealth(getHealth()+ 20 );
		
	}


	
	
	
	
	
}
