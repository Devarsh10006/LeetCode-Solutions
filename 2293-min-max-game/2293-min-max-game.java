class Solution {
    public int minMaxGame(int[] nums) {
        
        while(nums.length > 1)
        {
            int n = nums.length;
            int[] temp = new int[n / 2];

            for(int i = 0; i < n / 2; i++)
            {
                temp[i] = i % 2 == 0 ?
                    Math.min(
                        nums[2 * i],
                        nums[2 * i + 1]
                    ) : 
                    Math.max(
                        nums[2 * i],
                        nums[2 * i + 1]
                    )
                ;
            }

            nums = temp;
        }

        return nums[0];
    }
}