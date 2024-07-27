import java.util.Scanner;

public class BeerSong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row=3, col=3;
        int [][]arr = new int[row][col];
        
        for(int i=0; i<row; i++) {
        	for(int j=0; j<col; j++) {
        		arr[i][j] = scanner.nextInt();
        	}
        }
        int sum = 0;
        for(int i=0; i<row; i++) {
        	for(int j=0; j<col; j++) {
        		System.out.print(arr[i][j]+" ");
        		if(i==j) {
        			sum += arr[i][j];
        		}
        	}
        	System.out.println(""); // new line
        }
        System.out.println("Sum of digonal = "+sum);
    }
}
