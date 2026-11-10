class Solution {
    public int longestSubarray(int[] nums) {
        
        int prev = 0,
            curr = 0,
            ans = 0
        ;

        for(int num : nums)
        {
            if(num == 1) curr++;
            else {
                ans = Math.max(ans, prev + curr);
                prev = curr;
                curr = 0;
            }
            ans = Math.max(ans, prev + curr);
        }

        return Math.min(
            ans, 
            nums.length - 1
        );
    }
}