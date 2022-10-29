package MatrixMultiplication;

public class TwoMatrixMul {
    public static void main(String[] arrStrings) {
        int r1 = 2, c1 = 3;
        int r2 = 3, c2 = 2;
        int[][] matrixOne = { { 3, -2, 5 }, { 3, 0, 4 } };
        int[][] matrixTwo = { { 2, 3 }, { -9, 0 }, { 0, 4 } };

        // Mutliplying Two matrices
        int[][] product = matricesMul(matrixOne, matrixTwo, r1, c1, c2);

        // Displaying the result
        displayResult(product);
    }

    public static int[][] matricesMul(int[][] matrixOne, int[][] matrixTwo, int r1, int c1, int c2) {
        int[][] product = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += matrixOne[i][k] * matrixTwo[k][j];
                }
            }
        }

        return product;
    }

    public static void displayResult(int[][] product) {
        System.out.println("Product of two matrices is: ");
        for (int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }

}
