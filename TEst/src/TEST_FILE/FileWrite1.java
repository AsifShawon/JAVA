package TEST_FILE;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite1 {

	public static void main(String[] args) {
		File ob1=new File("Quiz.txt");
		Quiz Q[]=new Quiz[5];
		Q[0]=new Quiz(22,12.2);
		Q[1]=new Quiz(23,18.3);
		Q[2]=new Quiz(24,10);
		Q[3]=new Quiz(25,34);
		Q[4]=new Quiz(26,50);
		try
		{
			FileWriter writer=new FileWriter(ob1);
			for(int i=0;i<5;i++)
			{
				writer.write(Q[i].id+" "+Q[i].marks+"\n");
			}
			writer.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
