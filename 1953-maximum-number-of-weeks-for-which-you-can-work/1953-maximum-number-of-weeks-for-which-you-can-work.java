class Solution {
    public long numberOfWeeks(int[] milestones) {
        
        long sum = 0;
        long max = 0;

        for (int num : milestones) 
        {
            sum += num;
            max = Math.max(max, num);
        }
        long remaining = sum - max;

        if (max > remaining + 1) 
        {
            return remaining * 2 + 1;
        }
        
        return sum;
    }
}