public class Matrix {
	private static int[][] matrix;
	
	public Matrix(int n, int m) {
		matrix = new int[n][m];
	}
	public Matrix(Object object) {
		if (object.equals(matrix))
		matrix = (int[][]) object;
	}
	
	public int[][] getMatrix() {
		return this.matrix;
	}
	
	public static void save(String filename) {
		try {
//			File newObject = new File(filename);
//			newObject.createNewFile();
			XFile.writeObject(filename, matrix);
			System.out.println("Success save");
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static Matrix read(String filename) {
		try {
			Matrix input = new Matrix(XFile.readObject(filename)); 
			System.out.println("Success read");
			return input;
			
//			return (Matrix) XFile.readObject(filename);
			
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	public Matrix sum(Matrix M) {
		if (this.matrix.length == M.matrix.length && this.matrix[0].length==M.matrix[0].length) {
			Matrix sum = new Matrix(this.matrix.length, this.matrix[0].length);
	        for (int i = 0; i < this.matrix.length; i++) {
	            for (int j = 0; j < this.matrix[0].length; j++) {
	                sum.matrix[i][j] = this.matrix[i][j] + M.matrix[i][j];
	            }
	        }
	        return sum;
		}
		else {
			return null;
		}
	}
	
	public Matrix product(Matrix m) {
		if(this.matrix[0].length == m.matrix.length) {
			Matrix product = new Matrix(this.matrix.length, m.matrix[0].length);
			for (int i = 0; i< this.matrix.length; i++) {
				//numb of col
				for (int j = 0; j <m.matrix[0].length; j++) {
					//numb of row
					for (int k = 0; k<this.matrix[0].length; k++)
						product.matrix[i][j] += this.matrix[i][k] * m.matrix[k][j];
				}
			}
			return product;
		}
		else {
			System.out.println("The number of rows and the number of collumns of two matricces is not equal.");
			return null;
		}
	}
}
