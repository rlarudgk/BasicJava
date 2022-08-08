package Chapter4;

import java.util.Random;

public class Switch2 {
	
	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int time = rd.nextInt(4)+ 8;
				
		System.out.println("[현재시각:" + time +"시]");
		
		switch (time) {
		case 8:
			System.out.println("출근합니다.");
			
		case 9:
			
			System.out.println("회의를 합니다.");
			
		case 10:
			
			System.out.println("업무를 봅니다.");
			
		default:
			System.out.println("외근을 합니다.");
		}
	}
	

}
