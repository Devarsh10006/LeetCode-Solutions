class Solution {
    public int centeredSubarrays(int[] nums) {
        
        int n = nums.length;
        int ans = n;

        for(int i = 0; i < n; i++)
        {
            int sum = nums[i];
            HashSet<Integer> set = new HashSet<>();
            set.add(nums[i]);

            for (int j = i + 1; j < n; j++) 
            {
                sum += nums[j];
                set.add(nums[j]);

                if (set.contains(sum)) ans++;
            }
        }

        return ans;
    }
}