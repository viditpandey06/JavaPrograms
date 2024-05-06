public class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println("Original Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        Solution sol = new Solution();
        sol.rotate(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}

class Solution1 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] ansMatrix = new int[n][n];
        int temp = 0;

        for (int i1 = 0, i2 = n - 1; i1 < matrix.length && i2 >= 0; i1++, i2--) {
            for (int j = 0; j < matrix.length; j++) {
                ansMatrix[j][i2] = matrix[i1][j];

            }
        }

        for (int i = 0; i < ansMatrix.length; i++) {
            for (int j = 0; j < ansMatrix.length; j++) {
                System.out.print(ansMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class Solution {
    public void rotate(int[][] matrix) {
        
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (i != j) {
                    swap(matrix, i, j);
                }
            }
        }
        System.out.println(matrix.toString());
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }

    }

    public void swap(int[][] matrix, int i, int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

}