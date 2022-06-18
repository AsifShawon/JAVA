/*
. Print the following

12345
1234
123
12
1	


*/

package lab_tasks;

public class Lab3_P2 {
    public static void main(String[] args){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=6-i; j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
