class Solution {
    public int totalWaviness(int num1, int num2) {
        
        int ans = 0;
        for(int n = num1; n <= num2; n++)
        {
            String s = String.valueOf(n);

            if(s.length() < 3) continue;

            for(int i = 1; i < s.length() - 1; i++)
            {
                int left  = s.charAt(i - 1) - '0';
                int curr  = s.charAt(i) - '0';
                int right = s.charAt(i + 1) - '0';

                if ((curr > left && curr > right) ||
                    (curr < left && curr < right)
                ) { ans++; }
            }
        }

        return ans;
    }
}