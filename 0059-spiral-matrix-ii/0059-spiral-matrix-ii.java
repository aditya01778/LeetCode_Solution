class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        int startRow = 0, startCol = 0;
        int endRow = n - 1, endCol = n - 1;
        int num = 1;
        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                matrix[startRow][j] = num++;
            }
            // Right
            for (int i = startRow + 1; i <= endRow; i++) {
                matrix[i][endCol] = num++;
            }
            // bottom
            if (startRow < endRow) {
                for (int j = endCol - 1; j >= startCol; j--) {
                    matrix[endRow][j] = num++;
                }
            }
            // left
            if (startCol < endCol) {
                for (int i = endRow - 1; i >= startRow + 1; i--) {
                    matrix[i][startCol] = num++;
                }
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return matrix;
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 4;
        int[][] result = sol.generateMatrix(n);

        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
}