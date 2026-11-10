class Solution {
    public long taskSchedulerII(int[] tasks, int space) {
        
        HashMap<Integer, Long> map = new HashMap<>();
        long ans = 0;

        for(int task : tasks)
        {
            ans++;
            if (map.containsKey(task)) 
            {
                long nextDay = map.get(task) + space + 1;
                ans = Math.max(ans, nextDay);
            }
            map.put(task, ans);
        }

        return ans;
    }
}