class Solution {

    public void putZero(int[][] matrix, int r, int c) {

        int row = matrix.length;
        int col = matrix[0].length;

        for (int j = 0; j < col; j++) {
            matrix[r][j] = 0;
        }

        for (int i = 0; i < row; i++) {
            matrix[i][c] = 0;
        }
    }

    public void setZeroes(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        boolean[][] visited = new boolean[row][col];

        // Store original zero positions
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (matrix[i][j] == 0) {
                    visited[i][j] = true;
                }
            }
        }

        // Make corresponding rows and columns zero
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (visited[i][j]) {
                    putZero(matrix, i, j);
                }
            }
        }
    }
}