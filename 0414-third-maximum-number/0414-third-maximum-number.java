class Solution {
    public int thirdMax(int[] nums) {

        // Arrays.sort(nums);

        // int distinctCount = 1;
        // int max = nums[nums.length - 1];

        // for (int i = nums.length - 2; i >= 0; i--) {

        //     if (nums[i] != nums[i + 1])
        //         distinctCount++;
        //     if (distinctCount == 3)
        //         return nums[i];
        // }

        // return max;

         Long first = null;
        Long second = null;
        Long third = null;

        for (int num : nums) {
            long n = num;

            if ((first != null && n == first) ||
                (second != null && n == second) ||
                (third != null && n == third)) {
                continue;
            }

            if (first == null || n > first) {
                third = second;
                second = first;
                first = n;
            } else if (second == null || n > second) {
                third = second;
                second = n;
            } else if (third == null || n > third) {
                third = n;
            }
        }

        return third == null ? first.intValue() : third.intValue();
    }
}