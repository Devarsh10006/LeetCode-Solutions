class Solution {
    public int maxProduct(int n) {
        
        int a = 0, b = 0;
        for(; n > 0; n /= 10)
        {
            int rem = n % 10;

            if(rem > a) { b = a; a = rem; }
            else if(rem > b) { b = rem; }
        }

        return a * b;
    }
}