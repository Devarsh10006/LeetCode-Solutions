long long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {

    // long long ans = (long long)need1*cost1 + (long long)need2*cost2;
    // int maxBoth = need1 > need2 ? need1 : need2;

    // for (int both = 0; both <= maxBoth; both++) {
    //     long long rem1 = need1 - both;
    //     if (rem1 < 0) rem1 = 0;
    //     long long rem2 = need2 - both;
    //     if (rem2 < 0) rem2 = 0;

    //     long long cost = (long long)both*costBoth + rem1*cost1 + rem2*cost2;
    //     if (cost < ans) ans = cost;
    // }

    // return ans;


    if (need1 == 0 && need2 == 0) return 0;

    long long left = 0;
    long long right = (need1 > need2 ? need1 : need2) + 100; // khali upper bound jjjjjj
    long long ans = (long long)need1*cost1 + (long long)need2*cost2;

    while (left <= right) {
        long long mid = (left + right) / 2;
        long long rem1 = need1 - mid;
        long long rem2 = need2 - mid;
        if (rem1 < 0) rem1 = 0;
        if (rem2 < 0) rem2 = 0;

        long long cost_mid = mid*(long long)costBoth + rem1*cost1 + rem2*cost2;
        long long cost_mid_plus = (mid+1)*(long long)costBoth + 
                                  (need1 - (mid+1) > 0 ? (need1-(mid+1)) : 0)*cost1 +
                                  (need2 - (mid+1) > 0 ? (need2-(mid+1)) : 0)*cost2;

        if (cost_mid <= cost_mid_plus) {
            if (cost_mid < ans) ans = cost_mid;
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }

    return ans;
}