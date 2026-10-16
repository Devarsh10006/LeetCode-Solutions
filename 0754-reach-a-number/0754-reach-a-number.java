class Solution {
    public int reachNumber(int target) {
        
        target = Math.abs(target);
        
        int ans = 0;
        for(int sum = 0; 
            sum < target || (sum - target) % 2 != 0;
            ans++, sum += ans
        );

        return ans;
    }
}