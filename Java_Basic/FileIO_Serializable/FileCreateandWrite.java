package FileIO_Serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FileCreateandWrite {
	public static void main(String[] args) {
		
		Employee u[] = new Employee[5];
		
		u[0] = new Employee("Shawon", 11);
		u[1] = new Employee("Asif", 11);
		u[2] = new Employee("Shajid", 11);
		u[3] = new Employee("Towsif", 11);
		
		File f = new File("File.dat"); 
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))){ // try with resources
			oos.writeObject(u);
			System.out.println("Done!!");
		}
		catch(Exception e) {
			System.out.println("Errorrrr!!!!!");
		}
	}
}
