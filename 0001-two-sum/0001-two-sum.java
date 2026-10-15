class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] selNums = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    selNums[0] = i;
                    selNums[1] = j;

                    return selNums;
                }
            }
        }
        return selNums;
    }
}