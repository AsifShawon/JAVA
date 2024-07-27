package TempPractice;

public abstract class temperature {
	private double temp;
	
	public temperature() {}
	
	public temperature(double temp) {
		this.temp = temp;
	}
	
	public void setTemp(double temp) {
		this.temp = temp;
	}
	
	public double getTemp() {
		return temp;
	}
	
	abstract double convert();
	abstract void afterConvert();
	
	public String toString() {
		return "Temperature: "+temp;
	}
	
}
