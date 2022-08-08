package Exercise21;

import java.util.Scanner;

public class Exercise21 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로의 길이는?(단위:m):");
		double width = sc.nextDouble();
		System.out.print("세로의 길이는?(단위:m):");
	
		double height = sc.nextDouble();

		System.out.println("직사각형의 넓이:"+  width * height );
		System.out.println("직사각형의 둘레:" + (width + height )* 2);
		
	
		}
	

}
