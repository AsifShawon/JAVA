import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;

public class Main {
	public static void main(String[] args) {
		File f = new File("D:\\JAVA\\Projects\\vote.dat");
		
		
		try(DataInputStream dis = new DataInputStream(new FileInputStream(f))){
			while(true) {
				System.out.print(dis.readUTF()+" ");
				System.out.print(dis.readUTF()+" ");
				System.out.print(dis.readInt()+" ");
				System.out.print(dis.readUTF()+" ");
				System.out.print(dis.readInt()+" ");
				System.out.println("");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
}
