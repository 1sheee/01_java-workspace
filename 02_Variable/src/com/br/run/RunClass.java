package com.br.run;

import com.br.variable.Variable;
import com.br.variable.Keyboardinput;
import com.br.variable.Printf;
import com.br.variable.Casting;
//import com.br.variable.*; - 베리어블의 모든걸 쓰겠다

public class RunClass {
	
	public static void main(String[] args) {
		
		Variable var = new Variable ();
		//var.whyUseVariable();
		//~~
		//var.constant();
		
		Keyboardinput key = new Keyboardinput();
		//key.inputTest1();
		//key.preactice();
		//key.inputTest3();
		
		//key.chatAtTest();
		
		//key.practice2();
		
		//Printf pf = new Printf();
		//pf.printfTest();
		//key.inputTest2();
		
		Casting cast = new Casting();
		//cast.autoCasting();
		cast.forceCasting();
		
	}

}
