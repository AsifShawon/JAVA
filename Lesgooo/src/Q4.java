import java.util.Scanner;

public class Q4 {
    static int fibonacci(int n){
        if(n <= 1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    static int altFibo(int n){
        if(n <= 1){
            return n;
        }
        int i;
        if(n%2==0) i=-1;
        else i=1;

        return altFibo(n-1) + i*fibonacci(n);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter N: ");
            int n = scanner.nextInt();
            if(n <= 1){
                System.out.print("End.");
                break;
            }
            System.out.println("Sum: "+altFibo(n-1));
        }
    }
}
