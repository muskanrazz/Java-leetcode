class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans [][]=new int[m][n];
        ans[0][0]= grid[0][0];
        // first filled 0th row
        for(int i=1; i<n; i++){
            ans[0] [i]= ans [0] [i-1] + grid[0] [i];
        }
         for(int j=1; j<m; j++){
            ans[j] [0]= ans [j-1] [0] + grid[j] [0];
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                int r = ans[i-1] [j] + grid [i] [j];
                int d = ans[i] [j-1] + grid [i] [j];
                ans[i] [j] = Math.min(r,d);
            }
        }
        return ans[m-1] [n-1];
        
    }
}