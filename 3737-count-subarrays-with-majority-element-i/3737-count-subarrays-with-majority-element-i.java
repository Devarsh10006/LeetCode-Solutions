class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        
        int n = nums.length, ans = 0;

        for(int i = 0; i < n; i++)
        {
            for(int j = i, bal = 0; j < n; j++)
            {
                bal += nums[j] == target ? 1 : -1;
                ans += bal > 0 ? 1 : 0;
            }
        }

        return ans;
    }
}