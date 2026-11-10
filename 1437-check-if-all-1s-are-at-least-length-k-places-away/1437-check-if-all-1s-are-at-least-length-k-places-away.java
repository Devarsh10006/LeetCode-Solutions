class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        
        for(int i = 0, dist = k; i < nums.length; i++)
        {
            if(nums[i] == 0) dist++;
            if(nums[i] == 1) 
            {
                if(dist < k) return false;
                dist = 0;
            }
        }
        return true;
    }
}