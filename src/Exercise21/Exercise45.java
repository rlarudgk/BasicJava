package Exercise21;

import java.util.Random;
import java.util.Scanner;

public class Exercise45 { 
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int rd = new Random().nextInt(100)+1;
		
			
		while (true) {
			System.out.println("1부터 100 사이의 정수 중 하나를 선택하세요: ");
			int pp= sc.nextInt();
			if(rd>pp) {
				System.out.println("정답은 더 큰 수 입니다.");
			}else if(rd<pp) {
				System.out.println("정답은 더 작은 수 입니다.");
			}
			if(rd==pp) {
				System.out.println("정답입니다.");
				System.out.println("게임을 종료합니다.");
				break;
			}
		
		}
		
	}


}