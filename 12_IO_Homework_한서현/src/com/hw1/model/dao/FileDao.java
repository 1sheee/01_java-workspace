package com.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDao {
	
	public void fileSave(String content, String fileName) {		
		
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter(fileName +".txt"));
			
			bw.write(content);
			bw.write(content);
			bw.write(content);
			
			

			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	
	
	public void fileOpne(String fileName) {
				
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName +".txt"));
		
		System.out.println(br.readLine());
		
		String value = null;
		StringBuilder sb = new StringBuilder();
		while((value = br.readLine()) != null){
			sb.append(value);
			sb.append("\n");
			if((value = br.readLine()) == null){
				System.out.println("null");
			}
		}
		
		String result = sb.toString();
		System.out.println(result);
		
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
