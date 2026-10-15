#define OFFSET 200

long long dp[20][400][2][2];
int used[20][400][2][2];
char num[20];
int len;


long long dfs(int pos, int diff, int started, int tight);
long long solve(long long x);

long long countBalanced(long long low, long long high) {
    return solve(high) - solve(low - 1);
}

long long dfs(int pos, int diff, int started, int tight) {
    if (pos == len) {
        return (started && diff == 0) ? 1 : 0;
    }

    if (used[pos][diff + OFFSET][started][tight])
        return dp[pos][diff + OFFSET][started][tight];

    used[pos][diff + OFFSET][started][tight] = 1;
    long long res = 0;

    int limit = tight ? num[pos] - '0' : 9;

    for (int d = 0; d <= limit; d++) {
        int nextStarted = started || (d != 0);
        int nextTight = (tight && d == limit);
        int nextDiff = diff;

        if (nextStarted) {
            int position = pos + 1;
            if (position % 2 == 1)
                nextDiff += d;
            else
                nextDiff -= d;
        }

        res += dfs(pos + 1, nextDiff, nextStarted, nextTight);
    }

    dp[pos][diff + OFFSET][started][tight] = res;
    return res;
}

long long solve(long long x) {
    if (x < 10) return 0;

    sprintf(num, "%lld", x);
    len = strlen(num);

    memset(used, 0, sizeof(used));
    return dfs(0, 0, 0, 1);
}