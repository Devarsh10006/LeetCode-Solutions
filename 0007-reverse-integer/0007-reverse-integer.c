int reverse(int x){
    
    // int sign = (x < 0) ? -1 : 1;
    // x = abs(x);

    // long rev = 0;
    // while (x != 0)
    // {
    //     int rem = x % 10;
    //     rev = rev * 10 + rem;

    //     if (rev > INT_MAX) { return 0; }

    //     x /= 10;
    // }

    // return rev * sign;
    long num = x;   // int → long
    long rev = 0;

    while (num != 0) {
        rev = rev * 10 + (num % 10);
        num /= 10;
    }

    if (rev > INT_MAX || rev < INT_MIN)
        return 0;

    return (int)rev;

}