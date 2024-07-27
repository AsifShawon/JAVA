package task1;

public class Main {
	public static void main(String[] args) {
		User user = new User("Jannat", "jannat@gmail.com");
		Battery battery = new Battery(5000, "rechargable");
		OperatingSystem os1 = new OperatingSystem("Androiid", "14.0");
		OperatingSystem os2 = new OperatingSystem("Windows", "11.0");
		
		Computer comp = new Computer("Acer", "Nitro5", "Laptop", user, os2);
		Phone phn = new Phone("Samsung", "S20", battery, user, os1);
		
		phn.start();
		comp.start();
		
		phn.shutdown();
		comp.shutdown();
	}
}
