
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class IntSort {
	
	public static void main(String[] args) throws IOException {
		int array[] = new int [20];
		int i,j,n,temp;
		
		
		File fl = new File("D:\\Academic\\NSU\\Programs\\Data\\Numbers.txt");
		File flSort = new File("D:\\Academic\\NSU\\Programs\\Data\\NumbersSort.txt");
		
		try {
		
			Scanner inFile = new Scanner(fl);
		    
			FileWriter outFile = new FileWriter(flSort);
		
			
		i=0;
		while(inFile.hasNextInt()){
			array[i] = inFile.nextInt();
			i++;
		}
		
		n=i;
		
		/*for(i=0;i<n;i++){
		System.out.println(array[i]);
	    }*/
		
		for(i=0;i<n-1;i++)
			for(j=i+1;j<n;j++)
			{
				if(array[i]>array[j]){
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		
		  for(i=0;i<n;i++)
			{
			System.out.println(array[i]); 
			outFile.write(array[i]+"\n");
			}
		
		inFile.close();
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
