class Solution {
    public int earliestTime(int[][] tasks) {

        int len = tasks.length;
        int minFinishTime = Integer.MAX_VALUE;
        for(int i = 0; i < len; i++)
        {
            int start = tasks[i][0];
            int time = tasks[i][1];

            int finishTime = start + time;
            minFinishTime = Math.min(minFinishTime, finishTime);
        }

        return minFinishTime;
    }
}