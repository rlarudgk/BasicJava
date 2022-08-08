package Chapter01;

import java.util.Scanner;

public class Practice {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		System.out.println("정수입력");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a>b) { System.out.println(">");
			
		}else if (a<b) { System.out.println("<");
			
		}else { System.out.println("==");
			
		}
	}
}
