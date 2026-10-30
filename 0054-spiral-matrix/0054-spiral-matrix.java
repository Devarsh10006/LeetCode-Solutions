class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> ans = new ArrayList<>();
        boolean[][] visited = new boolean[m][n];

        int i = 0, j = 0;
        int dir = 0;

        for (int steps = m * n; steps != 0; steps--)
        {
            ans.add(matrix[i][j]);
            visited[i][j] = true;

            if (dir == 0) 
            {
                if (j + 1 < n && !visited[i][j + 1]) {
                    j++;
                } else {
                    dir = 1;
                    i++;
                }
            }
            else if (dir == 1) 
            {
                if (i + 1 < m && !visited[i + 1][j]) {
                    i++;
                } else {
                    dir = 2;
                    j--;
                }
            }
            else if (dir == 2) 
            {
                if (j - 1 >= 0 && !visited[i][j - 1]) {
                    j--;
                } else {
                    dir = 3;
                    i--;
                }
            }
            else 
            {
                if (i - 1 >= 0 && !visited[i - 1][j]) {
                    i--;
                } else {
                    dir = 0;
                    j++;
                }
            }
        }

        return ans;
    }
}