class Solution {
    public boolean checkRecord(String s) {
        
        int countA = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'A') countA++;
            if(i + 2 < s.length() &&
               s.charAt(i) == 'L' &&
               s.charAt(i + 1) == 'L' &&
               s.charAt(i + 2) == 'L') return false;
        }

        return countA > 1 ? false : true;
    }
}