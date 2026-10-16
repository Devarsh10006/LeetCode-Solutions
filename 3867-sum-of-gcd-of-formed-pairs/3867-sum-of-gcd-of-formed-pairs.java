class Solution {
    public long gcdSum(int[] nums) {
        
        int n = nums.length;
        int[] prefixGcd = new int[n];

        int maxPrif = 0;
        for (int i = 0; i < n; i++) 
        {
            maxPrif = Math.max(maxPrif, nums[i]);
            prefixGcd[i] = gcd(nums[i], maxPrif);
        }

        Arrays.sort(prefixGcd);

        long ans = 0;
        for(int l = 0, r = n - 1;l < r; l++, r--)
            { ans += gcd(prefixGcd[l], prefixGcd[r]); }

        return ans;
    }

    private int gcd(int a, int b) {
        
        return (b == 0) ? a : gcd(b, a % b);
    }
}