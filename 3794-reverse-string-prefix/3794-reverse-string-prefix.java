class Solution {
    public String reversePrefix(String s, int k) {

        if(k == 1) return s;
        
        StringBuilder sb = new StringBuilder(s.substring(0, k));
        sb.reverse();
        sb.append(s.substring(k));
        
        return sb.toString();
    }
}