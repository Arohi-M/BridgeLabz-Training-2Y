import java.util.Random;

public class MatrixManipulation {

    // Method to create a random matrix
    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = 1 + rand.nextInt(9); // random numbers from 1 to 9
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row) {
                System.out.printf("%.2f\t", val);
            }
            System.out.println();
        }
    }

    // Method to find transpose of a matrix
    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transpose = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to find determinant of 2x2 matrix
    public static double determinant2x2(double[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find determinant of 3x3 matrix
    public static double determinant3x3(double[][] matrix) {
        double det = matrix[0][0]*(matrix[1][1]*matrix[2][2] - matrix[1][2]*matrix[2][1])
                   - matrix[0][1]*(matrix[1][0]*matrix[2][2] - matrix[1][2]*matrix[2][0])
                   + matrix[0][2]*(matrix[1][0]*matrix[2][1] - matrix[1][1]*matrix[2][0]);
        return det;
    }

    // Method to find inverse of 2x2 matrix
    public static double[][] inverse2x2(double[][] matrix) {
        double det = determinant2x2(matrix);
        if (det == 0) {
            System.out.println("Matrix is singular, inverse does not exist.");
            return null;
        }

        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] = matrix[0][0] / det;

        return inverse;
    }

    // Method to find inverse of 3x3 matrix
    public static double[][] inverse3x3(double[][] matrix) {
        double det = determinant3x3(matrix);
        if (det == 0) {
            System.out.println("Matrix is singular, inverse does not exist.");
            return null;
        }

        double[][] inv = new double[3][3];
        inv[0][0] =  (matrix[1][1]*matrix[2][2] - matrix[1][2]*matrix[2][1]) / det;
        inv[0][1] = -(matrix[0][1]*matrix[2][2] - matrix[0][2]*matrix[2][1]) / det;
        inv[0][2] =  (matrix[0][1]*matrix[1][2] - matrix[0][2]*matrix[1][1]) / det;
        inv[1][0] = -(matrix[1][0]*matrix[2][2] - matrix[1][2]*matrix[2][0]) / det;
        inv[1][1] =  (matrix[0][0]*matrix[2][2] - matrix[0][2]*matrix[2][0]) / det;
        inv[1][2] = -(matrix[0][0]*matrix[1][2] - matrix[0][2]*matrix[1][0]) / det;
        inv[2][0] =  (matrix[1][0]*matrix[2][1] - matrix[1][1]*matrix[2][0]) / det;
        inv[2][1] = -(matrix[0][0]*matrix[2][1] - matrix[0][1]*matrix[2][0]) / det;
        inv[2][2] =  (matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0]) / det;

        return inv;
    }

    public static void main(String[] args) {
        // 2x2 Matrix
        double[][] matrix2x2 = createRandomMatrix(2, 2);
        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2x2);

        System.out.println("\nTranspose of 2x2 Matrix:");
        displayMatrix(transposeMatrix(matrix2x2));

        System.out.println("\nDeterminant of 2x2 Matrix: " + determinant2x2(matrix2x2));

        System.out.println("\nInverse of 2x2 Matrix:");
        double[][] inv2x2 = inverse2x2(matrix2x2);
        if (inv2x2 != null) displayMatrix(inv2x2);

        // 3x3 Matrix
        double[][] matrix3x3 = createRandomMatrix(3, 3);
        System.out.println("\n3x3 Matrix:");
        displayMatrix(matrix3x3);

        System.out.println("\nTranspose of 3x3 Matrix:");
        displayMatrix(transposeMatrix(matrix3x3));

        System.out.println("\nDeterminant of 3x3 Matrix: " + determinant3x3(matrix3x3));

        System.out.println("\nInverse of 3x3 Matrix:");
        double[][] inv3x3 = inverse3x3(matrix3x3);
        if (inv3x3 != null) displayMatrix(inv3x3);
    }
}
