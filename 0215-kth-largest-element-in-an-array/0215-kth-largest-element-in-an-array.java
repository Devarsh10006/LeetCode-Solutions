class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        int[] count = new int[20001];

        for (int num : nums) { count[num + 10000]++; }

        int cnt = 0;
        for (int i = 20000; i >= 0; i--) 
        {
            cnt += count[i];
            if (cnt >= k) { return i - 10000; }
        }

        return -1;
    }
}