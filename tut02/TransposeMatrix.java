package tutorial_2;

public class TransposeMatrix {
    static void convertMatrix(int[][] matrix) {
        int[][] transposed_matrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transposed_matrix[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < transposed_matrix.length; i++) {
            for (int j = 0; j < transposed_matrix[i].length; j++) {
                System.out.print(transposed_matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}};
        convertMatrix(matrix);
    }
}

