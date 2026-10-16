class Solution {
    public boolean check(int[] nums) {
        
        for(int i = 0, c = 0, n = nums.length; 
            i < n;
            i++
        ){
            if (nums[i] > nums[(i + 1) % n] &&
                ++c > 1
            ) return false;
        }

        return true;
    }
}