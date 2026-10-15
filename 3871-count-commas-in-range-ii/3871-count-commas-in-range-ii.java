class Solution {
    public long countCommas(long n) {
        
        if(n < 1000) return 0;
        long ans = 0;
        long power  = 1000;

        while(power <= n)
        {
            ans += n - power + 1;
            if(power > n / 1000) break;
            power *= 1000;
        }

        return ans;
    }
}