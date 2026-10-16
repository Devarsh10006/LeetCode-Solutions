class Solution {
    public int divisorSubstrings(int num, int k) {
        
        String str = String.valueOf(num);
        int n = str.length();
        int ans = 0;

        for(int i = 0; i <= n - k; i++)
        {
            int number = Integer.parseInt(str.substring(i, i + k));

            if (number != 0 && 
                num % number == 0
            ) {  ans++; }
        }

        return ans;
    }
}