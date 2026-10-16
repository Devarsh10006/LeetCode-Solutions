class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String> ans = new ArrayList<>();

        if(digits == null ||
           digits.length() == 0
        ) { return ans; }

        ans.add("");
        for(char digit : digits.toCharArray())
        {
            String letters = getLetters(digit);

            List<String> temp = new ArrayList<>();

            for(String str : ans)
            {
                for(char ch : letters.toCharArray()) 
                { temp.add(str + ch); }

            } ans = temp;
        }

        return ans;
    }

    private String getLetters(char digit) {

        switch (digit) 
        {
            case '2': return "abc";
            case '3': return "def";
            case '4': return "ghi";
            case '5': return "jkl";
            case '6': return "mno";
            case '7': return "pqrs";
            case '8': return "tuv";
            case '9': return "wxyz";
            default : return "";
        }
    }
}