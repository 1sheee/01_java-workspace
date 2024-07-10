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
			
			switch(num) {//switch s
			case 1: 
				createNote();
				break;
			case 2:
				openNote();
				break;
			case 3:
				editNote();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
			default
				System.out.println("잘 못 입력하셨습니다.");										
				
			}//switch e
			
			}
			
			
		}
		
		public void createNote() {
			System.out.println("파일에 저장할 내용을 입력하시오 (exit을 입력하면 내용입력 끝");
			StringBuilder sb = new StringBuilder();
			while(true) {
				String content = sc.nextLine();
				if(content.equalsIgnoreCase("exit")) {
					sb.append(content);
					sb.append("\n");
					
				}else if(content.equals("exit")) {
					break;
				}
				
			}
			
			
			
		}

		
		
	}
	


