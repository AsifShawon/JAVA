
public class Matrix {
	private int row,col;
	private int[][] mat;
	
//	public Matrix() {
//		row = 5;
//		col = 5;
//		int[][] mat = new int[row][col];
//	}
	
	public Matrix(int r, int c) {
		row = r;
		col = c;
		mat = new int[row][col];
	}
	
	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}
	
	public void setElement(int r, int c, int el) {
		mat[r][c] = el;
	}
	
	public int getElement(int r, int c) {
		return mat[r][c];
	}
	
	public void addMatrix(Matrix m) {
		if(!(this.getRow()==m.getRow() && this.getCol()==m.getCol())) {
			System.out.println("Matrix are not addable.");
		}
		
		else {
			Matrix c = new Matrix(this.getRow(),this.getCol());
			int value;
			
			for(int i=0; i<this.getRow(); i++) {
				for(int j=0; j<this.getCol(); j++) {
					value = this.getElement(i, j) + m.getElement(i, j);
					c.setElement(i, j, value); 
				}
			}
			System.out.println("After adding: ");
			c.Print();
		}
	}
	
	public void multiplyMatrix(Matrix m) {
		if(this.getCol()!=m.getRow()) {
			System.out.println("Can't Multiply.");
		}
		
		else {
			Matrix c = new Matrix(this.getRow(),m.getCol());
			int val;
			for(int i=0; i<this.getRow(); i++) {
				for(int j=0; j<m.getCol(); j++) {
					val = 0;
					for(int k=0; k<this.getCol(); k++) {
						val += this.getElement(i, k)*m.getElement(k, j);
					}
					c.setElement(i, j, val);
				}
			}
			c.Print();
		}
	}
	
	public void Print() {
		for(int i=0; i<this.getRow(); i++) {
			for(int j=0; j<this.getCol(); j++) {
				System.out.print(this.getElement(i, j)+" ");
			}
			System.out.println("");
		}
	}
	
}
