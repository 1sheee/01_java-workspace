package com.hw1.view;

import java.util.Scanner;

import com.hw1.model.dao.FileDao;

public class NoteMenu {
	
	Scanner sc = new Scanner(System.in);
	FileDao fdao = new FileDao();
	
	public void mainMenu() {
	
		while(true) {
			System.out.println("=====MyNote=====");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("4. 끝내기");
			System.out.print("번호를 입력하세요 : ");
			int num = sc.nextInt();
			
			switch(num) {
			
			
			}
			
			
		}

		
		
	}
	

}
