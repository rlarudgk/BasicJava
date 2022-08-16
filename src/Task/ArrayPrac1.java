package Task;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrac1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); 
		int [] array = new int[n];  // 스캐너로 n의 원소들을 배열로 받겠다
		
		for(int i =0; i<n; i++) {
			array[i] = sc.nextInt();
			
		}
		sc.close();
		Arrays.sort(array);
		System.out.println(array[0] + " " + array[n-1]);
		
	}

}
