package Bjoon;

import java.util.Scanner;

public class Practice1 {
	
	public static void main(String[] args) {
		
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			int A = sc.nextInt();
			int B = sc.nextInt();
			int sum = A + B;
			System.out.println(sum);
			if(A ==0 && B == 0) {
				break;
			}
		}
		
	}

}
