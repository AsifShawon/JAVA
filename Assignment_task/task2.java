package Assignment2;

import java.util.Scanner;

class Electronic_elements {
    String name;
    double hours;

    public Electronic_elements(String n, double h) {
        name = n;
        hours = h;
    }

    public double expenditure() {
        return 0; 
    }
}

class Light extends Electronic_elements {
	static String element = "Light";
    public Light(double hours) {
        super(element, hours);
    }

    @Override
    public double expenditure() {
        return hours * 1; 
    }
}

class Fan extends Electronic_elements {
	static String element = "Fan";
    public Fan(double hours) {
        super(element, hours);
    }

    @Override
    public double expenditure() {
        return hours * 1.5; 
    }
}

class AC extends Electronic_elements {
	static String element = "AC";
    public AC(double hours) {
        super(element, hours);
    }

    @Override
    public double expenditure() {
        return hours * 5; 
    }
}

public class task2 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        System.out.print("Number of hours the light is running: ");
        double lightHours = sc.nextDouble();

        System.out.print("Number of hours the fan is running: ");
        double fanHours = sc.nextDouble();

        System.out.print("Number of hours the AC is running: ");
        double acHours = sc.nextDouble();

        Light light = new Light(lightHours);
        Fan fan = new Fan(fanHours);
        AC ac = new AC(acHours);

        double totalCost = light.expenditure() + fan.expenditure() + ac.expenditure();

        System.out.println("Total cost(s): "+ totalCost + " TK.");
    }
}

