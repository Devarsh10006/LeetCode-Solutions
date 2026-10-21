class Solution {
    public int minOperations(String s) {
        
        int a = 0,
            b = 0
        ;

        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            
            if(ch != (i % 2 == 0 ? '0' : '1')) a++;
            else b++;
        }

        return Math.min(a, b);
    }
}