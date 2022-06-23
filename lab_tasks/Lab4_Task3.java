/*
 . Take a 3X3 array and initialize it with these values:

3	4	9
2	9	11
4	6	0

Calculate and print the sum for each row, column and both diagonals.

 */
package lab_tasks;

public class Lab4_Task3 {
    public static void main(String[] args){
        int a[][] = {{3,4,9},
                     {2,9,11},
                     {4,6,0}};
        int row = a[0].length; //3
        int col = a.length; //3
        
        int sumOfRow=0, sumOfCol=0, sumOfDiagonal1=0,sumOfDiagonal2=0;
        
        //calculating row's sum
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                sumOfRow += a[i][j];
            }
            System.out.println("Sum of row "+(i+1)+": "+sumOfRow);
        }
        //calculating column's sum
        for(int i=0; i<col; i++){
            for(int j=0; j<row; j++){
                sumOfCol += a[j][i];
            }
            System.out.println("Sum of column "+(i+1)+": "+sumOfCol);
        }
        
        //calculating diagonal 1's sum
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
            if(i==j) sumOfDiagonal1+=a[i][j];
        }
        }
        System.out.println("Sum of Diagonal 1: "+sumOfDiagonal1);
        
        //calculating diagonal 2's sum
        for(int i=0, j=col-1; i<row && j>=0; i++,j--){
            sumOfDiagonal2 += a[i][j];
        }
        System.out.println("Sum of Diagonal 2: "+sumOfDiagonal2);
        
        
    }
    
}
