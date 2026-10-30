class Solution {
    public int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;

        int num = 1;

        while (num <= n * n) 
        {
            // Right
            for (int j = left; j <= right; j++) {
                matrix[top][j] = num++;
            }
            top++;

            // Down
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // Left
            for (int j = right; j >= left && top <= bottom; j--) {
                matrix[bottom][j] = num++;
            }
            bottom--;

            // Up
            for (int i = bottom; i >= top && left <= right; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }

        return matrix;
    }
}