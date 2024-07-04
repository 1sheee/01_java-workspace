package com.hw1.run;

import com.hw1.model.vo.Animal;
import com.hw1.model.vo.Dog;
import com.hw1.model.vo.Cat;

public class AnimalManager {
	
	public static void main (String[] args) {
		
		// Animal 타입의 객체배열 크기 5로 생성
		Animal[] ani = new Animal[5];
		ani[0] = new Dog("에이스","슈나우저",18);
		ani[1] = new Cat("고사리","러시안블루","집","코발트블루");
		ani[2] = new Cat("다이진","잡것","집","흰색");
		ani[3] = new Dog("왕바우","잡것",30);
		ani[4] = new Dog("도리","난나요",85);
		
		
		// 각 인덱스별로 무작위 Dog, Cat 클래스를 이용하여 객체 생성
		
		for(int i=0; i<ani.length;i++) {
		if(ani[i] instanceof Dog) {	// 각 인덱스자리에 어떤 자식객체가 담겼을지 모를 경우 
			((Dog)ani[i]).speak(); // 표현 방법
		}else {
			((Cat)ani[i]).speak();
		}
		
		
	}

}
}
