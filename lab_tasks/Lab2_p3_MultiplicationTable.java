package lab_tasks;
/*
3.Write a program that prints the multiplication table from 1 to 5.

1X1=1
1X2=2
…………

5X10=50

*/
public class Lab2_p3_MultiplicationTable {
    public static void main(String[] args){
        System.out.println("Multiplication Table\n");
        
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<=10; j++){
                System.out.println(i+" X "+j+" = "+(i*j));
            }
            System.out.print("\n");
        }
    }
}
