class Solution {
    public int numOfStrings(String[] patterns, String word) {
        
        int count = 0;

        for (String p : patterns)
            if (isSubstring(word, p)) count++;

        return count;
    }

    private boolean isSubstring(String word, String pattern){

        int n = word.length();
        int m = pattern.length();

        for(int i = 0; i <= n - m; i++)
        {
            if (word.charAt(i) != pattern.charAt(0))
                continue;

            int j = 1;
            while(j < m &&
                word.charAt(i + j) == pattern.charAt(j)
            ) j++;

            if (j == m) return true;
        }

        return false;
    }
}