class Solution {
int count = 0;


public void isSolve(char[][] grid, int row) {
    int n = grid.length;

    // Base case
    if (row == n) {
        count++;
        return;
    }

    for (int j = 0; j < n; j++) {
        // Check if the cell is empty
        if (grid[row][j] == '.') {
            // Check whether placing the queen is safe
            if (isSafe(grid, row, j)) {
                grid[row][j] = 'Q';

                isSolve(grid, row + 1);

                // Backtracking
                grid[row][j] = '.';
            }
        }
    }
}

public boolean isSafe(char[][] grid, int row, int col) {
    int n = grid.length;

    // Check row
    for (int j = 0; j < n; j++) {
        if (grid[row][j] == 'Q') return false;
    }

    // Check column
    for (int i = 0; i < n; i++) {
        if (grid[i][col] == 'Q') return false;
    }

    int i = row;
    int j = col;

    // Check NE
    while (i >= 0 && j < n) {
        if (grid[i][j] == 'Q') return false;
        i--;
        j++;
    }

    i = row;
    j = col;

    // Check NW
    while (i >= 0 && j >= 0) {
        if (grid[i][j] == 'Q') return false;
        i--;
        j--;
    }

    i = row;
    j = col;

    // Check SE
    while (i < n && j < n) {
        if (grid[i][j] == 'Q') return false;
        i++;
        j++;
    }

    i = row;
    j = col;

    // Check SW
    while (i < n && j >= 0) {
        if (grid[i][j] == 'Q') return false;
        i++;
        j--;
    }

    return true;
}

public int totalNQueens(int n) {
    char[][] grid = new char[n][n];

    // Initialize the grid with '.'
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            grid[i][j] = '.';
        }
    }

    count = 0;
    isSolve(grid, 0);

    return count;
}

}