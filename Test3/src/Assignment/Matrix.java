package Assignment;

import java.util.Scanner;

public class Matrix {

    private int number_of_rows_of_metrix;
    private int number_of_columns_of_metrix;
    private int[][] matrix;
    
    public Matrix(int a, int b){
        number_of_rows_of_metrix = a;
        number_of_columns_of_metrix = b;
        matrix = new int[a][b];
    }
    
    public void setrows(int number_of_rows_of_metrix) {
        this.number_of_rows_of_metrix = number_of_rows_of_metrix;
    }

    public void setcolumns(int number_of_columns_of_metrix) {
        this.number_of_columns_of_metrix = number_of_columns_of_metrix;
    }

    public int getNumber_of_rows_of_metrix() {
        return number_of_rows_of_metrix;
    }

    public int getNumber_of_columns_of_metrix() {
        return number_of_columns_of_metrix;
    }
    
    public void setElement(int i, int j, int value){
        matrix[i][j] = value;
    }
    
    public int getElement(int i, int j){
        return matrix[i][j];
    }
    
    
    public void addTwoMatrix(Matrix a){
        if(a.getNumber_of_rows_of_metrix()!=this.getNumber_of_rows_of_metrix() || a.getNumber_of_columns_of_metrix()!=a.getNumber_of_columns_of_metrix()){
            System.out.println("Matrices cannot be added");
            return;
        }
        
        int [][]add = new int[a.getNumber_of_rows_of_metrix()][a.getNumber_of_columns_of_metrix()];
        
        for(int i=0; i<add.length; i++){
            for(int j=0; j<add[0].length; j++){
                add[i][j] = this.getElement(i, j) + a.getElement(i, j);
            }
        }
        System.out.println("After Adding: ");
        for(int i=0; i<add.length; i++){
            for(int j=0; j<add[0].length; j++){
                System.out.print(add[i][j]+" ");
            }
            System.out.println("");
        }   
    }
        
    public void multiplyTwoMatrix(Matrix a){
        if(this.getNumber_of_columns_of_metrix()!=a.getNumber_of_rows_of_metrix()){
            System.out.println("Can't Multiply");
            return;
        }
        
        int [][]multiply = new int[this.getNumber_of_rows_of_metrix()][a.getNumber_of_columns_of_metrix()];
        
        for(int i=0; i<multiply.length; i++){
            for(int j=0; j<multiply[0].length; j++){
                for (int k = 0; k < multiply[0].length; k++) {
                    multiply[i][j] = multiply[i][j]+ this.getElement(i, k) * a.getElement(k, j);
                }
            }
        }
        System.out.println("After Multiplying: ");
        for(int i=0; i<multiply.length; i++){
            for(int j=0; j<multiply[0].length; j++){
                System.out.print(multiply[i][j]+" ");
            }
            System.out.println("");
        }   
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows of first metrix = ");
        int r = input.nextInt();
        System.out.print("Enter number of columns of first metrix = ");
        int c = input.nextInt();
        Matrix A = new Matrix(r, c);
        int value;
        System.out.println("Enter 1st Matrix Element:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                value = input.nextInt();
                A.setElement(i, j, value);
            }
        }
        
        System.out.print("Enter number of rows of second metrix = ");
        r = input.nextInt();
        System.out.print("Enter number of columns of second metrix = ");
        c = input.nextInt();
        
        Matrix B = new Matrix(r, c);
        System.out.println("Enter 2nd Matrix Element:");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                value = input.nextInt();
                B.setElement(i, j, value);
            }
        }
        
        A.addTwoMatrix(B);
        A.multiplyTwoMatrix(B);
    }
}