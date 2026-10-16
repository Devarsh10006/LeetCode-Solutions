class Solution {
    public int numSteps(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        int steps = 0;
        
        while(!sb.toString().equals("1"))
        {
            int lastIndex = sb.length() - 1;
            
            if (sb.charAt(lastIndex) == '0')
                sb.deleteCharAt(lastIndex);
            else{
                int i = lastIndex;

                while(i >= 0 && sb.charAt(i) == '1')
                {
                    sb.setCharAt(i, '0');
                    i--;
                }

                if(i >= 0)
                    sb.setCharAt(i, '1');
                else
                    sb.insert(0, '1');
            }
            steps++;
        }

        return steps;
    }
}