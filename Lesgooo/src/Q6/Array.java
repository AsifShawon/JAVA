package Q6;

import java.util.Scanner;

public class Array {
    private int[][] array;

    public Array(){
          array = new int[3][3];
    }

    public void createArray(){
        System.out.println("Enter 3*3 array elements: ");
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                array[i][j] = scanner.nextInt();
            }
        }
    }

    public int summation(){
        return array[0][1]+array[1][1]+array[2][0]+array[2][1]+array[2][2];
    }
}
