class Solution {
    public int pivotIndex(int[] nums) {
        
        int left = 0;
        int right = 0;
        int sum = 0;

        for(int num : nums)
            sum += num;

        for(int i = 0; i < nums.length; i++)
        {
            if(left == sum - left - nums[i])
                return i;
            else
                left += nums[i];
        }

        return -1;
    }
}