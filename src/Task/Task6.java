package Task;

import java.util.Scanner;

public class Task6 { 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수: ");
		double a = sc.nextDouble();
		System.out.print("두 번째 수: ");
		double b = sc.nextDouble();
		
		String c = ((b == 0 || b == 0.0 )? "무한대" : a / b + "");
		
		System.out.println( "결과: " + c );
	}

}
