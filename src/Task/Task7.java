package Task;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("아이디:");
		String name = sc.nextLine();
 //		"3".multiply("4");
		System.out.println("패스워드:");
		String strPassWord = sc.nextLine();
		int password = Integer.parseInt(strPassWord);

		if (name.equals("java")) {
			if (password == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인실패: 패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패: 아이디가 존재하지 않음");
		}
	}
}
