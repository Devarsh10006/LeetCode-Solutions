class Solution {
    public int compress(char[] chars) {

        List<Character> li = new ArrayList<>();

        int n = chars.length;
        char ch = chars[0];
        int cnt = 1;

        for (int i = 0; i < n - 1; i++) 
        {
            if (chars[i] != chars[i + 1]) 
            {
                li.add(ch);
                if (cnt > 1) 
                {
                    String str = String.valueOf(cnt);

                    for (int j = 0; j < str.length(); j++)
                        li.add(str.charAt(j));
                }

                ch = chars[i + 1];
                cnt = 1;

            } else cnt++;
        }

        li.add(ch);

        if (cnt > 1) 
        {
            String str = String.valueOf(cnt);

            for (int j = 0; j < str.length(); j++) {
                li.add(str.charAt(j));
            }
        }
        for (int i = 0; i < li.size(); i++) { chars[i] = li.get(i); }

        return li.size();
    }
}