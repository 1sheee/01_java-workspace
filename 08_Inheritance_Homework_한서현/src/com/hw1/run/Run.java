package com.hw1.run;

import com.hw1.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
		Student[] st = new Student[3];
		
		st[0] = new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과");
		st[1] = new Student("김말똥",21,187.3,80.0,2,"경영학과");
		st[2] = new Student("강개순",23,167.0,45.0,4,"정보통신공학과");
		
		for(int i=0; i<st.length ; i++) {
			System.out.println();
		}
		
	}

}
