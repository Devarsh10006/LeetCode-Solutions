class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] ans = {-1, -1};
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if (nums[i] == target)
                ans[0] = (ans[0] == -1 ? i : ans[0]);

            if (nums[n - 1 - i] == target)
                ans[1] = (ans[1] == -1 ? n - 1 - i : ans[1]);
        }

        return ans;
    }
}