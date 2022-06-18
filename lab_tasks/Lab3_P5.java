/*
5.	Print the following pattern:

*
+++
*****
+++++++
*********

*/
package lab_tasks;

public class Lab3_P5 {
    public static void main(String[] args){
        char c = '+';
        for(int i=1; i<=7; i+=2){
            if(c=='+') c = '*';
                else c = '+';
            for(int j=1; j<=i; j++){
                System.out.print(c);   
            }
            System.out.print("\n");
        }
    }
    
}
