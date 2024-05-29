public class Test {
    public static void main(String[] args) {
        // Create a new Matrix
        Matrix m1 = new Matrix(2, 2);
        Matrix m2 = new Matrix(2, 2);

        // Fill the matrices with some values
        m1.getMatrix()[0][0] = 1;
        m1.getMatrix()[0][1] = 2;
        m1.getMatrix()[1][0] = 3;
        m1.getMatrix()[1][1] = 4;

        m2.getMatrix()[0][0] = 5;
        m2.getMatrix()[0][1] = 6;
        m2.getMatrix()[1][0] = 7;
        m2.getMatrix()[1][1] = 8;

        // Save the matrices to files
        m1.save("m1.txt");
        m2.save("m2.txt");

        // Read the matrices from the files
    	@SuppressWarnings("unused")
        Matrix m1FromFile = Matrix.read("m1.txt");
    	@SuppressWarnings("unused")
        Matrix m2FromFile = Matrix.read("m2.txt");

        // Perform some operations on the matrices
        Matrix sum = m1.sum(m2);
        Matrix product = m1.product(m2);

        // Print the results
        System.out.println("Sum of m1 and m2:");
        printMatrix(sum);
        System.out.println("Product of m1 and m2:");
        printMatrix(product);
    }

    public static void printMatrix(Matrix m) {
        for (int i = 0; i < m.getMatrix().length; i++) {
            for (int j = 0; j < m.getMatrix()[0].length; j++) {
                System.out.print(m.getMatrix()[i][j] + " ");
            }
            System.out.println();
        }
    }
}
