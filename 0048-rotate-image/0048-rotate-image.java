class Solution {
    public void rotate(int[][] matrix) {
        
        int n = matrix.length;
        int[][] ans = new int[n][n];

        for(int i = 0, row = 0, col = n - 1; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(row == n) row = 0;
                ans[row++][col] = matrix[i][j];
            }
            col--;
        }

        for(int i = 0; i < n; i++) 
        { 
            for(int j = 0; j < n; j++) { matrix[i][j] = ans[i][j]; } 
        }
    }
}