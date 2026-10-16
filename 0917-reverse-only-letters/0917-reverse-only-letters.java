class Solution {
    public String reverseOnlyLetters(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        int j = sb.length() - 1;

        for(int i = 0; i < sb.length(); i++)
        {
            if(!Character.isLetter(sb.charAt(i))) continue;

            while(j > i && !Character.isLetter(sb.charAt(j)))
                j--;
            
            if (i >= j) break;

            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);

            j--;
        }

        return sb.toString();
    }
}