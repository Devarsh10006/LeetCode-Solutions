class Solution {
    public int longestContinuousSubstring(String s) {
        
        int cnt = 1, ans = 1;

        for(int i = 0; i < s.length() - 1; i++)
        {
            if(s.charAt(i) == s.charAt(i + 1) - 1) { cnt++; }
            else { cnt = 1; }

            ans = Math.max(ans, cnt);
        }

        return ans;
    }
}