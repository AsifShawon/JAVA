package Practice;

public class fahrenheight extends temperature{
	
	public fahrenheight() {	}
	
	public fahrenheight(double temp){
		super(temp);
	}
	
	@Override
	double convert() {
		return (((getTemp()-32)*5)/9);
	}
	public String toString() {
		return super.toString() + " Fahrenheight";
	}

	@Override
	void afterConvert() {
		System.out.println("Fahrenheight to Celsius: "+convert());
	}
}
