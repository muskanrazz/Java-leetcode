class Solution {
     public void rotate(int[][] matrix) {
          
        int row= matrix.length;
        int col= matrix[0].length;
        int [][] res= new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               res[j][i] = matrix[i][j];

            }
        }

      //  int[][] ans = new int[row][col];
        for(int j = col -1;j>=0;j--){
            for(int i =0 ;i<row;i++){
                matrix[i][j] = res[i][col - 1 - j];
            }
        }
        
    }
}