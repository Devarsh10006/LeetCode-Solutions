class Solution {
    public int addDigits(int num) {
        
        while(num > 9)
        {
            num = digitSum(num);
        }

        return num;
    }

    private int digitSum(int n) {

        int addition = 0;
        while(n != 0)
        {
            addition += n % 10;
            n /= 10;
        }
        return addition;
    }
}