class Solution {
    public int getMaximumGenerated(int n) {
        
        if(n < 2) return n;

        int[] arr = new int[n+1];
        arr[1] = 1;
        for (int i = 2, max = 1; i <= n; i++) 
        {
            max = Math.max(
                max,
                arr[i] = (i & 1) == 0
                    ? arr[i / 2]
                    : arr[i / 2] + arr[i / 2 + 1]
            );
            if (i == n) return max;
        }

        return 1;
    }
}