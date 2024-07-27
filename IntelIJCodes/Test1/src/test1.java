import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ten numbers: ");
        double[] arr = new double[10];
        for(int i=0; i<10; i++){
            arr[i] = in.nextDouble();
        }

        System.out.println(average(arr));
    }

    public static int average(int[] arr){
        int sum = 0;
        for(int i=0; i<10; i++){
            sum += arr[i];
        }
        return sum/10;
    }

    public static double average(double[] arr){
        double sum = 0;
        for(int i=0; i<10; i++){
            sum += arr[i];
        }
        return sum/10.0;
    }
}
