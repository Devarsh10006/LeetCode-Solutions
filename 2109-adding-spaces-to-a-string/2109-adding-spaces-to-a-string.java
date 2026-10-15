class Solution {
    public String addSpaces(String s, int[] spaces) {
        
        //Java ma string immutable hoy...mtlb har space add kariye tyare navi string banavi pade
        //J obviously barobar nathi
        //To navo obj banaya vagar aapde string change kari sakiye
        StringBuilder result = new StringBuilder();

        int strLen = s.length();
        int ptr = 0;
        int sp = spaces.length;

        for(int i = 0; i < strLen; i++)
        {
            if(ptr < sp && i == spaces[ptr])
            {
                result.append(" ");
                ptr++;
            }
            result.append(s.charAt(i));
        }

        return result.toString();
    }
}