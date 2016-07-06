public class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        if (n == 0) {
            return matrix;
        }
        int lr = 0;
        int lc = 0;
        int hr = n - 1;
        int hc = n - 1;
        
        int i = 0;
        int j = 0;
        int p = 1;
        while(true) {
            if (i == lr && j == lc) {
                for (; j <= hc; j++) {
                    matrix[i][j] = p++;
                    if (p > n * n) {
                        return matrix;
                    }
                }
                j--;
                i++;
                lr++;
            }
            if (i == lr && j == hc) {
                for (; i <= hr; i++) {
                    matrix[i][j] = p++;
                    if (p > n * n) {
                        return matrix;
                    }
                }
                i--;
                j--;
                hc--;
            }
            if (i == hr && j == hc) {
                for (; j >= lc; j--) {
                    matrix[i][j] = p++;
                    if (p > n * n) {
                        return matrix;
                    }
                }
                j++;
                i--;
                hr--;
            }
            if (i == hr && j == lc) {
                for (; i >= lr; i--) {
                    matrix[i][j] = p++;
                    if (p > n * n) {
                        return matrix;
                    }
                }
                i++;
                j++;
                lc++;
            }
        }
    }
}
