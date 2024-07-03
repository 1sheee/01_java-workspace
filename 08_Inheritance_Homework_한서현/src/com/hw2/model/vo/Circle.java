package com.hw2.model.vo;

public class Circle extends Point{
	
	private int radius;
	
	public Circle() {}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void draw() {
		super.draw(); // 호출
		double wm = Math.PI * radius * radius; // 면적
		double wd = Math.PI *  (radius * 2); // 둘레
		System.out.printf("면적 : %.1f \n둘레 : %.1f\n",wd,wd);
	}
	

}
