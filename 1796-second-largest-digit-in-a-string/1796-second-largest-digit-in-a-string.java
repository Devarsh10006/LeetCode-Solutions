class Solution {
    public int secondHighest(String s) {
        
        int first = -1, ans = -1;

        for(char ch : s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                int num = ch - '0';

                if(num > first)
                {
                    ans = first;
                    first = num;
                }
                else if(num > ans && num < first) { ans = num; }
            }
        }

        return ans;
    }
}