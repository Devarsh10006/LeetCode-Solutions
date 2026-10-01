class Solution {
    public boolean isValid(String s) {
        
        int len = s.length();
        Stack<Character> brackets = new Stack<>();

        for(int i = 0; i < len; i++)
        {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '[')
                brackets.push(ch);
            else{
                if (brackets.isEmpty())
                    return false;
                
                char top = brackets.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return brackets.isEmpty();
    }
}