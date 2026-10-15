class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {

        int noOfApples = 0;
        for(int a : apple) { noOfApples += a; }

        Arrays.sort(capacity);

        int m = capacity.length;
        int boxCount = 0;
        for(int i = m - 1; i >= 0; i--)
        {
            noOfApples -= capacity[i];
            boxCount++;

            if(noOfApples <= 0) { break; }
        }

        return boxCount;
    }
}