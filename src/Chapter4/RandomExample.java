package Chapter4;

import java.util.Random;

public class RandomExample {  
	
	public static void main(String[] args) {
		/*
		 * 랜덤 (Random) => 난수
		 * 컴퓨터 랜덤 : 가짜 (pseudo random)
		 * 난수표
		 * Math.random(); => 0.0부터 1.0 미만의 double타입의 실수를 반환
		 * Random 클래스 (객체)를 사용
		 */
		// 책 공식 말고 아래 공식으로 풀기
		Random random = new Random();
		int a = random.nextInt(10);
		int b = random.nextInt(10);
		
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
