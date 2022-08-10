package Exercise21;

import java.util.Scanner;

public class Excercise41 {

	public static void main(String[] args) {
		
		// 세 변의 길이 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삼각형의 첫번째 변의 길이를 입력하세요: ");
		int a = sc.nextInt();
		
		System.out.println("삼각형의 두번째 변의 길이를 입력하세요: ");
		int b = sc.nextInt();
		
		System.out.println("삼각형의 세번째 변의 길이를 입력하세요: ");
		int c = sc.nextInt();
		
	
		if(a<b+c && b<a+c && c<a+b) {
			System.out.println("삼각형입니다.");
		}else {
			System.out.println("삼각형을 만들 수 없습니다.");
		}
	}
}
		


