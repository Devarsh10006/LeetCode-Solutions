class Solution {
    public int partitionDisjoint(int[] nums) {
        
        int leftmax = nums[0],
            max = nums[0],
            idx = 0
        ;

        for(int i = 0; i < nums.length; i++)
        {
            max = Math.max(max, nums[i]);

            if(nums[i] < leftmax)
            {
                leftmax = max;
                idx = i;
            }
        }

        return idx + 1;
    }
}