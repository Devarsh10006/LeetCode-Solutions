class Solution {
    public int minimumChairs(String s) {
        
        int chairs = 0, ppl =  0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'E') { ppl++; }
            else {ppl--; }

            chairs = Math.max(chairs, ppl);
        }

        return chairs;
    }
}