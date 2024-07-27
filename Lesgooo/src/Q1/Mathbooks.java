package Q1;
import java.util.Scanner;

public class Mathbooks {
    private String name; // "-String:name"
    private int year; // "-int:year"

    public Mathbooks(){
        name = "";
        year = 0;
    }

    public Mathbooks(String name,int year){
        this.name = name;
        this.year = year;
    }
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

    public int calculate(){
        int[][] matrix = new int[3][3];
        int sum_of_diagonal  = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3*3 matrix elements: ");
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        for(int i=0; i<3; i++){
            sum_of_diagonal =  sum_of_diagonal + matrix[i][i];
        }
        return sum_of_diagonal;
    }
}

