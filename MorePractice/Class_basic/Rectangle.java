package class_basic;

public class Rectangle {
    private int width, length;

    // constructor - special method, named as "ClassName" and no return type
    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return width*length;
    }
}
