package task1;

public class Phone extends Device{
	private Battery battery;
	private OperatingSystem os;
	
	public Phone(String brand, String model, Battery battery, User user, OperatingSystem os) {
		super(brand, model, user);
		this.battery = battery;
		this.os = os;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public OperatingSystem getOs() {
		return os;
	}

	public void setOs(OperatingSystem os) {
		this.os = os;
	}

}
