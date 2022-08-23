package task2;

public class Car {
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200;

	public Car() {
	}

	public Car(String color) {
		setColor(color);
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	//속력을 높이거나 내리는 메소드
	//크루즈 기능(0미만 max 초과 시 현재 속도 유지, false반환)
	//0이상 max이하 시 속도 변경 및 true반환
	public boolean speedUp(double speed) {
		if (speed < 0 || speed > MAX_SPEED) {
			//현재 속도 유지
			
			return false;
		} else {
			//주어진 속도로 변경
			//기존 100, 90이 주어짐
			//this.speed = 100 + 90
			//누적변수 = 누적변수 + 대상
			this.speed = this.speed + speed;
			return true;
		}

	}
	public static double getMAXSpeed() {
		return MAX_SPEED;
	}
}
