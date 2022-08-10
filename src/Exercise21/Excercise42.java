package Exercise21;

import java.util.Scanner;

public class Excercise42 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요(1~12): ");
		
		int ss = sc.nextInt();
		
		if(ss==3 || ss <=5) {
			System.out.println(ss + "월은 봄입니다.");
		}else if (ss==6 || ss<=8) {
			System.out.println(ss + "월은 여름입니다.");
		}else if(ss ==9 || ss <=11) {
			System.out.println(ss + "월은 가을입니다.");
		}else if(ss == 12 || ss<=2) {
			System.out.println(ss + "월은 겨울입니다.");
		}else {
			System.out.println(ss + "월은 잘못된 입력입니다.");
		}
	}

}
