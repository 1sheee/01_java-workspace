package com.hw1.run;

import com.hw1.model.dao.FileDao;
import com.hw1.view.NoteMenu;

public class Run {

	public static void main(String[] args) {

		FileDao fd = new FileDao();
		//fd.fileSave("hi", "sample");
		NoteMenu nm = new NoteMenu();
		nm.mainMenu();
		
		
		
		
	}
	

	
	
	
	
}
