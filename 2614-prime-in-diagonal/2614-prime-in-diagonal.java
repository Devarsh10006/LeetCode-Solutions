class Solution {
    public int diagonalPrime(int[][] nums) {
        
        int ans = 0, n = nums.length;

        for (int i = 0; i < n; i++) 
        {
            int a = nums[i][i];
            int b = nums[i][n - i - 1];

            if (isPrime(a)) ans = Math.max(ans, a);
            if (isPrime(b)) ans = Math.max(ans, b);
        }

        return ans;
    }

    private boolean isPrime(int x) {

        if (x < 2) return false;

        for (int i = 2; i * i <= x; i++)  { if (x % i == 0) return false; }

        return true;
    }
}