class Solution {
    public int smallestNumber(int n, int t) {
        
        int i = n;
        while(true) 
        { 
            if(product(i) % t == 0) return i;
            i++; 
        }
    }

    private int product(int i) {

        int prod = 1;
        while(i != 0)
        {
            prod *= i % 10;
            i /= 10;
        }

        return prod;
    }
}