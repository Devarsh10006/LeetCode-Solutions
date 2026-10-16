class Solution {
    public int countBinarySubstrings(String s) {
        
        int n = s.length();

        // int count = 0;
        // for(int i = 0; i < n; i++)
        // {
        //     int zeroCount = 0, oneCount = 0, change = 0;
        //     for(int j = i; j < n; j++)
        //     {
        //         if (j > i && s.charAt(j) != s.charAt(j - 1)) change++;

        //         if (s.charAt(j) == '0') zeroCount++;
        //         else oneCount++;

        //         if (change > 1) break;

        //         if (zeroCount == oneCount && change == 1) count++;
        //     }
        // }
        

        int prevGroup = 0, currGroup = 1, count = 0;

        for(int i = 1; i < n; i++)
        {
            if (s.charAt(i) == s.charAt(i - 1)) currGroup++;

            else{
                count += Math.min(prevGroup, currGroup);
                prevGroup = currGroup;
                currGroup = 1;
            }
        }
        count += Math.min(prevGroup, currGroup);

        return count;
    }
}