class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        int n = nums.length;
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) { arr[nums[i] - 1]++; }

        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i < n; i++)
        {
            if(arr[i] == 2) ans.add(i + 1);
        }

        return ans;
    }
}