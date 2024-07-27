package FileIO_Serializable;

import java.io.Serializable;

public class Employee implements Serializable{
	String name;
	int id;
	
	public Employee(String s, int a) {
		name = s;
		id = a;
	}
}
