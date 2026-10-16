class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int len = nums.length;
        int[] ans = new int[2 * len];

        int n = 0;
        int a = 0;
        while(a < 2*len)
        {
            if(n == len)
                n = 0;
            ans[a++] = nums[n++];
        }

        return ans;
    }
}