class Solution {
    public int binaryGap(int n) {
        
        int count = 0;
        String binary = Integer.toBinaryString(n);

        int max = 0;
        boolean foundOne = false;
        for(int i = 0; i < binary.length(); i++)
        {
            if(binary.charAt(i) == '1')
            {
                if(foundOne)
                    max = Math.max(count + 1, max);
                foundOne = true;
                count = 0; 
            }
            else{
                if(foundOne)
                    count++;
            }
        }

        return max;
    }
}