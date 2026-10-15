import java.util.*;
import java.lang.*;
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totSum = 0;

        int currMax = nums[0], maxSum = nums[0];
        int currMin = nums[0], minSum = nums[0];

        for(int i = 1; i < nums.length; i++)
        {
            totSum += nums[i];

            currMax = Math.max(nums[i], currMax + nums[i]);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(nums[i], currMin + nums[i]);
            minSum = Math.min(minSum, currMin);
        }
        totSum += nums[0];

        if(maxSum < 0) return maxSum;

        return Math.max(maxSum, totSum - minSum);
    }
}