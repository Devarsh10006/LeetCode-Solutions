class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> ans = new ArrayList<>();

        for(int[] arr : intervals)
        {
            if (ans.isEmpty()) { ans.add(arr); }

            else if(ans.get(ans.size() - 1)[1] >= arr[0])
            {
                int[] last = ans.get(ans.size() - 1);

                last[1] = Math.max(last[1], arr[1]);
            }

            else ans.add(arr);
        }

        return ans.toArray(
            new int[
                ans.size()
            ][]
        );
    }
}