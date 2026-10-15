class Solution {
    public int minElement(int[] nums) {

        // for(int num : nums)
        // {
        //     int sum = 0;
        //     int temp = nums[num];

        //     while(temp != 0)
        //     {
        //         int rem = temp % 10;
        //         sum += rem;
        //         temp /= 10;
        //     }

        //     nums[num] = sum;
        // }

        // int min = nums[0];
        // for(int num : nums)
        // {
        //     if(nums[num] < min)
        //         min = nums[i];
        // }

        // return min;


        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            int sum = 0;
            num = Math.abs(num);

            while (num != 0) {
                sum += num % 10;
                num /= 10;
            }

            min = Math.min(min, sum);
        }

        return min;
    }
}