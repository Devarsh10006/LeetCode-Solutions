class Solution {
    public int countPrimes(int n) {
        
        if(n <= 2) return 0;

        // int ans = 1;
        // for(int i = 3; i < n; i++)
        // {
        //     if(isPrime(i))
        //         ans++;
        // }

        // return ans;......................TLE


        // Alternative

        boolean[] isPrime = new boolean[n];

        for(int i = 2; i < n; i++)
            isPrime[i] = true;

        for(int i = 2; (int)Math.pow(i, 2) < n; i++)
        {
            // starting ma badha ne true kar didha pan,
            // j vali loop ne lidhe false thai gya hase etle check karvu pade.
            if(isPrime[i])
            {
                // Aa loop nu kaam i na multiple ne mark karvanu chhe
                // j nu increment evi  kaik rite thai chhe k 
                // Dar vakhte i nu aaglu multiple...
                for(int j = (int)Math.pow(i, 2); j < n; j += i)
                    isPrime[j] = false;
            }
        }

        int ans = 0;
        for(int i = 2; i < n; i++)
            if(isPrime[i]) ans++;

        return ans;
    }

    // private boolean isPrime(int num)
    // {
    //     for(int i = 2; i * i <= num; i++)
    //     {
    //         if(num % i == 0)
    //             return false;
    //     }

    //     return true;
    // }
}