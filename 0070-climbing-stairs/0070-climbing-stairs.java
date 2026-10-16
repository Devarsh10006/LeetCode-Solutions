class Solution {
    public int climbStairs(int n) {
        
        int a = 1;
        for(int b = 1; n-- > 0; b += a, a = b - a);
        
        return a;
    }
}