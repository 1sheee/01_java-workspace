package com.br.chap02_abstract_practice.model.vo;

public class Archor extends GameCharacter{ // 궁수 캐릭터
	
	private int distance;	// 쏠 수 있는 거리
	private int count; 		// 잔여 화살명
	
	public Archor() {}

	public Archor(String name, int hp, int level, int exp, int distance, int count) {
		super(name, hp, level, exp);
		this.distance = distance;
		this.count = count;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return super.toString() + ", distance=" + distance + ", count=" + count;
	}

	@Override
	public void attack() {
		
		if(count > 0 ) { // 잔여 활 O
		System.out.println(distance + "m 거리까지의 적을 화살로 싸서 공격한다.");
		count--;
		System.out.println("잔여 활 수 : " + count);
		
		setExp(getExp()+15); // 경험치 15증가
		}else {
			System.out.println("화살을 채워 주세요.");
		}
		
	}

	@Override
	public void defence() {
		System.out.println("막을수 없습니다...꾸엑");
		setHp(getHp()-20); // 체력 20 감소
		
	}
	
	

}
