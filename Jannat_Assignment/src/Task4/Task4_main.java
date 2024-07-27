package Task4;

import java.util.Scanner;

public class Task4_main {
	public static int[] countVC(String arg) {
        int[] counts = new int[2];
        String lowerCaseArg = arg.toLowerCase();

        for (int i = 0; i < lowerCaseArg.length(); i++) {
            char ch = lowerCaseArg.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    counts[0]++; // Increment vowel count
                } else {
                    counts[1]++; // Increment consonant count
                }
            }
        }

        return counts;
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = sc.next();
        int[] counts = countVC(input);
        
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
    }
}

