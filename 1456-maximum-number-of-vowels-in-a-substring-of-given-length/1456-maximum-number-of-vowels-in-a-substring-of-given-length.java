class Solution {
    public int maxVowels(String s, int k) {
        
        int cnt = 0, ans = 0;
        for(int i = 0; i < k; i++)
        {
            if (isVowel(s.charAt(i))) { cnt++; }
        }
        ans = cnt;

        for(int i = k; i < s.length(); i++)
        {
            if (isVowel(s.charAt(i - k))) { cnt--; }

            if (isVowel(s.charAt(i))) { cnt++; }

            ans = Math.max(ans, cnt);
        }

        return ans;
    }

    private boolean isVowel(char ch) {

        return 
            ch == 'a' || 
            ch == 'e' ||
            ch == 'i' ||
            ch == 'o' ||
            ch == 'u'
        ;
    }
}