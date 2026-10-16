// class Solution {
//     public int countDigitOne(int n) {
        
//         if(n == 0) return 0;
//         if(n < 10) return 1;

//         long ans = minOne(n);

//         for(long rng = range(n); n > 100; n -= range(n)) { ans += getOne(rng); }

//         return (int)(ans + getOne(n));
//     }

//     private long minOne(long n) {

//         if (n >= 10 && n <= 99) return 1;
//         else if (n >= 100 && n <= 999) return 19;
//         else if (n >= 1000 && n <= 9999) return 219;
//         else if (n >= 10000 && n <= 99999) return 3219;
//         else if (n >= 100000 && n <= 999999) return 43219;
//         else if (n >= 1000000 && n <= 9999999) return 543219;
//         else if (n >= 10000000 && n <= 99999999) return 6543219;
//         else if (n >= 100000000 && n <= 999999999) return 76543219;
//         return 900000001;
//     }

//     private long range(long n) {

//         if (n >= 10 && n <= 99) return 10;
//         else if (n >= 100 && n <= 999) return 100;
//         else if (n >= 1000 && n <= 9999) return 1000;
//         else if (n >= 10000 && n <= 99999) return 10000;
//         else if (n >= 100000 && n <= 999999) return 100000;
//         else if (n >= 1000000 && n <= 9999999) return 1000000;
//         else if (n >= 10000000 && n <= 99999999) return 10000000;
//         else if (n >= 100000000 && n <= 999999999) return 100000000;
//         return 900000001;
//     }

//     private long getOne(long n) {

//         long ones = 0;
//         while(n != 0)
//         {
//             ones += (n % 10 == 1) ? 1 : 0;
//             n /= 10;
//         }

//         return ones;
//     }
// }



class Solution {
    public int countDigitOne(int n) {
        if (n == 0) return 0;
        if (n < 10) return 1;

        long ans = 0;
        
        while(n >= 10) 
        {
            long rng = range(n);
            long firstDigit = n / rng;
            
            ans += firstDigit * minOne(rng);
            
            if (firstDigit > 1) { ans += rng; } 

            else if (firstDigit == 1) { ans += (n % rng) + 1;  }
            
            n %= rng;
        }
        if (n >= 1) { ans += 1; }

        return (int) ans;
    }

    private long minOne(long rng) {

        if (rng == 10) return 1;
        else if (rng == 100) return 20;
        else if (rng == 1000) return 300;
        else if (rng == 10000) return 4000;
        else if (rng == 100000) return 50000;
        else if (rng == 1000000) return 600000;
        else if (rng == 10000000) return 7000000;
        else if (rng == 100000000) return 80000000;
        else if (rng == 1000000000) return 900000000;
        return 0;
    }

    private long range(long n) {

        if (n >= 10 && n <= 99) return 10;
        else if (n >= 100 && n <= 999) return 100;
        else if (n >= 1000 && n <= 9999) return 1000;
        else if (n >= 10000 && n <= 99999) return 10000;
        else if (n >= 100000 && n <= 999999) return 100000;
        else if (n >= 1000000 && n <= 9999999) return 1000000;
        else if (n >= 10000000 && n <= 99999999) return 10000000;
        else if (n >= 100000000 && n <= 999999999) return 100000000;
        return 1000000000;
    }
}
