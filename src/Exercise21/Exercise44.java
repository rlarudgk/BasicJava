package Exercise21;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보 게임");
		System.out.print("철수: ");
		String rsp = sc.nextLine();
		System.out.print("영희: ");
		String rspp = sc.nextLine();

	
		if(rsp.equals("가위") && rspp.equals("보")) {
			System.out.println("철수 승리!");
		}else if(rsp.equals("바위") && rspp.equals("가위")) {
			System.out.println("철수 승리!");
		}else if(rsp.equals("보") && rspp.equals("주먹")) {
			System.out.println("철수 승리!");
		}else if(rsp.equals("가위") && rspp.equals("바위")) {
			System.out.println("영희 승리!");
		}else if(rsp.equals("바위") && rspp.equals("보")) {
			System.out.println("영희 승리!");
		}else if(rsp.equals("보") && rspp.equals("바위")) {
			System.out.println("영희 승리!");
		}else if(rsp.equals("가위") && rspp.equals("가위")) {
			System.out.println("비겼습니다.");
		}else if(rsp.equals("보") && rspp.equals("보")) {
			System.out.println("비겼습니다.");
		}else if(rsp.equals("바위") && rspp.equals("바위")) {
			System.out.println("비겼습니다.");
		}
		
		
	}

}
