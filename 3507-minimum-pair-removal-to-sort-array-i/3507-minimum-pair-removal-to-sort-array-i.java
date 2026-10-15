class Solution {
    public int minimumPairRemoval(int[] nums) {
        
        ArrayList<Integer> temp = new ArrayList<>();
        for (int x : nums) temp.add(x);
        int operations = 0;

        while(!isSoarted(temp))
        {
            int min = Integer.MAX_VALUE;
            int idx = 0;

            for(int i = 0; i < temp.size() - 1; i++)
            {
                int sum = temp.get(i) + temp.get(i + 1);
                if(sum < min)
                {
                    min = sum;
                    idx = i;
                }
            }

            temp.remove(idx);
            temp.set(idx, min);

            operations++;
        }

        return operations;
    }

    private boolean isSoarted(List<Integer> temp)
    {
        for(int i = 1; i < temp.size(); i++)
        {
            if(temp.get(i) < temp.get(i - 1))
                return false;
        }

        return true;   
    }
}