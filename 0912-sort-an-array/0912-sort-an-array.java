class Solution {
    public int[] sortArray(int[] nums) {
        
        int n = nums.length;
        heapSort(nums, n);

        return nums;
    }

    private void heapSort(int[] nums, int n)
    {
        // Max heap thi Accending order ma male etle...

        // Max heap (parent > child) banavse aa loop.
        // Leaves ne heapify karvani jaroor nathi etle sidha last parent node thi j start kayru
        // n/2 - 1, E parent node aapse...
        for(int i = n / 2 - 1; i >= 0; i--)
            heapify(nums, n, i);

        // Have root par largest ele. aavi gyo haise,
        // Etlle ene have last unsorted position par mokli devanu kaam aa loop kare
        for(int i = n - 1; i > 0; i--)
        {
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;
            
            // Swap kayra pachhhi again heap priority tuti gai hoi,
            // Etle again tree ne heapify karvu pade by written bellow...
            heapify(nums, i, 0);
        }
    }

    private void heapify(int[] nums, int n, int i)
    {
        // Current node largest chhe evu assume karine chaalvi to...
        int largest = i;

        int left = 2 * i + 1; // Array ma left child ni index aa hoi;
        int right = 2 * i + 2; // & Right child mate aa...

        // Agar left child exist kare chhe
        if((left < n) && 
            (nums[left] > nums[largest]) // parent thi moto chhe 
        ) largest = left;
        // To largest update thahe...

        // Same right maatey
        if((right < n) &&
            (nums[right] > nums[largest])
        ) largest = right;

        
        // Agar largest sauthi moto chhe
        // Mtlb pareent already moto chhe
        // Mtlb heap priority satisfied chhe
        if(largest != i)
        {
            int temp = nums[i];
            nums[i] = nums[largest];
            nums[largest] = temp;

            heapify(nums, n, largest);
        }
    }
}