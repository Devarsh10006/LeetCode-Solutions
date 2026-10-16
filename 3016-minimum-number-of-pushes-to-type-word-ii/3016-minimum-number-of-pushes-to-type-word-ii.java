class Solution {
    public int minimumPushes(String word) {
        
        int[] freq = new int[26];
        for(char ch : word.toCharArray()) { freq[ch - 'a']++; }

        int ans = 0;
        int[] keyPad = new int[8];
        while(true)
        {
            int max = 0, idx = -1;
            
            for(int i = 0; i < 26; i++)
            {
                if (freq[i] > max) 
                {
                    max = freq[i];
                    idx = i;
                }
            } if(max == 0) break;
            
            int t = 0;
            for (int i = 1; i < 8; i++) 
            {
                if (keyPad[i] < keyPad[t]) { t = i; }
            }

            keyPad[t]++;
            ans += keyPad[t] * max;

            freq[idx] = 0;
        }
        
        return ans;
    }
}