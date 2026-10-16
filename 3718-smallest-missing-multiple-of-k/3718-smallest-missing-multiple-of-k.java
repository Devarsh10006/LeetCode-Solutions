class Solution {
    public int missingMultiple(int[] nums, int k) {
        
        Arrays.sort(nums);
        
        int multiple = k;
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] == multiple) { multiple += k; }
        }

        return multiple;
    }
}