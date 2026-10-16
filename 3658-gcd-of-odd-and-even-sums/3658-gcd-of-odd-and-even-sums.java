class Solution {
    public int gcdOfOddEvenSums(int n) {
       
       int evenSum = n * (n + 1);
       int oddSum = n * n;
       
       return gcdOfOddEvenSums(evenSum, oddSum);
    }
    
    private int gcdOfOddEvenSums(int es, int os){
        
        if(os == 0) return es;
        return gcdOfOddEvenSums(os, es % os);
    }
}