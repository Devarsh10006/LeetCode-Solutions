class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        
        int ans = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++)
        {
            int or = 0;
            for(int j = i; j < nums.length; j++)
            {
                or |= nums[j];

                if(or >= k)
                {
                    ans = Math.min(ans, j - i + 1);
                    break;
                }
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}