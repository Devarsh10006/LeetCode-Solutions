class Solution {
    public int countPrefixes(String[] words, String s) {
        
        int ans = 0;
        for(int i = 0; i < words.length; i++)
        {
            if (s.startsWith(words[i])) ans++;
        }
        return ans;
    }
}