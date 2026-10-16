class Solution {
    public String reverseVowels(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        List<Character> vowels = new ArrayList<>();
        
        for (int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            if (isVowel(c)) { vowels.add(c); }
        }
        Collections.reverse(vowels);
        
        int vowelIndex = 0;
        for (int i = 0; i < sb.length(); i++) 
        {
            if (isVowel(sb.charAt(i)))
                sb.setCharAt(i, vowels.get(vowelIndex++));
        }
        
        return sb.toString();
    }
    
    private boolean isVowel(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ||
               c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
        ;
    }
}