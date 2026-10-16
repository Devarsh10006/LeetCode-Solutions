class Solution {
    public char findKthBit(int n, int k) {
        
        String Si = "0";

        for(int i = 2; i <= n; i++)
            Si = Si + "1" + reverse(invert(Si));

        return Si.charAt(k - 1); // 1 base index chhe etle...
    }

    private String reverse(String Si) {
        return new StringBuilder(Si).reverse().toString();
    }

    private String invert(String Si)
    {
        StringBuilder sb = new StringBuilder();

        for(char c : Si.toCharArray())
            sb.append(c == '0' ? '1' : '0');

        return sb.toString();

        // You can also do this
        // return s.replace('0', '2')
        //     .replace('1', '0')
        //     .replace('2', '1');
    }
}