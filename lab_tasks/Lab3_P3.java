/*
3.	Write a program which will use while loop to print all the integers between 100 and 150 which are divisible by 8 in descending order.

Output: 144 136 128 120 112 104

*/
package lab_tasks;

public class LAb3_P3 {
    public static void main(String[] args){
        int num = 150;
        while(num!=100){
            if(num%8==0) System.out.print(num+" ");
            num--;
        }
    }
    
}
