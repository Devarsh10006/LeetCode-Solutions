class Solution {
    public long maximumScore(int[] nums) {

        int n = nums.length;
        int[] minSuffix = new int[n];

        minSuffix[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) 
        {
            minSuffix[i] = Math.min(nums[i], minSuffix[i + 1]);
        }

        long prefixSum = 0L;
        long maxScore = Long.MIN_VALUE;

         for (int i = 0; i < n - 1; i++) {
            prefixSum += (long) nums[i];
            long score = prefixSum - (long) minSuffix[i + 1];
            maxScore = Math.max(maxScore, score);
        }

        return maxScore;
    }
}