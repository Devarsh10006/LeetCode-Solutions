class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        int n = arr.length;
        int ans = 0;

        // for(int i = 0; i < n; i++)
        // {
        //     ans += arr[i] * ((i+1)*(n-i)+1)/2;
        // }

        for (int i = 0; i < n; i++) 
        {
            for (int j = i; j < n; j += 2) 
            {
                for (int k = i; k <= j; k++) ans += arr[k];
            }
        }

        return ans;
    }
}