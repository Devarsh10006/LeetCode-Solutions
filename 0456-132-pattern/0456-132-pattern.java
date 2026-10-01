class Solution {
    public boolean find132pattern(int[] nums) {
        
        int n = nums.length;
        if(n < 3) return false;
        
        int last = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();

        for(int i = n - 1; i >= 0; i--)
        {
            if(nums[i] < last) return true;

            while(!stack.isEmpty() && nums[i] > stack.peek())
                last = stack.pop();

            stack.push(nums[i]);
        }

        return false;
    }
}