class Solution {
    public String reverseWords(String s) {

        String[] words = s.split(" ");

        int first = countVowels(words[0]);
        for(int i = 1; i < words.length; i++)
        {
            if(countVowels(words[i]) == first)
                words[i] = reverse(words[i]);
        }

        return String.join(" ", words);
    }

    private int countVowels(String word) {

        int count = 0;
        for(char ch : word.toCharArray())
        {
            if(ch == 'a'
               || ch == 'e'
               || ch == 'i'
               || ch == 'o'
               || ch == 'u'
            ) { count++; }
        }

        return count;
    }

    private String reverse(String word) {

        return new StringBuilder(word).reverse().toString();
    }
}