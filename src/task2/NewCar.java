package task2;

public class NewCar {
	
	private double speed;
	private String color;
	private static final double MAX_SPEED = 200;

	public NewCar() {
	}

	public NewCar(String color) {
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

	public boolean speedUp(double speed) {
		if (speed < 0 || speed > MAX_SPEED) {

			return false;
		} else {

			this.speed = this.speed + speed;
			return true;
		}

	}
	public static double getMAXSpeed() {
		return MAX_SPEED;
	}

}
