class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        // int n = nums.length;

        // for (int i = 0; i < n; i++) 
        // {
        //     int limit = Math.min(n - 1, i + k);

        //     for (int j = i + 1; j <= limit; j++) 
        //     {
        //         if (nums[i] == nums[j])
        //             return true;
        //     }
        // }

        // return false;


        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) 
        {
            if (i > k)
                set.remove(nums[i - k - 1]);

            if (!set.add(nums[i]))
                return true;
        }

        return false;
    }
}