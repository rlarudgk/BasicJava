package task2;

public class CarTest {
	
	public static void main(String[] args) {
		Car mycar = new Car("Red");
		System.out.println("mycar의 색: " + mycar.getColor());
		System.out.println("차의 최대 속력: " + Car.getMAXSpeed() + "km/h");
		
		System.out.println("첫 번째 speedUp(100.0km/h): ");
		if(mycar.speedUp(100.0)) {
			System.out.print("속도 변경 가능,");
		}else {
			System.out.print("속도 변경 불가능,");
		}
		System.out.println(" 현재 차의 속력: " + mycar.getSpeed() + "km/h");
		
		System.out.println("두 번째 speedUp(90.0km/h): ");
		if(mycar.speedUp(90.0)) {
			System.out.print("속도 변경 가능");
		}else {
			System.out.print("속도 변경 불가능,");
		}
		System.out.println(" 현재 차의 속력: " + mycar.getSpeed() + "km/h");
		//////////////////////////////////////////////////1번끝
		//////////////////////////////////////////////////2번시작
		Car yourCar= new Car("blue");
		System.out.println();
		System.out.println("yourCar의 색: " + yourCar.getColor());
		System.out.println("차의 최대 속력: " + Car.getMAXSpeed() + "km/h");
		//여기서부터 문제 발생
		System.out.println("첫 번째 speedUp(-100.0km/h): ");
		if(yourCar.speedUp(-100.0)) {
			System.out.print("속도 변경 가능,");
		}else {
			System.out.print("속도 변경 불가능,");
		}
		System.out.println(" 현재 차의 속력: " + yourCar.getSpeed() + "km/h");
		
		System.out.println("두 번째 speedUp(210.0km/h): ");
		if(yourCar.speedUp(210.0)) {
			System.out.print("속도 변경 가능");
		}else {
			System.out.print("속도 변경 불가능,");
		}
		System.out.println(" 현재 차의 속력: " + yourCar.getSpeed() + "km/h");
	}

}
