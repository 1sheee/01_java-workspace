package com.br.chap02_abstract_practice.model.vo;

public class Wizard extends GameCharacter{// 마법사 캐릭터

	private int mp;
	
	public Wizard() {}

	public Wizard(String name, int hp, int level, int exp, int mp) {
		super(name, hp, level, exp);
		this.mp = mp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
		
		if(this.mp <= 0) {
			System.out.println("마력소진, 방어하시면 다시 충전");
			this.mp = 0;
		}
	}

	@Override
	public String toString() {
		return super.toString() + ", mp=" + mp;
	}

	@Override
	public void attack() {
		System.out.println("마법을 쓰면서 공격한다.");
		
		mp -= 10; // 공격을 했으니 마력이 닳게끔
		setExp(getExp()+20); // 경험치 20증가
		//super.setExp(super.getExp()+20);
		
	}

	@Override
	public void defence() {
		System.out.println("방어막을 쳐서 방어한다.");
		
		setMp(getMp()+5);
		
		setHp(getHp() -5 );
	}
	
	
	
}
