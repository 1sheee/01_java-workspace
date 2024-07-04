package com.br.chop01_poly.model.vo;

public class Parent {
	
	private int x;
	private int y;
	
	public Parent() {}

	public Parent(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() { // alt + shft + s => r > alt + r
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	//alt + shft + s => s
	
	public void printParent() {
		System.out.println("난 부모야");
	}
	
	public void print() {
		System.out.println("나 부모야");
	}
	
}
