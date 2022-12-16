
import java.io.*;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		
		try(RandomAccessFile inOut = new RandomAccessFile("inout.dat","rw"))
		{
			int i;
			for(i=0;i<100;i++)
				inOut.writeInt(i);
			System.out.println("File Length: "+inOut.length()+" Bytes");
			inOut.seek(10*4);
			for(i=0;i<5;i++)
				System.out.print(inOut.readInt()+" ");
			
			System.out.println("\n"+inOut.readInt());
			
			inOut.writeInt(500);
			
			inOut.seek(10*4);
			for(i=0;i<10;i++)
				System.out.print(inOut.readInt()+" ");
		}
	}
}
