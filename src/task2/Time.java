package task2;

public class Time {
	
	int hour ;
	int minute;
	int second;
	
	public Time() {
		int hour = 0;
		int minute = 0;
		int second = 0;
	}
	public Time(int hour, int minute, int second) {
		if(hour<0 || hour >=23) {
			 hour = 0;
		}
		if(minute<0 || minute >59) {
			minute = 0;
		}
		if(second<0 || second >59) {
			second = 0;
		}
		this.hour = hour;
		this.minute=minute;
		this.second=second; 
	}
	public String toString() {
		return String.format("%02d:%02d:%02d", hour,minute,second);
	}
}
