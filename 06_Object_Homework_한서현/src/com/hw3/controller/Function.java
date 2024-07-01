package com.hw3.controller;

import java.util.Random;

public class Function {

    public void printLottoNumbers() { //방법1
        Random rand = new Random();
        for (int i = 0; i < 6; i++) {
            int number = rand.nextInt(45) + 1;
            System.out.print(number + " ");
        }
//        System.out.println();
    }
    
//    public void printLottoNumbers2() {
//    	
//    	for(int i = 0; i <= 5;i++) {
//    		int  a = (int)(Math.random()*45+1);


//    		}
//    		System.out.print(a + " ");
//    	}
//    	
//    }
    
    	

    public void outputChar(int num, char c) {
        for (int i = 0; i < num; i++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public char alphabette() {
        Random rand = new Random();
        int randomNum = rand.nextInt(52); // 0 to 51
        char randomChar;
        if (randomNum < 26) {
            randomChar = (char) ('a' + randomNum); // lowercase a-z
        } else {
            randomChar = (char) ('A' + (randomNum - 26)); // uppercase A-Z
        }
        return randomChar;
    }

    public String mySubstring(String str, int index1, int index2) {
        if (str == null || str.equals("")) {
            return null;
        }
        return str.substring(index1, index2);
    }
}
