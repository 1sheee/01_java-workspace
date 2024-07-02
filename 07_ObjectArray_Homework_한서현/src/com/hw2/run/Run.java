package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		// 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
		Student[] st = new Student[10];

		// int count = 0; // 학생 수를 나타내는 변수 → 한 명 추가 시 1씩 증가시켜줄꺼임

		Scanner sc = new Scanner(System.in);
		int count = 0;
		int sum = 0;
		while (true) {
			for (int i = 0; i < 10; i++) {
								
				System.out.print("학년을 입력해주세요 : ");
				int grade = sc.nextInt();
				System.out.print("반을 입력해주세요 : ");
				int classroom = sc.nextInt();
				sc.nextLine();
				System.out.print("이름을 입력해주세요 : ");
				String name = sc.nextLine();
				System.out.print("국어점수를 입력해주세요 : ");
				int kor = sc.nextInt();
				System.out.print("영어점수를 입력해주세요 : ");
				int eng = sc.nextInt();
				System.out.print("수학점수를 입력해주세요 : ");
				int math = sc.nextInt();
				sc.nextLine();
				System.out.print("계속입력하시겠습니까?(n입력 시 종료) : ");
				String yn = sc.nextLine();
				if (yn.equals("n")) { 
					System.out.println("더이상 입력을 안합니다.");
					break;
				}
				count++;
				st[i] = new Student(grade, classroom, name, kor, eng, math);


				}
					for (int i = 0; i < count; i++) {
					System.out.println(st[i].information());
					System.out.println(st[i].getAverage());


				
			}

				

			}

		}

	}




