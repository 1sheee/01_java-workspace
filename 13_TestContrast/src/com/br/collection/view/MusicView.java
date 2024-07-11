package com.br.collection.view;

import java.util.List;
import java.util.Scanner;

import com.br.collection.controller.MusicController;
import com.br.collection.model.vo.Music;

public class MusicView {

	private MusicController mc = new MusicController();
	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
while(true) {
			
			System.out.println("\n=== 음악관리 프로그램 ===");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정 곡 삭제");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 수정");
			System.out.println("6. 가수명을 통해서 곡명 찾기");
			System.out.println("7. 곡명을 통해서 카운트하기");
			System.out.println("0. 프로그램 종료");
			
			System.out.print(">> 메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1 : insert(); break;
			case 2 : select(); break;
			case 3 : delete(); break;
			case 4 : search(); break;
			case 5 : update(); break;
			case 6 : gasu(); break;
			case 7 : countmusic(); break;
			case 8 : System.out.println("종료합니다.");return;
			default : System.out.println("다시 입력해주세요");
			}
		
			
		
	}

}
	
	public void insert() {
	
		System.out.println("\n==1번문제===");
		System.out.println("곡명 : ");
		String title = sc.nextLine();
		System.out.println("가수명 : ");
		String artist = sc.nextLine();
		
		
		mc.input(title, artist);
		System.out.println("성공적으로 생성");
		
	}
	
	public void select() {
		
		System.out.println("\n==2번문제===");
		List<Music> list = mc.selectmusic();
		for(int i=0; i <list.size();i++) {
			if(list.isEmpty()) {
				System.out.println("비었습니다.");
			}else {
				System.out.println(list.get(i));
			}
		}
		
		
	}
	
	public void delete(){
		System.out.println("===3번문제===");
		System.out.print("삭제할 곡명 : ");
		String title = sc.nextLine();
		
		int result = mc.deleteMusic(title);
		
		if(result > 0 ) {
			System.out.println("제거에 성공했습니다.");
		}else {
			System.out.println("제거할 것이 없습니다.");
		}
	}
	
	public void search() {
		System.out.println("===4번문제===");
		System.out.print("특정곡 검색 : ");
		String title = sc.nextLine();
		
		List<Music> find = mc.searchMusic(title);
		
		if(find.isEmpty()){
			System.out.println("비었습니다.");
		}else {
			for(int i =0; i < find.size() ; i++) {
				System.out.println(find.get(i)); // 살짝 헷갈림, 값을 얻는거니까
			}
		}
		
		
	}
	
	public void update() {
		System.out.println("===5번문제===");
		System.out.print("곡명 검색 : ");
		String title = sc.nextLine();
		
		System.out.print("수정곡명 : ");
		String uptitle = sc.nextLine();
		
		System.out.print("수정가수 : ");
		String upartist = sc.nextLine();
		
		int result = mc.updatemusic(title, uptitle, upartist);
		
		if(result > 0 ) {
			System.out.println("성공적으로 수정됐습니다.");
		}else {
			System.out.println("수정할 것이 없습니다.");
		}
		
	}
	
	
	public void gasu() {
		System.out.println("===6번문제===");
		System.out.println("가수명을 입력 해주세요 : ");
		String artist = sc.nextLine();
		
		 List<String> search2 = mc.gasusearch(artist);
		
		if(search2.isEmpty()) {
			System.out.println("없습니다.");
		}else {
			for(int i = 0; i < search2.size(); i++) {
				System.out.println(search2.get(i));
			}
		}
	}
	
	public void countmusic() {
		
		System.out.println("곡명 : ");
		String title = sc.nextLine();
		
		int count = mc.countgok(title);
		if(count > 0) {
			System.out.println(count);
		}else {
			System.out.println("곡이 없습니다");
		}
		
	}

	
	
}