class Solution {
    public boolean canJump(int[] nums) {
        
        int destination = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(i > destination) return false;

            destination = Math.max(destination, i + nums[i]);

            if(destination >= nums.length - 1) return true;
        }

        return true;
    }
}