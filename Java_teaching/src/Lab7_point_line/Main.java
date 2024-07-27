package Lab7_point_line;

public class Main {
	public static void main(String[] args) {
		Point p1 = new Point(3,4);
		Point p2 = new Point(5,6);
		
		System.out.println("Distance between "+p1+" and "+p2+" is :"+p1.distance(p2));
	}
}
