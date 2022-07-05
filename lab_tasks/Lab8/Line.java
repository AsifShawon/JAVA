package lab_tasks;

public class Line {
    // start and end point
    private Point start_point = new Point();
    private Point end_point = new Point();

    // taking two points as parameter
    Line(Point start_point, Point end_point){
        this.start_point = start_point;
        this.end_point = end_point;
    }

    // if user wants to enter points directly
    Line(int x1,int x2, int y1, int y2){
        start_point.setX(x1);
        start_point.setY(y1);
        end_point.setX(x2);
        end_point.setY(y2);
    }
    Point getStart(){
        return start_point;
    }
    Point getEnd(){
        return end_point;
    }
    void setStart(Point start_point){
        this.start_point = start_point;
    }
    void setEnd(Point end_point){
        this.end_point = end_point;
    }
    public double length(){
        return start_point.distance(this.end_point);
        // passing end_point as parameter under start_point object to calculate length
    }
}
