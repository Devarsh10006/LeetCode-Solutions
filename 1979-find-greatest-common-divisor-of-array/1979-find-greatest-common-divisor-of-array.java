class Solution {
    public int findGCD(int[] nums) {
        
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int num : nums)
        {
            if(num < min)
                min = num;
            if(num > max)
                max = num;
        }

        return gcd(min, max);
    }

    private int gcd(int min, int max)
    {
        return max == 0 ? min : gcd(max, min % max);
    }
}