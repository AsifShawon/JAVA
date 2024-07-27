package Q7;

import java.util.Scanner;

public class Array {
    private int[][] array;
    private int n;

    public Array(int n){
        this.n = n;
        array = new int[n][n];
    }

    public void createArray(){
        System.out.println("Enter "+n+"*"+n+" array elements: ");
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                array[i][j] = scanner.nextInt();
            }
        }
    }

    public int summation(){
        int sum_of_array = 0;
        int mid = n/2;
        System.out.println("We're taking mid as column no: "+ mid);
        for(int i=0; i<n-1; i++){
//            System.out.println(array[i][mid]);
            sum_of_array = sum_of_array + array[i][mid];
        }
        for(int i=0; i<n; i++){
//            System.out.print(array[n-1][i]);
            sum_of_array = sum_of_array + array[n-1][i];
        }

        return sum_of_array;
    }
}
