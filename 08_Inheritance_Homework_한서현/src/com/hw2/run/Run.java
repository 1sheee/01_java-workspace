package com.hw2.run;

import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		
		//크기가 2인 Circle, Rectangle 각각의 객체 
		//배열 할당 후 사용데이터를 참고하여 각 
		//객체 초기화 
		Circle[] cc = new Circle[2];
	    cc[0] = new Circle(1, 2, 3);
        cc[1] = new Circle(3, 3, 4);
        
        Rectangle[] rt = new Rectangle[2];
        rt[0] = new Rectangle(-1, -2, 5, 2);
        rt[1] = new Rectangle(-2, 5, 2, 8);
        
        //반복문을 통해 각 도형의 draw메소드 실행
        
        System.out.println("===========circle===========");
        for(Circle cc1 : cc) {
        	cc1.draw();
        }
        System.out.println("===========rectangle===========");
        for(Rectangle rt1 : rt) {
        	rt1.draw();
        }
		
		
	}

}
