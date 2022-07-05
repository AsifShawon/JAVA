package lab_tasks;

public class Lab8_Main {
    public static void main(String[] args) {
    Point p1 = new Point(2,2);
    Point p2 = new Point(4,4);

    Line l1 = new Line(p1,p2);
    System.out.print("Length of "+p1+" & "+p2+" = "+l1.length());
    }
}
