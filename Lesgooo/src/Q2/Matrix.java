package Q2;

import java.util.Scanner;

public class Matrix {
    private String name;// -name: String
    private int year;

    // constructor -> must be named as class name, here classname = Q1.Mathbooks
    // without parameter -> blank constructor
    // no return type for constructor
    public Matrix(){
        name = "";
        year = 0;
    }


    // constructor with parameter
    public Matrix(String name,int year ){
        this.name = name;
        this.year = year;

    }

    // setter getter
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setYear(int year){
        this.year = year;
    }

    public String display(){
        return "Book Name: "+name+"\nPublishing Year: "+year;
    }

    public void calculate(){
        Scanner scanner = new Scanner(System.in);

        // Get dimensions of the matrices
        System.out.println("Enter the dimensions of the first matrix (rows and columns):");
        int rowsA = scanner.nextInt();
        int colsA = scanner.nextInt();
        System.out.println("Enter the dimensions of the second matrix (rows and columns):");
        int rowsB = scanner.nextInt();
        int colsB = scanner.nextInt();

        // Check if multiplication is possible
        if (colsA != rowsB) {
            System.out.println("Matrix multiplication is not possible. Number of columns of first matrix must be equal to number of rows of second matrix.");
            return;
        }

        // Initialize matrices
        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];
        int[][] resultMatrix = new int[rowsA][colsB];

        // Get values for matrix A
        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Get values for matrix B
        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                matrixB[i][j] = scanner.nextInt();
            }
        }

        // Perform matrix multiplication
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
