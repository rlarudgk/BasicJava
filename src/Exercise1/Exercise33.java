package Exercise1;

import java.util.Scanner;

public class Exercise33 { 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("윤년을 확인할 연도를 입력하세요: ");
		
		int year = sc.nextInt();
		
		String result = (year%4 == 0 && year%100 != 0 || year%400 == 0 ? year + "년은 윤년입니다." : year + "는 윤년이 아닙니다.");
		
		System.out.println(result);
	}

}
