class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        List<Integer> ans = new ArrayList<>();
        int lowCount = countDigit(low);
        int highCount = countDigit(high);

        for(int i = initiate(lowCount); i <= high;) 
        {
            if (i >= low) { ans.add(i); }
            
            int next = i + genOne(i);
            if(i % 10 == 9)
            {
                if(countDigit(i) == 9) break;
                next = initiate(countDigit(i) + 1);

            } i = next;
        }

        return ans;
    }

    private int countDigit(int num) {

        int cnt = 0;
        while(num != 0)
        {
            num /= 10;
            cnt++;
        } 
        
        return cnt;
    }

    private int initiate(int lowCount) {

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= lowCount; i++) { sb.append(i); }

        return Integer.parseInt(sb.toString());
    }

    private int genOne(int n) {

        int ones = 0;
        while (n > 0) 
        {
            ones = ones * 10 + 1;
            n /= 10;
        }
        
        return ones;
    }
}