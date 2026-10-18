class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        
        int n = days.length,
            dp[] = new int[n + 1]
        ;

        for(int i = n - 1; i >= 0; i--)
        {
            int j = i;

            // For 1-day pass
            while(j < n && days[j] < days[i] + 1) { j++; }
            int oneDay = costs[0] + dp[j];

            // For 7-days pass
            while(j < n && days[j] < days[i] + 7) { j++; }
            int sevenDays = costs[1] + dp[j];

            // For 30-days pass
            j = i;
            while (j < n && days[j] < days[i] + 30) { j++; }
            int thirtyDays = costs[2] + dp[j];

            dp[i] = Math.min(
                oneDay,
                Math.min(
                    sevenDays,
                    thirtyDays
                )
            );
        }

        return dp[0];
    }
}