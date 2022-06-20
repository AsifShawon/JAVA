/*
Q6. Write a program to print out all Armstrong numbers between 1 and 999. If
sum of cubes of each digit of the number is equal to the number itself, then the
number is called an Armstrong number. (5)
For example, 153 = (1 * 1 * 1) + (5 * 5 * 5) + (3 * 3 * 3)
 */
package lab_tasks;

public class Assignment_1_6 {
    public static void main(String[] args){
        int sum;
        for(int i=1; i<=999; i++){
            sum = 0;
            int num = i;
            while(num!=0){
                int rem = num%10;
                sum = rem*rem*rem + sum;
                num = num/10;
            }
            if(sum==i) System.out.print(i+" ");
        }
    }
}
