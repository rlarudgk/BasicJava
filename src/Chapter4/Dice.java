package Chapter4;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {

		while (true) {
		Random rd = new Random();

		int di = rd.nextInt(6) + 1;
		int dii = rd.nextInt(6) + 1;
		System.out.println("("+di + ","+dii+")");
		if(di+dii==5) {
				break;
			}
			
		}
		
	}
}
