/*
1.Write a method countVowels(String arg) that takes a 
String as parameter and returns the number of vowels.
 */
package lab_tasks;

import java.util.Scanner;

class Vowels{
    int countVowels(String arg){
        int v=0;
        for(int i=0; i<arg.length(); i++){
            if(arg.charAt(i)=='a'||arg.charAt(i)=='e'||arg.charAt(i)=='o'||arg.charAt(i)=='i'||arg.charAt(i)=='u'||
                    arg.charAt(i)=='A'||arg.charAt(i)=='E'||arg.charAt(i)=='O'||arg.charAt(i)=='I'||arg.charAt(i)=='U'){
                v++;
            }
        }
        return v;
    }
}

public class Lab5_P1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        Vowels vowelN = new Vowels();
        int v = vowelN.countVowels(s);
        System.out.print("Vowels in the string: "+v);
    }
}
