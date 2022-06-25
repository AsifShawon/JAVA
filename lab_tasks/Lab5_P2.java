/*
 2.Write a method isPalidrome(String arg) that determines if a String is palindrome or not. Palindrome is when a String remains the same after reversing. The method should return boolean type.

For example: MADAM is palindrome.

 */
package lab_tasks;
import java.util.Scanner;
class check{
    boolean isPalindrome(String arg){
        String temp=""; //declaring a blank string
        for(int i=arg.length()-1; i>=0; i--){
            temp+=(arg.charAt(i)); // storing every value from the last to first of "arg"
        }
        if(temp.equals(arg)) //checking equal or not
            return true; 
        else 
            return false;
    }
}
public class Lab5_P2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.next();
        check a = new check();
        if(a.isPalindrome(s)) System.out.print(s+" is palidrome");
        else System.out.print(s+" is not palidrome");
    }   
}
