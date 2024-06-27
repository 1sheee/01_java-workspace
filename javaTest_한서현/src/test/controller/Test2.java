package test.controller;

public class Test2 {

	public static void main(String[] args) {
		
		
//		for(int i = 1; i <= 9; i++) {
//		System.out.printf("%d x %d = %2d\n", 3, i, 3*i);
//						
//		}
//		for(int i = 1; i <= 9; i++) {
//		System.out.printf("%d x %d = %2d\n", 5, i, 5*i);
//		}
		
		for(int dan = 2; dan <= 5 ;dan ++) {
			for(int su = 1; su <= 9; su++){
				int result = dan * su;
				if(dan % 2 == 0) {
					continue;
				}
				System.out.println(dan + "*" + su + "=" + result);
			}
		}
		
		
		
		
		
	}

}
