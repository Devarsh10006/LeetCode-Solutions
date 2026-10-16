class Solution {
    public int maximumGap(int[] nums) {
        
        if(nums.length < 2) return 0;
        radixSort(nums);

        int maxGap = 0;
        for (int i = 1; i < nums.length; i++)
            maxGap = Math.max(maxGap, nums[i] - nums[i - 1]);

        return maxGap;
    }

    private void radixSort(int[] nums)
    {
        int max = nums[0];
        for (int num : nums)
            if (num > max) { max = num; }

        int n = nums.length;
        int[] output = new int[n];

        for (int exp = 1; max / exp > 0; exp *= 10) 
        {
            int[] count = new int[10];

            // Count frequency of each digit
            for (int num : nums) 
            {
                int digit = (num / exp) % 10;
                count[digit]++;
            }

            // Prefix sum
            for (int i = 1; i < 10; i++) { count[i] += count[i - 1]; }

            // Build output array (stable sort btw)
            for (int i = n - 1; i >= 0; i--) 
            {
                // Aa har 1-1 digit according sort kare
                // Etle stable bane
                int digit = (nums[i] / exp) % 10;

                // AA digit ni current last position...
                count[digit] = count[digit] - 1;

                // & have e position par element muko
                int position = count[digit];

                output[position] = nums[i];
                // output[--count[digit]] = nums[i];
            }

            // Copy back in our og array nums
            for (int i = 0; i < n; i++) { nums[i] = output[i]; }
        }
    }
}