package lab_tasks;

public class Point {
    private int x,y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    Point(){}
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
    void setX(int x){
        this.x = x;
    }
    void setY(int y){
        this.y = y;
    }
    public String toString() {
        return "("+x+","+y+")";
    }
    double distance(Point point){
        return Math.sqrt(Math.pow((point.x - this.x),2)+Math.pow((point.y - this.y),2));
        // calculating distance between two points
        // initially one point is user defined and other is (0,0)
        // (0,0) auto generated when an object under Point class is being created

        // @but when "start_point.distance(this.end_point)" line calls distance like this
        // point.x or point.y indicates to the end_points
        // and this.x or this.y indicates to the start_points
    }
}
