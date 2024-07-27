package class_basic;

public class test_rectangle {
    public static void main(String[] args) {
        Rectangle rectangle_1 = new Rectangle(5, 10);
        Rectangle rectangle_2 = new Rectangle(6, 12);

        System.out.println("Area of the rectangle = " + rectangle_1.getArea());
        System.out.println("Area of the rectangle 2 = " + rectangle_2.getArea());
    }
    
}
