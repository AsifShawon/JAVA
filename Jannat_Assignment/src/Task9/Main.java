package Task9;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4, "blue", "black", 1.5);
        System.out.println("Rectangle Details:");
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());

        Circle circle = new Circle(3, "red", "green", 2);
        System.out.println("\nCircle Details:");
        System.out.println(circle);
        System.out.println("Area: " + circle.area());
        System.out.println("Diameter: " + circle.diameter());
        System.out.println("Circumference: " + circle.circumference());

        Disk disk = new Disk(5, 2, "yellow", "white", 1);
        System.out.println("\nDisk Details:");
        System.out.println(disk);
        System.out.println("Area: " + disk.area());
    }
}

