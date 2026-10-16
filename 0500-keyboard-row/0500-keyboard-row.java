class Solution {
    public String[] findWords(String[] words) {
        
        List<String> ans = new ArrayList<>();

        for(String word : words)
        {
            int row = getRow(word.charAt(0));
            boolean isOk = true;

            for(char ch : word.toCharArray())
            {
                if(getRow(ch) != row)
                {
                    isOk = false;
                    break;
                }
            }

            if(isOk) { ans.add(word); }
        }

        return ans.toArray(
            new String[ans.size()]
        ); // new String[0] b chaalet...
    }

    private int getRow(char ch) {

        switch(Character.toLowerCase(ch))
        {
            case 'q': case 'w': case 'e': case 'r': case 't':
            case 'y': case 'u': case 'i': case 'o': case 'p':
                return 1;

            case 'a': case 's': case 'd': case 'f': case 'g':
            case 'h': case 'j': case 'k': case 'l':
                return 2;

            default: 
                return 3;
        }
    }
}