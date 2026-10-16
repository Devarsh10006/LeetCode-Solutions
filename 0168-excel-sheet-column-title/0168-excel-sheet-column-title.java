class Solution {
    public String convertToTitle(int columnNumber) {
        
        StringBuilder ans = new StringBuilder();

        for(int i = columnNumber; i > 0; i /= 26)
        {
            i--;
            char ch = (char)('A' + (i % 26));
            ans.append(ch);
        }

        return ans.reverse().toString();
    }
}