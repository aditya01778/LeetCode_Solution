class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rowUsed = new boolean[9][10];
        boolean[][] colUsed = new boolean[9][10];
        boolean[][] boxUsed = new boolean[9][10];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char val = board[r][c];
                if (val == '.') continue;

                int num = val - '0';
                int b = (r / 3) * 3 + c / 3;

                if (rowUsed[r][num] || colUsed[c][num] || boxUsed[b][num]) {
                    return false; // duplicate found
                }

                rowUsed[r][num] = true;
                colUsed[c][num] = true;
                boxUsed[b][num] = true;
            }
        }

        return true; // no conflicts found
    }
}