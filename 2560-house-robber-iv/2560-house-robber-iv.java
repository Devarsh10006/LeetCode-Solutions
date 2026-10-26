class Solution {
    public int minCapability(int[] nums, int k) {
        
        int l = 1, r = 0;
        for (int n : nums) r = Math.max(r, n);

        while (l < r) 
        {
            int mid = l + (r - l) / 2,
                count = 0
            ;

            for (int i = 0; i < nums.length; i++) 
            {
                if (nums[i] <= mid) 
                {
                    count++;
                    i++;
                }
            }

            if (count >= k) r = mid;
            else l = mid + 1;
        }

        return l;
    }
}