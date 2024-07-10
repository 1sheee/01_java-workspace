package com.hw1.view;

import java.util.Scanner;

import com.hw1.model.dao.FileDao;

public class NoteMenu {
	
	Scanner sc = new Scanner(System.in);
	FileDao fdao = new FileDao();
	
	public void mainMenu() {
		
		while(true) {
			
			System.out.println("\n====== MyNote ======");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("4. 끝내기");
			System.out.print("\n번호를 입력하세요 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			switch(num) {
			case 1 : createNote(); break;
			case 2 : openNote(); break;
			case 3 : noteEdit(); break;
			case 4 : System.out.println("\n프로그램을 종료합니다."); return;
			default : System.out.println("\n잘못 입력하셨습니다."); continue;
			}
		}
		
	}
	
	public void createNote() {
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println("\n* 파일에 저장할 내용을 입력하시오(\"exit\"을 입력하면 내용 입력 끝) *");
		
		String content = null;
		while(true) {
			content = sc.nextLine();
			if(content.equalsIgnoreCase("exit")) {
				break;
			}else {
				sb.append(content + "\n");
			}			
		}
		
		System.out.print("저장하시겠습니까? (y/n) : ");
		String save = sc.nextLine();
		
		if(save.equalsIgnoreCase("y")) {
			System.out.print("저장할 파일명을 입력하시오 : ");
			String fileName = sc.nextLine();
			
			fdao.fileSave(sb.toString(), fileName);
			System.out.println(fileName + ".txt 파일에 성공적으로 저장하였습니다.");
		}else {
			System.out.println("다시 메뉴로 돌아갑니다.");
		}
		
	}
	
	public void openNote() {
		
		System.out.print("\n열기 할 파일명 : ");
		String fileName = sc.nextLine();
		
		String result = fdao.fileOpen(fileName);
		
		System.out.println(result == null ? "존재하는 파일이 없습니다." : result);
		
	}
	
	public void noteEdit() {
		
		System.out.print("\n수정할 파일명 : ");
		String fileName = sc.nextLine();
		
		String result = fdao.fileOpen(fileName);
		
		if(result == null) {
			System.out.println("존재하는 파일이 없습니다.");
		}else {
			
			StringBuilder sb = new StringBuilder(result);
			
			String content = null;
			
			System.out.println("\n* 파일에 추가할 내용을 입력하시오.(\"exit\"을 입력하면 내용 입력 끝) *");
			while(true) {
				content = sc.nextLine();
				if(content.equalsIgnoreCase("exit"))
					break;
				else {
					sb.append(content + "\n");
				}			
			}
			
			System.out.print("변경된 내용을 파일에 추가하시겠습니까? (y/n) : ");
			String save = sc.nextLine();
			
			if(save.equalsIgnoreCase("y")) {
				fdao.fileSave(sb.toString(), fileName);
				System.out.println(fileName + ".txt 파일의 내용이 변경되었습니다.");		
			}else {
				System.out.println("다시 메뉴로 돌아갑니다.");
			}
		}
		
	}
	
	
	


}

