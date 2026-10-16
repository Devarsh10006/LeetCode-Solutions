class Solution {
    public int largestInteger(int n, int s) {

        for(int i = (int)Math.pow(10, n) - 1; i >= 0; i--)
            if(digitSum(i) == s) { return i; }

        return -1;
    }

    private int digitSum(int i) {

        int sum = 0;
        for(; i != 0; sum += i % 10, i /= 10);

        return sum;
    }
}