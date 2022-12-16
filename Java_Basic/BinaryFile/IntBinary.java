
import java.io.*;

public class IntBinary {

	public static void main(String[] args) throws IOException {
		int value;
		try(DataOutputStream fout = new DataOutputStream(new FileOutputStream("IntData.dat"))){
			
			for(int i=10;i<20;i++) 
				fout.writeInt(i);	
		}
		
		try(DataInputStream fin = new DataInputStream(new FileInputStream("IntData.dat"));
			DataOutputStream fout = new DataOutputStream(new FileOutputStream("IntDataCopy.dat"))){
			
			while(true) {
				value = fin.readInt();
				fout.writeInt(value);
				System.out.print(value+" ");
			}
		}
		catch(EOFException ex) {
			System.out.println("Copying complete");
		}
	
		System.out.println();
		
		try(DataInputStream fin = new DataInputStream(new FileInputStream("IntDataCopy.dat"))) {
			
				while(true) 
					System.out.print(fin.readInt()+" ");
			}
			catch(EOFException ex) {
				System.out.println("Reading complete");
			}
	
	
	}

}
