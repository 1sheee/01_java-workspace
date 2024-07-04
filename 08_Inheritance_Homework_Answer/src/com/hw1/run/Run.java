package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {
	
	public static void main(String[] args) {
		
		Student[] stu = new Student[3];
		
		stu[0] = new Student("홍길동", 20, 178.2, 70, 1, "정보시스템공학과");
		stu[1] = new Student("김말똥", 21, 187.3, 80, 2, "경영학과");
		stu[2] = new Student("강개순", 23, 167.0, 45, 4, "정보통신공학과");
		
		for(int i=0; i<stu.length; i++) {
			System.out.println(stu[i]);
		}
		
		/*
		== 향상된 for문으로 출력한다면.. ==
		for(Student s : stu) {
			System.out.println(s);
		}
		*/
		
		Scanner sc = new Scanner(System.in);
		
		Employee emp[] = new Employee[10];
		int count = 0;
		
		while(true) {
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("키 : ");
			double height = sc.nextDouble();
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("부서 : ");
			String dept = sc.nextLine();
			
			emp[count++] = new Employee(name, age, height, weight, salary, dept);
			
			System.out.print("계속 입력하시겠습니까? (y/n) : ");
			char ch = sc.nextLine().toUpperCase().charAt(0);
			
			if(ch == 'N') {
				break;
			}
		}
		
		for(int i=0; i<count; i++) {
			System.out.println(emp[i]);
		}
		
		/*
		== 향상된 for문으로 출력한다면.. ==
		for(Employee e : emp) { // 무조건 emp배열의 0번인덱스에서부터 마지막인덱스까지 반복문이 돌기 때문에
			if(e != null) { // 순차적으로 접근되는 객체가 null이 아닐때만
				System.out.println(e); // 출력되도록
			}
		}
		*/
		
	}

}
