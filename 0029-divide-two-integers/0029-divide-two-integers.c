int divide(int dividend, int divisor) {

    if (dividend == INT_MIN && divisor == -1) { return INT_MAX; }
    
    int negative = (dividend < 0) != (divisor < 0);

    long long dvd = llabs((long long)dividend);
    long long dvr = llabs((long long)divisor);

    long long count = 0;

    // while(dvd >= dvr)
    // {
    //     dvd -= dvr;
    //     count++;
    // }

    while (dvd >= dvr) {
        long long temp = dvr;
        long long multiple = 1;

        while ((temp << 1) <= dvd) {
            temp <<= 1;
            multiple <<= 1;
        }

        dvd -= temp;
        count += multiple;
    }

    return negative ? -count : count;
}