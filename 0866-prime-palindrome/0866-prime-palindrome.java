class Solution {
    public int primePalindrome(int n) {

        if (n <= 2) return 2;
        if (n <= 3) return 3;
        if (n <= 5) return 5;
        if (n <= 7) return 7;
        if (n <= 11) return 11;

        int i = n;

        while (true) 
        { 
            i = nextPalindrome(i); 
            if (isPrime(i)) return i;
            i++; 
        }
    }

    private int nextPalindrome(int n) {

        String s = String.valueOf(n);
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) 
        {
            arr[right] = arr[left];
            left++;
            right--;
        }

        int palindrome = Integer.parseInt(new String(arr));

        if (palindrome <= n) 
        {
            int mid = (arr.length - 1) / 2;

            while (mid >= 0 && arr[mid] == '9') 
            {
                arr[mid] = '0';
                mid--;
            }

            if (mid >= 0) { arr[mid]++; }

            left = 0;
            right = arr.length - 1;

            while (left < right)
            {
                arr[right] = arr[left];
                left++;
                right--;
            }

            palindrome = Integer.parseInt(new String(arr));
        }

        return palindrome;
    }

    private boolean isPrime(int i) {

        if (i < 2) return false;
        if (i == 2) return true;
        if (i % 2 == 0) return false;

        for (int t = 3; t * t <= i; t += 2) 
        {
            if (i % t == 0) return false;
        }

        return true;
    }

    private boolean isPalindrome(int i) {

        int temp = i;
        int rev = 0;

        while (temp != 0) 
        {
            int rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }

        return rev == i;
    }
}