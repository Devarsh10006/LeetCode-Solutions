class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int len = nums.length;
        int count = 0;
        int temp = 0;

        for(int num : nums)
        {
            if(num == 1)
                count++;
            else{
                if(count < temp){
                    count = 0;
                    continue;
                } 
                else{
                    temp = count;
                    count = 0;
                }
            }
        }

        if (count > temp)
            temp = count;

        return temp;
    }
}