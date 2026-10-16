class Solution {
    public int kthFactor(int n, int k) {
        
        int count = 0, ans = -1;
        for(int i = 1; i <= n && count != k; i++)
        {
            if(n % i == 0)
            {
                ans = i;
                count++;
            }
        }

        return count == k ? ans : -1;
    }
}