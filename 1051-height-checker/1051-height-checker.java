class Solution {
    public int heightChecker(int[] heights) {
        
        int len = heights.length;
        // int[] expected = new int[len];

        // for(int i = 0; i < len; i++)
        //     expected[i] = heights[i];

        // for(int i = 0; i < len - 1; i++)
        // {
        //     for(int j = 0; j < len - i - 1; j++)
        //     {
        //         if (expected[j] > expected[j + 1]) {
        //             int temp = expected[j];
        //             expected[j] = expected[j + 1];
        //             expected[j + 1] = temp;
        //         }
        //     }
        // }

        // int count = 0;
        // for(int i = 0; i < len; i++)
        // {
        //     if(heights[i] != expected[i])
        //         count++;
        // }

        // return count;


        int[] freq = new int[101];

        for (int h : heights) {
            freq[h]++;
        }

        int count = 0;
        int index = 0;

        for (int h = 1; h <= 100; h++) {
            while (freq[h]-- > 0) {
                if (heights[index] != h)
                    count++;
                index++;
            }
        }

        return count;
    }
}