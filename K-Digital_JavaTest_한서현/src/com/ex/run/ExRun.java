package com.ex.run;

import java.util.Scanner;

import com.ex.controller.ExController;
import com.ex.view.ExMenu;

public class ExRun {
	
	private ExController ec = new ExController();
	private Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ExMenu view = new ExMenu();
		view.mainMenu();

	}
	
	
	/*
	 * - 포트폴리오 : 우선 ExMenu, ExController 클래스 안의 문제 확인 후 프로젝트 완성시키기 
	 *   => 해당 프로젝트를 export하여 제출하시오
	 *   
	 *   
	 *   * export방법
	 *   
	 *   프로젝트 우클릭 > Export 
	 *   General > Archive File > Next
	 *   To archive file 오른쪽 Browse 버튼 클릭
	 *   바탕화면 폴더 선택 후 파일이름 텍스트 상자에 어떤이름으로 저장할지 작성 (그냥 프로젝트명 동일하게 써주세요) > 저장버튼 클릭
	 *   Finish 
	 *   
	 *   바탕화면에 저장된 zip 파일을 제출해주시면됩니다! 
	 *   
	 *   
	 *   
	 */

}
