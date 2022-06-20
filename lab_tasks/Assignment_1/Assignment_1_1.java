/*
Q1. Print the following pattern. (5)
*
**
***
*****
******
*/
package lab_tasks;

public class Assignment_1_1 {
    public static void main(String[] args)
    {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){ 
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
}
