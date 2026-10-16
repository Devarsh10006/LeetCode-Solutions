class Solution {

    // private int countOnes(int[] arr, int ele)
    // {
    //     String binary = Integer.toBinaryString(arr[ele]);

    //     int countOne = 0;
    //     for(int i = 0; i < binary.length(); i++)
    //         if(binary.charAt(i) == '1') countOne++;

    //     return countOne;
    // }
    
    public int[] sortByBits(int[] arr) {
        
        // int n = arr.length;

        // int[] temp = new int[n];
        // for(int i = 0; i < n; i++)
        //     temp[i] = countOnes(arr, i);

        // for(int i = 0; i < n - 1; i++)
        // {
        //     for(int j = i + 1; j < n; j++)
        //     {
        //         if(temp[i] > temp[j] ||
        //             (temp[i] == temp[j] && arr[i] > arr[j]))
        //         {
        //             int t = temp[i];
        //             temp[i] = temp[j];
        //             temp[j] = t;

        //             int a = arr[i];
        //             arr[i] = arr[j];
        //             arr[j] = a;
        //         }
        //     }
        // }


        //---------------------Meethod-2--------------------------------
        // Integer[] nums = new Integer[arr.length];

        //     // Convert int[] to Integer[]
        //     for(int i = 0; i < arr.length; i++) {
        //         nums[i] = arr[i];
        //     }

        //     Arrays.sort(nums, (a, b) -> {
        //         int bitA = Integer.bitCount(a);
        //         int bitB = Integer.bitCount(b);

        //         if(bitA == bitB)
        //             return a - b;   // ascending order
        //         else
        //             return bitA - bitB;  // sort by bit count
        //     });

        //     // Convert back to int[]
        //     for(int i = 0; i < arr.length; i++) {
        //         arr[i] = nums[i];
        //     }


        // return arr;

        //---------------------------Method-3----------------------------
        return Arrays.stream(arr)
            .boxed()
            .sorted((a, b) -> 
                Integer.bitCount(a) == Integer.bitCount(b)
                ? a - b
                : Integer.bitCount(a) - Integer.bitCount(b))
            .mapToInt(i -> i)
            .toArray();
    }
}