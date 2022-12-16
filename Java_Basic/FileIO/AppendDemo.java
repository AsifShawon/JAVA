
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;



public class AppendDemo {
	
	public static void main(String[] args) {
		
		int a[] = {100,200,300};
		
		File fl = new File("D:\\Academic\\NSU\\Programs\\Data\\NumbersSort.txt");
		
		try{
			
			FileWriter outFile = new FileWriter(fl,true);
			
			outFile.write("\n");	
			for(int i=0;i<a.length;i++)
	             outFile.write(a[i]+"\n");			
		
		     outFile.close();
		
		  }
		 catch(FileNotFoundException e){
			System.out.println("File cann't be found "+e);
		   }
		   catch(IOException e){
			  System.out.println("I/O Exception "+e);
		  }
	}

}
