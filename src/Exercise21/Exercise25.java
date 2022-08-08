package Exercise21;

import java.util.Scanner;

public class Exercise25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("500원짜리 동전의 갯수:");
		int five = scan.nextInt();

		System.out.print("100원짜리 동전의 갯수:");
		int one = scan.nextInt();

		System.out.print("50원짜리 동전의 갯수:");
		int fiv = scan.nextInt();

		System.out.print("10원짜리 동전의 갯수:");
		int ten = scan.nextInt();

		System.out.println("저금통안의 동전의 총 액수:" + (500 * five + 100 * one + 50 * fiv + 10 * ten));
// %,d 천단위 , 붙여줌
	}

}
