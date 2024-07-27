package ObjectPass;

public class ObjectPass1 {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		
		int[] b;
		
		b = a;
		
		for(int i=0; i<b.length; i++) System.out.println(b[i]);
	}

}
