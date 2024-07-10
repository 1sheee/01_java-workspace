package com.br.io.run;

import com.br.model.dao.AssistBufferedDao;
import com.br.model.dao.AssistObjectDao;
import com.br.model.dao.FileByteDao;
import com.br.model.dao.FileCharDao;

public class IOMain {

	public static void main(String[] args) {
		
		FileByteDao fbd = new FileByteDao();
		
		//fbd.fileSave();
		//fbd.fileRead();
		
		FileCharDao fcd = new FileCharDao();
		//fcd.fileSave();
		//fcd.fileread();
		
		AssistBufferedDao ab = new AssistBufferedDao();
		
		//ab.fileSave();
		//ab.fileRead();
		
		AssistObjectDao aod = new AssistObjectDao();
		//aod.fileSave();
		aod.fileRead();
		
		
		
		
		
		
	}

}
