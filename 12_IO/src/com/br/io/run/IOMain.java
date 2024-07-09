package com.br.io.run;

import com.br.model.dao.FileByteDao;

public class IOMain {

	public static void main(String[] args) {
		
		FileByteDao fbd = new FileByteDao();
		
		//fbd.fileSave();
		fbd.fileRead();
	}

}
