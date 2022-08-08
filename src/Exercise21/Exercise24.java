package Exercise21;

import java.util.Scanner;

public class Exercise24 { 
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		
		System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위:cm):");
		
		double r = scn.nextDouble();
		
		System.out.print("원기둥의 높이를 입력하시오.(단위:cm):");
		
		double h = scn.nextDouble();
		
		double area = Math.PI * r*r;
		
		System.out.print("원기둥 밑변의 넓이는" + area + "㎠이고,");
		System.out.print("원기둥의 부피는" + area*h + "㎤이다.");
		
	}

}
