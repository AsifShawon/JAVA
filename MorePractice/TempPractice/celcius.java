package Practice;

public class celcius extends temperature {
	
	public celcius() {	}
	
	public celcius(double temp){
		super(temp);
	}
	
	@Override
	double convert() {
		return ((9*getTemp())/5)+32;
	}
	
	public String toString() {
		return super.toString() + " Celsius";
	}

	@Override
	void afterConvert() {
		System.out.println("Celsius to Fahrenheight: "+convert());
	}
}
