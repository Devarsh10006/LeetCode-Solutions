class Solution {
    public int maximumTastiness(int[] price, int k) {
        
        Arrays.sort(price);

        int l = 0, 
            r = price[price.length - 1] - price[0]
        ;

        while(l < r)
        {
            int mid = l + (r - l + 1) / 2,
                count = 1, 
                prev = price[0]
            ;

            for (int p : price) 
            {
                if (p - prev >= mid) 
                {
                    count++;
                    prev = p;
                }
            }

            if (count >= k) l = mid;
            else r = mid - 1;
        }

        return l;
    }
}