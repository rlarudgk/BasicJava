package Exercise21;

public class Exercise22 {

	public static void main(String[] args) {

		
//		거리를 속력으로 나누면 시간이 나온다. // 40E12 이렇게 표기 ^ 연산시
		double speed = 300000;
		double distance = 40E12; // 40*10^12
		double time;

		time = (distance / speed) / 365 / 24 / 60 / 60;

		System.out.println("빛의 속도로 프록시마 센타우리 별까지 가는데 걸리는 시간은 " + time + "광년이다.");

	}

}
