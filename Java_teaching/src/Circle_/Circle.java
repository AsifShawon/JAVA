package Circle_;

public class Circle {

    private  double radius;
    private String color ;

    // defAULT constructor or without parameter constructor
    public Circle () {
        radius = 1.0;
        color = "red";
    }

    // parameterized constructor - only radius
    public Circle (double r) {
        radius = r;
        color = " red";
    }
    
 // parameterized constructor - radius and color
    public Circle (double r, String c) {
        radius = r;
        color = c;
    }

    public double getRdius() {
        return radius;
    }

    public double getArea() {
        return 3.14*radius*radius;
    }
}
