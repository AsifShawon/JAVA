package TEST_FILE;

import java.io.File;
import java.util.Scanner;

public class FileRead {
	public static void main(String[] args) throws Exception {
		  File file = new File("Quiz.txt");
		  Quiz arr[]=new Quiz[5];
		  int i=0;
		   Scanner input = new Scanner(file);
		   while (input.hasNext()) {
		   int id= input.nextInt();
		   double marks = input.nextDouble();
		 
	        arr[i]=new Quiz(id,marks);
	        i++;
		   }
		   for (int j = 0; j < arr.length; j++) {
			   System.out.println("ID:"+arr[j].id + " Marks:" + arr[j].marks);
		    }
		   double max=0;
		   int c=0;
		   for (int j = 0; j < arr.length; j++) {
			if(arr[j].marks>max) {
				max=arr[j].marks;
				c=j;
			}
		  }
		   System.out.println("Highest mark obtained by ID:"+arr[c].id+" Marks:"+arr[c].marks);
		  
		   input.close();
		}
}
