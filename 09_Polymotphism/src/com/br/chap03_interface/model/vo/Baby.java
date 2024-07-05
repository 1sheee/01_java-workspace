package com.br.chap03_interface.model.vo;

public class Baby extends Person implements Behavior{

	public Baby() {}
	
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}

	@Override
	public String toString() {
		return "Baby [" + super.toString() + "]";
	}

	@Override
	public void eat() {
		// 밥 먹으면 몸무게 3증가 / 건강도 1증
		super.setWeight(getWeight() + 3);
		super.setHealth(getHealth() + 1);
	}

	@Override
	public void sleep() {
		// 잠자면 건강도 3증가
		super.setHealth(getHealth() + 3);
	}


	
	
		
}
