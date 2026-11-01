class Solution {
    public int minMergedInteger(int[] nums) {
        
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length - 1; i += 2)
        {
            int num1 = nums[i], num2 = nums[i + 1];
            int merged = num1 * (int)Math.pow(10, place(num2)) + num2;

            ans = Math.min(ans, merged);
        }

        return ans;
    }

    private int place(int num) {

        int ans = 0;
        while(num != 0)
        {
            num /= 10;
            ans++;
        }
        return ans;
    }
}