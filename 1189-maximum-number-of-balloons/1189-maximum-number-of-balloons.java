class Solution {
    public int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch == 'b')
                b++;
            else if (ch == 'a')
                a++;
            else if (ch == 'l') 
                l++;
            else if (ch == 'o') 
                o++;
            else if (ch == 'n')
                n++;
        }

        l = l / 2; // 1 ballon mate 2 'l' ni jaroor pade
        o = o / 2; // same...


        int result = Math.min(b, a);

        result = Math.min(result, l);
        result = Math.min(result, o);
        result = Math.min(result, n);

        return result;
    }
}