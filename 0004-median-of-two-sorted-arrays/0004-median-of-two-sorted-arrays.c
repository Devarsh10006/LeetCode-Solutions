double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int total = nums1Size + nums2Size;
    int res[total];

    int i = 0, j = 0, k = 0;

    while (i < nums1Size && j < nums2Size){
        if(nums1[i] < nums2[j]) { res[k++] = nums1[i++]; }
        else { res[k++] = nums2[j++]; }
    }

    while (i < nums1Size) { res[k++] = nums1[i++]; }
    while (j < nums2Size) { res[k++] = nums2[j++]; }

    if(total % 2 != 0)
    {
        return res[total / 2];
    }
    else{
        return (res[total / 2 - 1] + res[total / 2]) / 2.0;
    }
}