package Exercise1;

import java.util.Scanner;

public class Excercise31 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("첫 번째 숫자를 입력하세요: ");
		int a = sc.nextInt();

		System.out.println("두 번째 숫자를 입력하세요: ");
		int b = sc.nextInt();

		int c = ((a + b) + Math.abs(a - b)) / 2;
		int d = ((a + b) - Math.abs(a - b)) / 2;
		int e = c / d;
		int f = c % d;

		System.out.println("큰 수를 작은 수로 나눈 묷은" + e + "이고," + "나머지는" + f + "이다.");

	}

}
