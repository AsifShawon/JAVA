

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class writereader {
    public static void main(String[] args) {
       int arr[] = new int[20];
       int i ,j =5;
        Scanner in= new Scanner(System.in);
//        for(j=0;j<5;j++){
//            arr[j] = in.nextInt();
//        }

        int num;

       try{

        File f1 = new File("sample.txt");

           FileWriter b = new FileWriter(f1);
          // Scanner a = new Scanner(f1);
             for(i=0;i<5;i++){
            	 b.write(1+1);
            }

            b.close();
    }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
