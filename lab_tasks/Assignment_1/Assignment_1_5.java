/*
Q5. Take 10 characters as input from user. Check if it’s a vowel or consonant. If it’s a vowel, 
print “It’s a vowel”. If it’s a consonant, move to the next input. If the user inputs “b” or “z”, exit 
the loop and print “Critical error”. Assume user inputs all characters in lowercase. 
*/

package lab_tasks;
import java.util.Scanner;

public class Assignment_1_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        char str[] = new char[10];
        for(int i=0; i<10; i++){
            System.out.print("Enter Character: ");
            str[i] = sc.next().charAt(0);
            if(str[i]=='a' || str[i]=='e' ||str[i]=='i' || str[i]=='o' ||str[i]=='u')
                System.out.println("It's a vowel");
            else if(str[i]=='b' || str[i]=='z'){
                System.out.println("Critical error");
                break;
            }
        }
    }
    
}
