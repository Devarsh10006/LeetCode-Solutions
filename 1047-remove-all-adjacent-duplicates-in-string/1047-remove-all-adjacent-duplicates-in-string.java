class Solution {
    public String removeDuplicates(String s) {
        
        // Stack no use chhe,
        // Simple 1-1 stack ma naakhta jao
        // & jo dublicate aave to pop...
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray())
        {
            if(sb.length() > 0 &&
               sb.charAt(sb.length() - 1) == ch
            ) sb.deleteCharAt(sb.length() - 1);

            else sb.append(ch);
        }

        return sb.toString();
    }
}