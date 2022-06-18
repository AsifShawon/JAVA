/*
4.	Generate a random int between 1990 and 2020. Then print it check if it’s a leap year or not. Note: A leap year must satisfy any or both of the following conditions:

Divisible by 400

Divisible by 4 and not divisible by 100
Sample output:
2015: false

*/
package lab_tasks;

public class Lab3_P4 {
    public static void main(String[] args){
        int randYear = (int)(1990+Math.random()*(2020-1990+1));
        boolean result;
        result = randYear%400==0 || (randYear%4==0 && randYear%100!=0);
        System.out.print(randYear+": "+result);
    }
    
}
