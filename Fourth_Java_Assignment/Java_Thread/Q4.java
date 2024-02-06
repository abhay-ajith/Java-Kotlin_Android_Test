package Java_Thread;

public class Q4 {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        int[][] result = multiply(matrix1, matrix2);
        printMatrix(result);
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];
        Thread[][] threads = new Thread[matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                final int row = i;
                final int col = j;
                threads[row][col] = new Thread(() -> {
                    int sum = 0;
                    for (int k = 0; k < matrix1[row].length; k++) {
                        sum += matrix1[row][k] * matrix2[k][col];
                    }
                    result[row][col] = sum;
                });
                threads[row][col].start();
            }
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                try {
                    threads[i][j].join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
