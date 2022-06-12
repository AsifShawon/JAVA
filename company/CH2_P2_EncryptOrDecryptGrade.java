/*
*Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
*/

package com.company;
import java.util.Scanner;
public class CH2_P2_EncryptOrDecryptGrade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Grade: ");
        char grade = in.next().charAt(0);
        // charAt() method returns the character at the specified index in a string.
        // The index of the first character is 0, the second character is 1, and so on.

        //Encrypting
        grade = (char)(grade-8);
        //Decrypting
        grade = (char)(grade+8);
        System.out.println("After decrypting your grade: "+grade);


    }
}
