package Chapter6;


public class Carexample {
	
	public static void main(String[] args) {
	
		Car myCar = new Car();
		
		myCar.setSpeed(50);
		System.out.println("현재속도: " + myCar.getSpeed());
		
		myCar.setSpeed(60);
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println("현재속도: " + myCar.getSpeed());
	}
}
