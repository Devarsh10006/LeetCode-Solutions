class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> 
        {
            if (a[0] == b[0])
                return b[1] - a[1];   // end vala ele descending order ma..

            return a[0] - b[0];       // start vala ascending order ma...
        });

        int ans = 0, maxEnd = -1;
        for(int[] interval : intervals)
        {
            if (interval[1] > maxEnd) // Cover no thai to ni vaat chhe...
            {
                ans++;
                maxEnd = interval[1];
            }
        } 

        return ans;
    }
}