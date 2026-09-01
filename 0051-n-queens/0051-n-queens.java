import java.util.*;

class Solution {
    private List<List<String>> results = new ArrayList<>();
    private Set<Integer> cols = new HashSet<>();
    private Set<Integer> diag1 = new HashSet<>(); // row - col
    private Set<Integer> diag2 = new HashSet<>(); // row + col
    private char[][] board;
    private int n;

    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        board = new char[n][n];
        for (char[] row : board) Arrays.fill(row, '.');

        backtrack(0);
        return results;
    }

    private void backtrack(int row) {
        if (row == n) {
            results.add(buildBoard());
            return;
        }

        for (int col = 0; col < n; col++) {
            if (cols.contains(col) || diag1.contains(row - col) || diag2.contains(row + col)) {
                continue;
            }

            // place
            cols.add(col);
            diag1.add(row - col);
            diag2.add(row + col);
            board[row][col] = 'Q';

            backtrack(row + 1);

            // undo
            cols.remove(col);
            diag1.remove(row - col);
            diag2.remove(row + col);
            board[row][col] = '.';
        }
    }

    private List<String> buildBoard() {
        List<String> current = new ArrayList<>();
        for (char[] row : board) {
            current.add(new String(row));
        }
        return current;
    }
}