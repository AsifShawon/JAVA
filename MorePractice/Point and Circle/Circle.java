import java.security.PublicKey;

public class Circle {
    private double radius;
    private Point center;

    Circle(){
        center = new Point();
        radius  = 1;
    }
    Circle(int x, int y, int radius){
        center = new Point(x,y);
        this.radius = radius;
    }
    Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public Point getCenter() {
        return center;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setP(Point center) {
        this.center = center;
    }

    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        center.setX(x);
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        center.setY(y);
    }

    public int[] getCenterXY(){
        return center.getXY();
    }
    public void setCenterXY(int x, int y){
        center.setXY(x,y);
    }

    public String toString(){
        return "Circle[center= "+center+",radius= "+radius+"]";
    }

    double getArea(){
        return 3.1416*radius*radius;
    }
    double getCircumference(){
        return 2*3.1416*radius;
    }
    double distance(Circle c){
        return center.distance(c.getCenterX(),c.getCenterY());
    }

}
