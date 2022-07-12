
import java.util.Scanner;

public class Method_PallindromeNumber {
    static boolean isPallindrom(int num){
        int temp = num;
        int rev=0;
        while(temp!=0){
            rev = rev*10 + temp%10;
            temp/=10;
        }

        if(num==rev) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        if(isPallindrom(a)) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
    }
}
