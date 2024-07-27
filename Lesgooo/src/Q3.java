import java.util.Scanner;

public class Q3 {

    static int summation(int num){
        int sum = 0;
        for(int i=3; i<=num; i=i+3){
            sum = sum + i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();


        System.out.println("Sum: "+summation(num));
    }
}
