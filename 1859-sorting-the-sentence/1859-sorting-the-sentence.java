class Solution {
    public String sortSentence(String s) {
        
        String[] words = new String[10];

        int totalWords = 0;
        StringBuilder word = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) 
            {
                totalWords++;

                int index = ch - '0'; 
                words[index] = word.toString(); 
                word.setLength(0);
                i++; 
            }
            else word.append(ch);
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 1; i <= totalWords; i++) 
        {
            ans.append(words[i]);
            if (i < totalWords) { ans.append(" "); }
        }

        return ans.toString();
    }
}