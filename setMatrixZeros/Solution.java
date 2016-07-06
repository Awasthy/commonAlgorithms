public class Solution {
    public void setZeroes(int[][] matrix) {
        if (matrix.length == 0) {
            return;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        HashSet<Integer> r0 = new HashSet<Integer>();
        HashSet<Integer> c0 = new HashSet<Integer>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    r0.add(i);
                    c0.add(j);
                }
            }
        }
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            int p = (int)it.next();
            for (int i = 0; i < cols; i++) {
                matrix[p][i] = 0;
            }
        }
        it = c0.iterator();
        while (it.hasNext()) {
            int p = (int)it.next();
            for (int i = 0; i < rows; i++) {
                matrix[i][p] = 0;
            }
        }
    }
}