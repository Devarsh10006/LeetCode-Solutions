class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        Arrays.sort(people);
        
        int ans = 0;
        for(int left = 0, right = people.length - 1;
            left <= right;
            right--, ans++

        ) { if(people[left] + people[right] <= limit) left++; }

        return ans;
    }
}