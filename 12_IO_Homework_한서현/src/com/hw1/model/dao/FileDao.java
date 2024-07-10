package com.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDao {
	
	public void fileSave(String content, String fileName) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName + ".txt"))) {
			
			bw.write(content);

		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}	
	
	public void fileOpne(String fileName) {
				
		StringBuilder sb = new StringBuilder();
		
		try (BufferedReader br = new BufferedReader(new FileReader(fileName +".txt"))){
		
		String content = null;
		
		while((content = br.readLine()) != null){
			sb.append(content);
			sb.append("\n");
			if((content = br.readLine()) == null){
				System.out.println("null");
			}
		}
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String result = sb.toString();
		
		}
		
	}


