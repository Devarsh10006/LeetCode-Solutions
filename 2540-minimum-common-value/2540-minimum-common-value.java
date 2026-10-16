class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        
        int m = nums1.length;
        int n = nums2.length;

        for(int i = 0; i < m; i++)
        {
            int low = 0;
            int high = n - 1;

            while(low <= high)
            {
                int mid = low + (high - low) / 2;

                if(nums2[mid] == nums1[i]) return nums1[i];
                else if(nums2[mid] < nums1[i]) low = mid + 1;
                else high = mid - 1;
            }
        }

        return -1;
    }
}