class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < numRows; i++)
        {
            List<Integer> row = new ArrayList<>();

            for(int j = 0; j <= i; j++)
            {
                if(j == 0 ||
                   j == i
                ) row.add(1);

                else{

                    // List of previous row
                    List<Integer> temp = ans.get(i - 1);
                    int left = temp.get(j - 1);
                    int right = temp.get(j);

                    row.add((left + right));
                }
            }

            ans.add(row);
        }

        return ans;
    }
}