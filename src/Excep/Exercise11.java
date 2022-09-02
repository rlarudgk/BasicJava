package Excep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise11 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {

				System.out.println("어떤 수로 나누시겠습니까?");
				int a = Integer.parseInt(sc.nextLine());
				System.out.println("어떤 수로 나누시겠습니까?");
				int b = Integer.parseInt(sc.nextLine());
				int result = a / b;
				System.out.println(a + "/" + b + "=" + result);
			} catch (NumberFormatException e) {

				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");

			}catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			}
		}
		
		
		
	}
}
