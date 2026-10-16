class Solution {
    public int fib(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;
        int first = 0, next = 1, save = 0;

        while (--n > 0)
        {
            save = first + next;
            first = next;
            next = save;
        }

        return save;
    }
}