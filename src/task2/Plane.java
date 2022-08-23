package task2;

public class Plane {

	private String manufacturer;
	private String model;
	private int maxNumberOfpassengers;
	private static int numberOfPlanes;

	public Plane() {
		numberOfPlanes++;
	}

	public Plane(String manufacturer, String model, int maxNumberOfpassengers) {
		this.manufacturer= manufacturer;
		this.model = model;
		this.maxNumberOfpassengers = maxNumberOfpassengers;	
		numberOfPlanes++;
	}
	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer= manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxNumberOfPassengers() {
		return maxNumberOfpassengers;
	}
	public void setMaxNumberOfPassengers(int maxNumberOfpassengers) {
		if(maxNumberOfpassengers <0) {
			this.maxNumberOfpassengers=0;
		}else { 
		this.maxNumberOfpassengers = maxNumberOfpassengers;
		}
	}
	public static int getNumberOfplanes() {
		return numberOfPlanes;
	}
}
