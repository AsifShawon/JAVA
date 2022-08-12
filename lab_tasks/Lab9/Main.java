package Lab9;

public class Main {
    public static void main(String []args) {
        Faculty obj = new Faculty("Chowdhury",55,"1234","Male","ECE",12345.67,"CFA","1st");

        System.out.print(obj.getName()+" "+obj.getAge()+" "+obj.getSalary()+" "+obj.getInitial()+"\n");
        System.out.print(obj); // 1

        System.out.print("\n\n");
        obj.printInfo(); // 2
    }
}
