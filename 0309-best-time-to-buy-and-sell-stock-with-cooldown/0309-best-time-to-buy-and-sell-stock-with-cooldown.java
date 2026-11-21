class Solution {
    public int maxProfit(int[] prices) {
        
        int n = prices.length;

        if(n <= 1) return 0;

        int buy = -prices[0];
        int ans = 0; // Denotes sell
        int prevSell = 0;

        for(int i = 1; i < n; i++)
        {
            int temp = ans;

            ans = Math.max(
                ans, 
                buy + prices[i]
            );

            buy = Math.max(
                buy, 
                prevSell - prices[i]
            );

            prevSell = temp;
        }

        return ans;
    }
}