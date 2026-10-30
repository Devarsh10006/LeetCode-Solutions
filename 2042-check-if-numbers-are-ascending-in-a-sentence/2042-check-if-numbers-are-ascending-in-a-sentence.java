class Solution {
    public boolean areNumbersAscending(String s) {
        
        int prev = -1;
        String[] tokens = s.split(" ");

        for (String token : tokens) 
        {
            if (Character.isDigit(token.charAt(0)))
            {
                int current = Integer.parseInt(token);
                if (current <= prev) return false;
                prev = current;
            }
        }
        
        return true;
    }
}