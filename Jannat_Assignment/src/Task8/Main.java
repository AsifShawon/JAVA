package Task8;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);

        System.out.println("Point 1: " + point1);
        System.out.println("Point 2: " + point2);

        Line line = new Line(point1, point2);

        System.out.println("\nLine: " + line);
        System.out.println("Length of the Line: " + line.getLength());
        
        Triangle triangle = new Triangle(line, new Line(4, 0, 0, 3), new Line(0, 3, 3, 4));

        System.out.println("\nTriangle: " + triangle);
        System.out.println("Perimeter of the Triangle: " + triangle.perimeter());
        System.out.println("Area of the Triangle: " + triangle.area());
    }
}

