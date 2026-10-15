class Solution {
    public int superPow(int a, int[] b) {
        
        if(a == 1) return 1;

        a %= 1337;
        long ans = 1;
        for(int i = 0; i < b.length; i++)
        {
            // ans = ans^10
            long temp = 1;
            for (int j = 0; j < 10; j++) 
            {
                temp = (temp * ans) % 1337;
            }

            // a^digit
            long power = 1;
            for (int j = 0; j < b[i]; j++) 
            {
                power = (power * a) % 1337;
            }
            ans = (temp * power) % 1337;
        }

        return (int)ans;
    }
}