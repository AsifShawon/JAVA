package Lab7_point_line;

public class Point {
	private int x, y;
	
	public Point() {
		x = y = 0;
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "("+x+","+y+")"; //(x,y)
	}
	
	public double distance(Point point) {
		double dist;
		int x2 = point.getX();
		int y2 = point.getY();
		
		dist = Math.sqrt((x2-x)*(x2-x)+(y2-y)*(y2-y));
		
		return dist;
	}
}
