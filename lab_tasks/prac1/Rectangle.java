package lab_tasks.prac1;

public class Rectangle extends Shape{
    private double side1, side2;

    Rectangle(String name, double a, double b){
        super(name);
        side1 = a;
        side2 = b;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double area(){
        return side1*side2;
    }

    public double perimeter(){
        return 2*(side1 + side2);
    }
}
