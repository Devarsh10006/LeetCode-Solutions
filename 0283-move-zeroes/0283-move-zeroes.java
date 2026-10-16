class Solution {
    public void moveZeroes(int[] nums) {
        
        int n = nums.length;
        
        int t = 0;
        for(int i = 0; i < n; i++)
        {
            if (nums[i] != 0) {
                int temp = nums[t];
                nums[t] = nums[i];
                nums[i] = temp;
                t++;
            }
        }
    }
}