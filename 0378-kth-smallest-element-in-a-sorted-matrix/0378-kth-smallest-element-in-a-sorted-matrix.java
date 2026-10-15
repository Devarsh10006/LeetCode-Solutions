class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int size = matrix[0].length;
        int m = 0;
        int [] arr = new int[size*size];

        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                arr[m++] = matrix[i][j];
            }
        }
        Arrays.sort(arr);

        return arr[k-1];
    }
}