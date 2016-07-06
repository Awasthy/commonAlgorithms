public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int lr = 0;
        int lc = 0;
        int hr = matrix.length - 1;
        if (hr == -1) {
            return result;
        }
        int hc = matrix[0].length - 1;
        
        
        int n = (hr + 1) * (hc + 1);
        int i = 0;
        int j = 0;
        while(true) {
            if (i == lr && j == lc) {
                for (; j <= hc; j++) {
                    result.add(matrix[i][j]);
                    if (result.size() == n) {
                        return result;
                    }
                }
                j--;
                i++;
                lr++;
            }
            if (i == lr && j == hc) {
                for (; i <= hr; i++) {
                    result.add(matrix[i][j]);
                    if (result.size() == n) {
                        return result;
                    }
                }
                i--;
                j--;
                hc--;
            }
            if (i == hr && j == hc) {
                for (; j >= lc; j--) {
                    result.add(matrix[i][j]);
                    if (result.size() == n) {
                        return result;
                    }
                }
                j++;
                i--;
                hr--;
            }
            if (i == hr && j == lc) {
                for (; i >= lr; i--) {
                    result.add(matrix[i][j]);
                    if (result.size() == n) {
                        return result;
                    }
                }
                i++;
                j++;
                lc++;
            }
        }
    }
}