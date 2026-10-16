class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        
        return value(firstWord) + value(secondWord) == value(targetWord);
    }

    private int value(String word) {  

        int num = 0;
        for(char ch : word.toCharArray())
            num = num * 10 + (ch - 'a');
        return num;
    }
}