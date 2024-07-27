
public class Student {
	private static String name;
	
	public Student(String n) {
		name = n;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Student.name = name;
	}
}
