package lab_tasks;


import java.util.Scanner;


public class Lab1_Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name[],gen[];
        int id[],sec[];
        float Cgpa[];
        name = new String[5];
        gen = new String[5];
        id = new int[5];
        sec = new int[5];
        Cgpa = new float[5];
        
        for(int i=0; i<5; i++)
        {
            System.out.println("Enter Student "+(i+1)+" Information:::");
            System.out.print("Name: ");
            name[i]=in.next();
            System.out.print("ID: ");
            id[i]=in.nextInt();
            System.out.print("Section: ");
            sec[i]=in.nextInt();
            System.out.print("Cgpa: ");
            Cgpa[i]=in.nextFloat();
            System.out.print("Gender: ");
            gen[i]=in.next();
        }
        // (i) 
        System.out.println("\n\nFemales");
        for(int i=0; i<5; i++){
            if(gen[i].equals("female") && (name[i].length()==4))
            {
                System.out.println("Id: "+id[i]);
                System.out.println("Section: "+sec[i]);
                System.out.print("\n");
            }
        }
        System.out.println("\nMales");
        //(i)
        for(int i=0; i<5; i++){
            if(gen[i].equals("male") && (name[i].startsWith("S")))
            {
                System.out.println("Name: "+name[i]);
                System.out.println("CGPA: "+Cgpa[i]);
                System.out.print("\n");
            }
        }
    }
}
