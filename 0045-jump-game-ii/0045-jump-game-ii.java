class Solution {
    public int jump(int[] nums) {
        
        int n = nums.length;

        int ans =  0; // jumps
        int current = 0;
        int destination = 0;

        for(int i = 0; i < n - 1; i++)
        {
            destination = Math.max(destination, i + nums[i]);
            
            if(i == current)
            {
                ans++;
                current = destination;
            }
        }

        return ans;
    }
}