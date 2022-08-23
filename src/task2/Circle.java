package task2;

public class Circle {
	double radius;
	double x;
	double y;
	
	public Circle() {
		
	}
	
	public double getRadious() {
		return radius;
	}
	
	public double getX () {
		return x;
	}
	
	public double getY () {
		return y;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	public void setRadius(double radius) {
		if(radius<0) {
			
			this.radius = 0;
		}else {
			this.radius = radius;
		}
		
	}
	public void setX(double x) {
		this.x = x;
	}
	public void SetY(double y ) {
		this.y = y;
	}

}
