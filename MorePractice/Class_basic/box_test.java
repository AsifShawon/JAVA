package class_basic;

public class box_test {
    public static void main(String[] args) {
        Box box1 = new Box();
// Test constructors and toString()
        System.out.println(box1.toString()); // Explicitly calling toString()
        System.out.println(box1); // Implicit call to
        System.out.println(box1.volume());
    }
}
