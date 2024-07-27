package FileIO_Serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileRead {
	public static void main(String[] args) {
		Employee u[] = new Employee[4];
		File f = new File("File.dat");
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))){
			while(true) {
				u = (Employee[]) ois.readObject();
				//System.out.println(u[].name+" "+u.id+"\n");
				for(int i=0; i<4; i++) {
					System.out.println(u[i].name+" "+u[i].id);
				}
			}
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
