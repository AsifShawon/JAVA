public class Point {
    private int x, y;

    Point(){
        this.x = 0;
        this.y = 0;
    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public String toString(){
        return "("+x+","+y+")";
    }
    public int[] getXY(){
        int p[] ={x,y};
        return p;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y){
        return Math.sqrt(Math.pow((this.x-x),2)-Math.pow((this.y-y),2));
    }
    public double distance(Point p){
        return Math.sqrt(Math.pow((this.x-p.x),2)-Math.pow((this.y-p.y),2));
    }
    public double distance(){
        return Math.sqrt(Math.pow(this.x,2)-Math.pow(this.y,2));
    }
}