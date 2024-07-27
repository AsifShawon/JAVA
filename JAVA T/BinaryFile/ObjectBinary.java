
import java.io.*;
import java.util.Date;

public class ObjectBinary {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Date today = new Date();

		Student stu = new Student("Monir",12,3.65);
		Student stuCopy = new Student();
		
		try(ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("ObjectData.dat")))
		{
			objOut.writeObject(today);
			objOut.writeObject(stu);
			
			/*objOut.writeUTF(stu.name);
			objOut.writeInt(stu.ID);
			objOut.writeDouble(stu.CGPA);*/
		}
		
		try(ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("ObjectData.dat")))
		{
			Date todayCopy = (Date) objIn.readObject();
			System.out.println(todayCopy);
			
			stuCopy = (Student) objIn.readObject();
			
			/*stuCopy.name = objIn.readUTF();
			stuCopy.ID = objIn.readInt();
			stuCopy.CGPA = objIn.readDouble();*/
			
			System.out.println(stuCopy);
			
		}
		

	}

}
