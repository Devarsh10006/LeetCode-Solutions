#include<string.h>

int lengthOfLongestSubstring(char* s) {

    int maxLength = 0;
    // for (int i = 0; s[i] != '\0'; i++) 
    // {
    //     freq[(unsigned char)s[i]]++;
    // }

    // for (int i = 0; i < 256; i++) 
    // {
    //     length++;
    //     if (freq[i] > 1) {
    //         // dublicate char will give
    //     }               
    // }
    
    for(int i = 0; i < strlen(s); i++)
    {
        char temp[256] = {0};
        int length = 0;

        for(int j = i; j < strlen(s); j++)
        {
            if (temp[(unsigned char)s[j]] == 0) {
                temp[(unsigned char)s[j]] = 1;
                length++;
            } else break;
        }
        if (length > maxLength) maxLength = length;
    }

    return maxLength;
}