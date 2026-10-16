class Solution {
    public int[] separateDigits(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        for (int n : nums) 
        {
            String str = "" + n;
            for (char ch : str.toCharArray())
                list.add(ch - '0')
            ;
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++)
            ans[i] = list.get(i)
        ;

        return ans;

        // return list
        //     .stream()
        //     .mapToInt(i -> i)
        //     .toArray()
        // ;
    }
}