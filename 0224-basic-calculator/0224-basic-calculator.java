class Solution {
    public int calculate(String s) {
        
        Stack<Integer> stack = new Stack<>();

        int ans = 0, num = 0, sign = 1;
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);

            if (Character.isDigit(ch))
                num = num * 10 + ch - '0'
            ;

            else if (ch == '+' || ch == '-') 
            {
                ans += sign * num;
                num = 0;
                sign = (ch == '+') ? 1 : -1;
            }

            else if (ch == '(') 
            {
                stack.push(ans);
                stack.push(sign);

                ans = 0;
                sign = 1;
            }

            else if (ch == ')') 
            {
                ans += sign * num;
                num = 0;

                int oldSign = stack.pop();

                int oldResult = stack.pop();

                ans = oldResult + oldSign * ans;
                sign = 1;

            }
        } ans += sign * num;

        return ans;
    }
}