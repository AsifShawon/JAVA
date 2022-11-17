package MorePractice;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        double sum = 0;
        int term,number=0;
        while(true){
            s = sc.next();
            term = 0;
            if(s.charAt(0)=='q')
                break;
            else {
                for(int i=0; i<s.length(); i++) {
                   term = 10*term +(s.charAt(i) - '0');
                }
            }
            // System.out.println(term);
            sum += term;
            ++number;
        }
        System.out.println("average: "+sum/number);
    }
}
