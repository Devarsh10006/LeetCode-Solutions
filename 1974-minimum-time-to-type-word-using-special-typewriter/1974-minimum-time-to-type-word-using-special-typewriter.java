class Solution {
    public int minTimeToType(String word) {
        
        char now = 'a';
        int time = 0;

        for (char ch : word.toCharArray())
        {
            int diff = Math.abs(ch - now);
            time += Math.min(diff, 26 - diff) + 1;
            now =  ch;
        }

        return time;
    }
}