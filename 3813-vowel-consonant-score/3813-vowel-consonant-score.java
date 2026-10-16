class Solution {
    public int vowelConsonantScore(String s) {
        
        int v = 0, c = 0;
        for(char ch : s.toCharArray())
        {
            if(ch >= 'a' &&
               ch <= 'z'
            ) if ("aeiou".indexOf(ch) >= 0) v++;
              else c++;
        }

        return c == 0 ? 0 : v / c;
    }
}