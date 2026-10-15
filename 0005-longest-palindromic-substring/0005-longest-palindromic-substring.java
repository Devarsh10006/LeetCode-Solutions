class Solution {
    public String longestPalindrome(String s) {
        
        int len = s.length();
        if (s == null || s.length() < 1) return "";
        
        int start = 0, MAX = 1;
        
        for (int i = 0; i < len; i++) 
        {
            int l = i, r = i;
            while (l >= 0 && r < len && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > MAX) {
                    start = l;
                    MAX = r - l + 1;
                }
                l--;
                r++;
            }
            
            l = i;
            r = i + 1;
            while (l >= 0 && r < len && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > MAX) {
                    start = l;
                    MAX = r - l + 1;
                }
                l--;
                r++;
            }
        }

        return s.substring(start, start + MAX);
    }
}