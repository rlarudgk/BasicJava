package Chapter5;

public class ArraySample7 {

	public static void main(String[] args) {

		int[][] array = { 
				{ 95, 86 }, 
				{ 83, 92, 96 }, 
				{ 78, 83, 93, 87, 88 }
		};

		int sum = 0;
		double avg = 0.0;
		System.out.println(array.length);
		int count = 0;  // 갯수
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum = sum + array[i][j];
				count++;
			}

		}
		avg = (double) sum / count;
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}

}
