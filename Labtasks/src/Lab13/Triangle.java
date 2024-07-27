package Lab13;

public class Triangle{
	float a,b,c;
	
	public Triangle(float s1, float s2, float s3) throws IllegalTriangleException{
		a = s1;
		b = s2;
		c = s3;
		
		if(((a+b)<=c) || ((a+c)<=b) || ((c+b)<=a)) {
			throw new IllegalTriangleException();
		}
	}
}
