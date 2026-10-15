class Solution {
    public int sumFourDivisors(int[] nums) {
        
        int len = nums.length;

        int SUM = 0;


        for(int i = 0; i < len; i++)
        {
            int n = nums[i];

            int dev = 0; // A divisor pair gane
            int tempsum = 0; // current sum

            int d1 = 0, d2 = 0;

            for(int j = 2; j * j <= n; j++)
            {
                if(n % j == 0)
                {
                    dev++;

                    d1 = j;
                    d2 = n / j;

                    tempsum = 1 + d1 + d2 + n;

                    if(dev > 1) break;
                }
            }

            if (dev == 1 && d1 != d2) // 4, 9, 16 jeva sqres mate ignore  karvanu
                SUM += tempsum;
        }

        return SUM;
    }
}