package Exercise21;

import java.util.Scanner;

public class Excercise43 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		
		System.out.println("프로그래밍 기초: ");
		int a = sc.nextInt();
		System.out.println("데이터베이스: ");
		int b = sc.nextInt();
		System.out.println("화면 구현: ");
		int c = sc.nextInt();
		System.out.println("애플리케이션 구현: ");
		int d = sc.nextInt();
		System.out.println("머신러닝: ");
		int e = sc.nextInt();
		int result = a+b+c+d+e ;
		System.out.println("총점: " + result);
		double average = result/5.0;
		
		if(average>=90) {
			System.out.print("학점: A");
		}else if(average>=80 && average<90) {
			System.out.println("학점: B");
		}else if(average>=70 && average<80) {
			System.out.println("학점: C");
		}else if(average>=60 && average<70) {
			System.out.println("학점: D");
		}else{
			System.out.println("학점: F");
		}
		
		System.out.println("평균: " + average);
		
	}

}
