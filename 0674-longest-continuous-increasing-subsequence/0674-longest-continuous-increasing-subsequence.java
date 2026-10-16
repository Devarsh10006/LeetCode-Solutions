class Solution {
    public int findLengthOfLCIS(int[] nums) {
        
        int c = 1, ans = 1;
        for (int i = 1; i < nums.length; i++)
        {
            ans = Math.max(ans, 
                c = nums[i] > nums[i - 1] ? 
                c + 1 : 1
            );
        }
        
        return ans;
    }
}