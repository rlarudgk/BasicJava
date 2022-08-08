package Task;

import java.util.Scanner;

public class task2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번째 수: ");
		String strNum1= scanner.nextLine();
				
		System.out.println("두 번째 수: ");
		String strNum2= scanner.nextLine();
				
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		
		System.out.println("덧셈 결과: " + result);
				
	}
//  int num1 = scanner.nextInt 하는 방법도 있음. ( 애초에 정수로 받는 것 ) 변환생략
	
	
}
