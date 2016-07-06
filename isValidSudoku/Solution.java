public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int n = board[i][j] - 48;
                    boolean r = checkRow(board, i, j, n);
                    boolean c = checkColumn(board, i, j, n);
                    boolean b = checkBlock(board, i, j, n);
                    if (!r || !c || !b) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    private boolean checkRow(char[][] board, int row, int col, int n) {
        for (int i = 0; i < 9; i++) {
            if (i == col) {
                continue;
            }
            if (((int)(board[row][i]) - 48) == n) {
                return false;
            }
        }
        return true;
    }
    private boolean checkColumn(char[][] board, int row, int col, int n) {
        for (int i = 0; i < 9; i++) {
            if (i == row) {
                continue;
            }
            if (((int)(board[i][col]) - 48) == n) {
                return false;
            }
        }
        return true;
    }
    private boolean checkBlock(char[][] board, int row, int col, int n) {
        int br = row / 3;
        int bc = col / 3;
        for (int i = (br * 3); i < ((br + 1) * 3); i++) {
            for (int j = (bc * 3); j < ((bc + 1) * 3); j++) {
                if (i == row && j == col) {
                    continue;
                } else {
                    if (((int)(board[i][j]) - 48) == n) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}