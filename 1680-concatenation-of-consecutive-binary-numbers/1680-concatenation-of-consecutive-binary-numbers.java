import java.math.BigInteger;
class Solution {
    public int concatenatedBinary(int n) {
        
        // StringBuilder str = new StringBuilder();
        // for(int i = 1; i <= n; i++)
        // {
        //     String binary = Integer.toBinaryString(i);
        //     str.append(binary);
        // }

        // BigInteger bigNum = new BigInteger(str.toString(), 2);
        // BigInteger mod = new BigInteger("1000000007");

        // return bigNum.mod(mod).intValue();


        int MOD = 1000000007;
        long result = 0;
        int len = 0;

        for(int i = 1; i <= n; i++)
        {
            if((i & (i - 1)) == 0) len++;

            result = ((result << len) + i) % MOD;
        }

        return (int)result;
    }
}