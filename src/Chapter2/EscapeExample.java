package Chapter2;

import java.util.Scanner;

public class EscapeExample {

	public static void main(String[] args) {

		// Scanner 사용시 new Scanner(system.in)먼저쓰 고 ctrl + 1 자동완성 된다.

		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();

		double inputDouble = scanner.nextDouble();

		System.out.println("첫번째 숫자:" + inputNum);
		System.out.println("두번째 숫자:" + inputDouble);

		System.out.println("이름을 입력하세요");

		String inputName = scanner.next();

		System.out.println("당신의 이름은 " + inputName + " 입니다");


	}

}
