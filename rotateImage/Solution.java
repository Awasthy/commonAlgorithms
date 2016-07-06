public class Solution {
    public void rotate(int[][] matrix) {
        reflectDiagonal(matrix);
        reflectAxis(matrix);
    }
    
    private void reflectDiagonal(int [][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i; j++) {
                swap(matrix, i, j, j, i);
            }
        }
    }
    
    private void reflectAxis(int [][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            int p = 0;
            int q = cols - 1;
            while (p < q) {
                swap(matrix, i, p, i, q);
                p++;
                q--;
            }
        }
    }
    
    private void swap(int[][] matrix, int r1, int c1, int r2, int c2) {
        int temp = matrix[r1][c1];
        matrix[r1][c1] = matrix[r2][c2];
        matrix[r2][c2] = temp;
    }
}