package com.br.run;

import com.br.operator.*;

public class OperatorMain {
	
	public static void main(String[] args) {
		
		LogicalNegation ln = new LogicalNegation();
		//ln.method1();
		
		InDecrease id = new InDecrease();
		//id.method1();
		//id.method2();
		//id.method3();
		//id.method4();
		
		Arithmetic at = new Arithmetic();
		//at.method1();
		//at.method2();
		
		Compound cp = new Compound();
		//cp.method1();
		
		Comparison co = new Comparison();
		//co.method1();
		
		//co.method2();
		
		Logical lg = new Logical();
		//lg.method1();
		//lg.method2();
		//lg.method3();	
		//lg.method4();	
		//lg.method5();	
		
		Triple tp = new Triple();
		//tp.method1();
		//tp.method2();
		//tp.method3();
		tp.method4();
	}

}
