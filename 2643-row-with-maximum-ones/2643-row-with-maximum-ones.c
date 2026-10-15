/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* rowAndMaximumOnes(int** mat, int matSize, int* matColSize, int* returnSize) {
    
    int max1s = 0, rowi = 0;

    for(int i = 0; i < matSize; i++)
    {
        int count = 0;

        for(int j = 0; j < matColSize[i]; j++)
        {
            if(mat[i][j]) { count++; }
        }

        if(count > max1s)
        {
            max1s = count;
            rowi = i;
        }
    }

    
    int* result = (int*)malloc(2 * sizeof(int));
    result[0] = rowi;
    result[1] = max1s;

    *returnSize = 2;
    return result;
}