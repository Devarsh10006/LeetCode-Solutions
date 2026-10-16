class Solution {
    public String stoneGameIII(int[] stoneValue) {
        
        int n = stoneValue.length;
        
        int dp1 = 0, dp2 = 0, dp3 = 0;
        int curr = 0;
        for(int i = n - 1; i >= 0; i--)
        {
            int best = Integer.MIN_VALUE;
            int sum = 0;

            for(int j = 0; j < 3 && j + i < n; j++)
            {
                sum += stoneValue[i + j];

                best = (j == 0) ? Math.max(best, sum - dp1) :
                       (j == 1) ? Math.max(best, sum - dp2) :
                    Math.max(best, sum - dp3)
                ;
            }

            curr = best;

            dp3 = dp2;
            dp2 = dp1;
            dp1 = curr;
        }

        return (dp1 > 0) ? "Alice" :
            (dp1 < 0) ? "Bob" : 
            "Tie"
        ;
    }
}