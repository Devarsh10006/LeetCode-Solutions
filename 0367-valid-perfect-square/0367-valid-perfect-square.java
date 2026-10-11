class Solution {
    public boolean isPerfectSquare(int num) {
        
        for(int i = 0; (long) i * i <= num; i++)
        {
            if(i * i == num) return true;
        }

        return false;
    }
}