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
		Random random = new Random(10);
		int a = random.nextInt(6);
		int b = random.nextInt(6);
		int c = random.nextInt(6);
		int d = random.nextInt(6);
		int e = random.nextInt(6);
		int f = random.nextInt(6);
		int g = random.nextInt(6);
		
		System.out.printf("%d,%d,%d,%d,%d,%d,%d",a,b,c,d,e,f,g);
		
		
		
	}

}
