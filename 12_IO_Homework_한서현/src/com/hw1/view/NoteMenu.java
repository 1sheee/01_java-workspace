package com.hw1.view;

import java.util.Scanner;

import com.hw1.model.dao.FileDao;

public class NoteMenu {
	
	Scanner sc = new Scanner(System.in);
	FileDao fdao = new FileDao();
	
	public void mainMenu() {
	
		while(true) {
			System.out.println("===== MyNote =====");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("4. 끝내기");
			System.out.println();
			System.out.print("번호를 입력하세요 : ");
			int num = sc.nextInt();
			
			switch(num) {//switch s
			case 1: 
				createNote();
				break;
			case 2:
				//openNote();
				break;
			case 3:
				//editNote();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
			default:
				System.out.println("잘 못 입력하셨습니다.\n");										
				
			}//switch e
			
			}
			
			
		}
		
		public void createNote() {
			StringBuilder sb = new StringBuilder();
			
			System.out.println("파일에 저장할 내용을 입력하시오 (exit을 입력하면 내용입력 끝)");
			
			String content = null;
			
			while(true) {
				content = sc.nextLine();
				if(content.equalsIgnoreCase("exit")) {
					break;	
				}
				sb.append(content);
				sb.append("\n");
				
			}
			System.out.print("저장하시겠습니까? (y/n) : ");
			String yn = sc.nextLine();
			
			if(yn.equalsIgnoreCase("y")) {
				System.out.print("저장할 파일명을 입력하시오");
				String fileName = sc.nextLine();
				
				fdao.fileSave(sb.toString(), fileName);
				System.out.println(fileName + ".txt 파일에 성공적으로 저장하였습니다.");

			} System.out.println("다시 메뉴로 돌아갑니다.");
			
			
		}

		
		
	}
	


