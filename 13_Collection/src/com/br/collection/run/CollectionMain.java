package com.br.collection.run;

import com.br.collection.controller.ListController;
import com.br.collection.controller.MapController;
import com.br.collection.controller.SetController;

public class CollectionMain {
	// 강사님 설명 긁어오기
	
	public static void main(String[] args) {
	
		ListController lc = new ListController();
		//lc.arrayListTest1();
		//lc.arrayListTest2();
		//lc.arrayListTest3();
		//lc.arrayListTest4();
		//lc.arrayListTest5();
		//lc.arrayListTest6();
		//lc.arrayListTest7();
		SetController sc = new SetController();
		//sc.hashSetTest1();
		//sc.hashSetTest2();
		//sc.hashSetTest3();
		//sc.hashSetTest4();
		//sc.hashSetTest5();
	
		MapController mc = new MapController();
		//mc.hashMapTest1();
		//mc.hashMapTest2();
		//mc.hashMapTest3();
		//mc.propertiesTest1();
		//mc.propertiesTest2();
		mc.propertiesTest3();
	
	}
	
	
	

}
