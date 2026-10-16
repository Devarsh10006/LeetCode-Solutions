import java.util.Arrays;

class Solution {
    public int minRemoval(int[] nums, int k) {

        Arrays.sort(nums);
        int n = nums.length;
        int maxKeep = 1;

        for (int i = 0, j = 0; i < n; i++) 
        {
            j = Math.max(j, i);
            while (j + 1 < n &&
                (long)nums[j + 1] <= (long)nums[i] * k
            ) j++;

            maxKeep = Math.max(maxKeep, j - i + 1);
        }

        return n - maxKeep;
    }
}