
public class Line {
	private Point start;
	private Point end;
	
	//Line(start : Point, end : Point)
	public Line(Point start, Point end) {
		this.start = start;
		this.end = end;
	}
	
	//Line(x1 : int, y1 : int, x2 : int, y2 : int)
	public Line(int x1, int y1, int x2, int y2) {
		start = new Point(x1,y1);
		end = new Point(x2,y2);
	}
	
	public Point getStart() {
		return start;
	}

	public void setStart(Point start) {
		this.start = start;
	}

	public Point getEnd() {
		return end;
	}

	public void setEnd(Point end) {
		this.end = end;
	}
	
	public double getLength() {
		int x1 = start.getX();
		int y1 = start.getY();
		int x2 = end.getX();
		int y2 = end.getY();
		int diff_x = (x2-x1)*(x2-x1);
		int diff_y = (y2-y1)*(y2-y1); 
		double length = Math.sqrt(diff_x+diff_y); 
		return length;
	}
	
	@Override
	public String toString() {
		return "Line: Start = "+start+" End: "+end;
	}
}
