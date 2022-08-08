package Task;

import java.util.Scanner;

public class Year {
	
	public static void main(String[] args) {
		//무한루프
		while(1==1) {
			Scanner scanner = new Scanner(System.in);
			
			//연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력
			//윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
			
			//첫째 줄에 연도가 주어진다
			// 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수
			System.out.println("숫자를 입력해주세요:");
			int yyyy = scanner.nextInt();
			
			//프로그램 끝내기
			if(yyyy==9) {
				break;
			}
			
			//기본은 윤년이 아님(0)
			int result = 0;
			
			//윤년찾기 시작/////////////////////////////
			//1) 연도가 4의 배수. 4 8 12 16 20 24...
			// % : 나머지. 
			if(yyyy % 4 == 0) {
				//100의 배수(나누기 100은 0)가 아닐 때 
				//또는 : || 
				//400의 배수(나누기 400은 0)일 때
				if((yyyy % 100 != 0) || (yyyy % 400 == 0)) {
					//기본은 0이었는데 찾기 성공! 1로 바뀜
					result = 1;
				}
			}
			//윤년찾기 끝/////////////////////////////
			
			//윤년찾기 결과
			System.err.println(result);
		}
	}

}
