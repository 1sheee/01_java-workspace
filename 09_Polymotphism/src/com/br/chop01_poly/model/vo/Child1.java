package com.br.chop01_poly.model.vo;

public class Child1 extends Parent{
	
	private int z;
	
	public Child1() {}

	public Child1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void printChild1() {
		System.out.println("나는 첫째야");
	}
	
	@Override // 빨간줄 안뜨면 잘 되고있음을 의미
	public void print() {
		System.out.println("나는 첫째야");
	}
	
	
	
	
	
	
}
