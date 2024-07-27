import java.util.Scanner;
public class Q5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of a right triangle's opposite/adjacent side: ");
        int x= scanner.nextInt();
        for(int i=1; i<=x; i++){
            for(int j=1; j<=x-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }System.out.println();
        }

    }
}