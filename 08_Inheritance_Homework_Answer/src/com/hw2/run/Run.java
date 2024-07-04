package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Rectangle;

public class Run {
	
	public static void main(String[] args) {
		
		Circle[] cir = new Circle[2];
		
		cir[0] = new Circle(1, 2, 3);
		cir[1] = new Circle(3, 3, 4);
		
		Rectangle[] rec = new Rectangle[2];
		
		rec[0] = new Rectangle(-1, -2, 5, 2);
		rec[1] = new Rectangle(-2, 5, 2, 8);
		
		System.out.println("===== circle =====");
		for(int i=0; i<cir.length; i++) {
			cir[i].draw();
		}
		
		/* == 향상된 for문 ==
		for(Circle c : cir) {
			c.draw(); // 부모의 draw 메소드가 아닌 자식의 draw 메소드가 실행
		}
		*/
		
		System.out.println("===== rectangle =====");
		for(int i=0; i<rec.length; i++) {
			rec[i].draw();
		}
		
		/* == 향상된 for문 ==
		for(Rectangle r : rec) {
			r.draw(); // 부모의 draw 메소드가 아닌 자식의 draw 메소드가 실행
		}
		*/
		
		
	
		
	}

}
