class Solution {
    public boolean sumGame(String num) {
        
        int n = num.length();
        int diff = 0;

        int qms1 = 0;
        for (int i = 0; i < n / 2; i++) 
        {
            char ch = num.charAt(i);

            if (ch == '?') qms1++;
            else diff += ch - '0';
        }

        int qms2 = 0;
        for (int i = n / 2; i < n; i++)
        {
            char ch = num.charAt(i);

            if (ch == '?') qms2++;
            else diff -= ch - '0';
        }

        if ((qms1 + qms2) % 2 == 1) return true;

        return diff != 9 * (qms2 - qms1) / 2;
    }
}