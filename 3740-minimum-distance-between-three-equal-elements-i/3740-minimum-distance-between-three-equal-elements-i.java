class Solution {
    public int minimumDistance(int[] nums) {
        
        int len = nums.length;
        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < len; i++) 
        {
            for (int j = i + 1; j < len; j++) 
            {
                if (nums[i] == nums[j]) 
                {
                    for (int k = j + 1; k < len; k++) 
                    {
                        if (nums[k] == nums[i]) {
                            int dist = Math.abs(i - j) 
                                     + Math.abs(j - k) 
                                     + Math.abs(k - i);

                            minDist = Math.min(minDist, dist);
                        }
                    }
                }
            }
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}