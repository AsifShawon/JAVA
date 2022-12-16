
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


class Student{
	String name;
	int ID;
	double CGPA;
	Student(){}
	Student(String s,int i,double d){
		name = s;
		ID = i;
		CGPA = d;
	}
}


public class FileRecordSort {
	public static void main(String[] args) {
		
		int i,j,n,id;
		double cgpa;
		String str;
		Student temp;
		Student Stu[] = new Student[10];
		
		File fileR = new File("D:\\Academic\\NSU\\Programs\\Data\\Students.txt");
		File fileW = new File("D:\\Academic\\NSU\\Programs\\Data\\Students_Sort_CGPA.txt");
		
		try{
			
			Scanner inFile = new Scanner (fileR);
			FileWriter outFile = new FileWriter(fileW);
            
            
        	i=0;
            while(inFile.hasNextLine()){

            	str = inFile.nextLine();
            	id = inFile.nextInt();
            	cgpa = inFile.nextDouble();
            	
            	Stu[i] = new Student(str,id,cgpa);
            	
            	System.out.println(Stu[i].name+" "+Stu[i].ID+" "+Stu[i].CGPA);
            	
            	if(inFile.hasNextLine())inFile.nextLine();
            	i++;
            }
            
			n=i;
           
			for(i=0;i<n-1;i++)
        	   for(j=i+1;j<n;j++)
        	   {
        		   if(Stu[i].CGPA<Stu[j].CGPA)
        		  //if(Stu[i].name.compareTo(Stu[j].name)>0)   
        		   {
        			   temp = Stu[i];
        			   Stu[i] = Stu[j];
        			   Stu[j] = temp;
        		   }
        	   }
           
         for(i=0;i<n;i++)
        	 outFile.write(Stu[i].name+"\n"+Stu[i].ID+"\n"+Stu[i].CGPA+"\n");
        	 
        	 
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
