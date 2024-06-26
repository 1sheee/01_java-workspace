package test.controller;

public class Test3 {
	
	public static void main (String[] args) {
	
		int sum = 0;
		double avg = (sum / 100);
		int i = 1;
		
		while(i <= 100) {
			i++;
			sum += i;
			
		}
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f" , (double)(sum/100));
		
	}
	
	
}
