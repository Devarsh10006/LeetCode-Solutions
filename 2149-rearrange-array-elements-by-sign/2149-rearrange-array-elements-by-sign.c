/**
 * Note: The returned array must be malloced, assume caller calls free().
*/
int* rearrangeArray(int* nums, int numsSize, int* returnSize) {
    
    int* result = (int*)malloc(numsSize * sizeof(int));
    int p = 0, m = 1;
    
    for(int i = 0; i < numsSize; i++)
    {
        if(nums[i] > 0)
        {
            result[p] = nums[i];
            p += 2;
        }
        else{
            result[m] = nums[i];
            m += 2;
        }
    }

    *returnSize = numsSize;
    return result;
}