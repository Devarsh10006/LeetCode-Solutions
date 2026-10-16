class Solution {
    public int bitwiseComplement(int n) {
        
        String binaryString = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(binaryString);

        for(int i = 0; i < sb.length(); i++)
        {
            if(sb.charAt(i) == '0')
                sb.setCharAt(i, '1');
            else
                sb.setCharAt(i, '0');
        }

        return Integer.parseInt(sb.toString(), 2);
    }
}