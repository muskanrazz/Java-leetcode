class Solution {
    public void isSolve(char[][] grid, int row, List<List<String>> ans){
        int n = grid.length;

        //base case
        if(row == n){
            //printing grid
            List<String> curr = new ArrayList<>();
            for(int i = 0; i < n ; i++){
                String str = "";
                for(int j = 0 ; j < n ;j++){
                    str += grid[i][j];
                }
                curr.add(str);
            }
            ans.add(curr);
            return;
        }

        for(int j = 0 ; j < n ; j++){
            //if empty
            if(grid[row][j] == '.'){
                //check whether plascing the queen is possible or not
                if(isSafe(grid, row, j) == true){
                    grid[row][j] = 'Q';
                    isSolve(grid, row + 1, ans);
                    grid[row][j] = '.';
                }

            }
        }


    }

    public boolean isSafe(char[][] grid, int row, int col){
        int n = grid.length;

        //check row
        for(int j = 0 ; j < n ; j++){
            if(grid[row][j] == 'Q') return false;
        }

        //check col
        for(int i = 0 ; i < n ; i++){
            if(grid[i][col] == 'Q') return false;
        }

        int i = row;
        int j = col;
        //check NE
        while(i >= 0 && j < n){
            if(grid[i][j] == 'Q') return false;
                i--;
                j++;
        }
        i = row;
        j = col;
        //check NW
        while(i >= 0 && j >= 0){
            if(grid[i][j] == 'Q') return false;
                i--;
                j--;
        }
        i = row;
        j = col;
        //check SE
         while(i < n && j < n){
            if(grid[i][j] == 'Q') return false;
                i++;
                j++;
        }
        i = row;
        j = col;
        //check SW
         while(i < n && j >= 0){
            if(grid[i][j] == 'Q') return false;
                i++;
                j--;
        }
        return true;

    }



    public List<List<String>> solveNQueens(int n) {
        char[][] grid = new char[n][n];

        //Making grid and assigning it empty by placing '.'

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                grid[i][j] = '.';
            }
        }

        //Making ans list for return the silution

        List<List<String>> ans = new ArrayList<>();

        isSolve(grid, 0 , ans);
        // Passing grid row number and soluton ans list in the funciton;

        return ans;
    }
}