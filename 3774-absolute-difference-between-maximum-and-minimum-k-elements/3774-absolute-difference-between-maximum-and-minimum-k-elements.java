class Solution {
    public int absDifference(int[] nums, int k) {

        int n = nums.length;
        Arrays.sort(nums);

        int low = 0, high = n - 1;
        int lowSum = 0, highSum = 0;
        while(low != k)
        {
            lowSum += nums[low++];
            highSum += nums[high--];
        }

        return Math.abs(lowSum - highSum);
    }
}