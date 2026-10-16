class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int MOD = 1000000007;
        int n = s.length();
        int qn = queries.length;

        int[] cnt = new int[n + 1];

        int[] digit = new int[n];
        int k = 0;

        for (int i = 0; i < n; i++) 
        {
            cnt[i + 1] = cnt[i];
            int d = s.charAt(i) - '0';

            if (d != 0) 
            {
                digit[k++] = d;
                cnt[i + 1]++;
            }
        }

        long[] pow10 = new long[k + 1];
        long[] prefNum = new long[k + 1];
        int[] prefSum = new int[k + 1];

        pow10[0] = 1;
        for (int i = 1; i <= k; i++)
            pow10[i] = (pow10[i - 1] * 10) % MOD;


        for (int i = 0; i < k; i++) 
        {
            prefNum[i + 1] = (prefNum[i] * 10 + digit[i]) % MOD;
            prefSum[i + 1] = prefSum[i] + digit[i];
        }

        int[] ans = new int[qn];

        for (int i = 0; i < qn; i++) 
        {
            int l = queries[i][0];
            int r = queries[i][1];

            int left = cnt[l];
            int right = cnt[r + 1];

            if (left == right) 
            {
                ans[i] = 0;
                continue;
            }

            int len = right - left;

            long x = (prefNum[right] - prefNum[left] * pow10[len]) % MOD;

            if (x < 0) { x += MOD; }

            int sum = prefSum[right] - prefSum[left];

            ans[i] = (int)(x * sum % MOD);
        }

        return ans;
    }
}