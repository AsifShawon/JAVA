public class CircleMain {
    public static void main(String[] args) {
        Point p1 = new Point(5,5);
        Circle c1 = new Circle(1,1,2);
        Circle c2 = new Circle(p1,5);
        System.out.println("C1:"+c1);
        System.out.println("Area: "+c1.getArea());
        System.out.println("Circumference: "+c1.getCircumference());
        System.out.println("C2:"+c2);
        System.out.println("Area: "+c2.getArea());
        System.out.println("Circumference: "+c2.getCircumference());
        System.out.println("Distance between c1 and c2: "+c1.distance(c2));
    }
}