import java.util.Scanner;

public class A2_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r1,r2,c1,c2;
		System.out.println("Enter row and column of Matrix A: ");
		r1 = sc.nextInt();
		c1 = sc.nextInt();
		
		System.out.println("Enter row and column of Matrix B: ");
		r2 = sc.nextInt();
		c2 = sc.nextInt();
		
		Matrix A = new Matrix(r1,c1);
		Matrix B = new Matrix(r2, c2);
		
		int val;
		System.out.println("Enter elements of Matrix A: ");
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c1; j++) {
				val = sc.nextInt();
				A.setElement(i, j, val);
			}
		}
		
		System.out.println("Enter elements of Matrix B: ");
		for(int i=0; i<r2; i++) {
			for(int j=0; j<c2; j++) {
				val = sc.nextInt();
				B.setElement(i, j, val);
			}
		}
		
//		A.addMatrix(B);
		A.multiplyMatrix(B);
	}
}
