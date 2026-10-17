class Solution {
    public int maxIceCream(int[] costs, int coins) {
        
        int[] freq = new int[100001];
        for(int cost : costs) freq[cost]++;

        int ans = 0;
        for(int i = 0; i < freq.length && coins >= i; i++)
        {
            while(freq[i]-- > 0 && coins >= i)
            {
                coins -= i;
                ans++;
            }
        }

        return ans;
    }
}