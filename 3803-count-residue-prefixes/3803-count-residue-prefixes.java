class Solution {
    public int residuePrefixes(String s) {
        
        HashSet<Character> set = new HashSet<>();

        int ans = 0;
        for(int i = 0; 
            i < s.length() && set.size() < 3; 
            i++
        ){
            set.add(s.charAt(i));
            if(set.size() == (i + 1) % 3) { ans++; }
        }
        
        return ans;
    }
}