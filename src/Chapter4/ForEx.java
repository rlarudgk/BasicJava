package Chapter4;

public class ForEx {

	public static void main(String[] args) {
// for 문 안에서 정의한 것은 for문 안에서만 쓸 수 있다.
		int sum = 0;
		int i = 0;

		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~" + (i - 1) + "합: " + sum);
	}

}