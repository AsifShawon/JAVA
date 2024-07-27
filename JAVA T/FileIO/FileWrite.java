import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;



public class AppendDemo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		File fl = new File("D:\\Academic\\NSU\\Programs\\Data\\Numbers.txt");
		
		try{
			
			FileWriter outFile = new FileWriter(f1);
			
//			outFile.write("\n");	
			while(true) {
				a = sc.nextInt();
				if(a<0) break;
	            outFile.write(a+"\n");			
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