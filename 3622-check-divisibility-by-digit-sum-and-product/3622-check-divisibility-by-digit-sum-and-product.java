class Solution {
    public boolean checkDivisibility(int n) {
        
        return n % prodAndSum(n) == 0;
    }

    private int prodAndSum(int n) {

        int sum = 0, mul = 1;
        while(n != 0)
        {
            int rem = n % 10;
            sum += rem;
            mul *= rem;
            n /= 10;
        }

        return sum + mul;
    }
}