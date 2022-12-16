
import java.io.*;

public class ObjectArrayBinary {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Student stuArray[] = {new Student("Faisal",1,3.65),new Student("Monir",2,3.8),new Student("Nasif",3,3.7)};
		
		try(ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("ObjectArrayData.dat")))
		{
			objOut.writeObject(stuArray);
		}

		try(ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("ObjectArrayData.dat")))
		{
			Student stuCopyArray[] = (Student []) objIn.readObject();
			for(int i=0;i<stuCopyArray.length;i++)
			     System.out.println(stuCopyArray[i]);
		}

	}

}
