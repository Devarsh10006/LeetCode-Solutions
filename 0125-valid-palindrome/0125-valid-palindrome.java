class Solution {
    public boolean isPalindrome(String s) {
        
        // int left = 0;
        // int right = s.length() - 1;

        // while (left < right) {

        //     if (!Character
        //         .isLetterOrDigit(
        //             s.charAt(left)
        //         )
        //     ){
        //         left++;
        //         continue;
        //     }

        //     if (!Character
        //         .isLetterOrDigit(
        //             s.charAt(right)
        //         )
        //     ){
        //         right--;
        //         continue;
        //     }

        //     if (Character.toLowerCase(s.charAt(left)) !=
        //         Character.toLowerCase(s.charAt(right))
        //     ) { return false; }

        //     left++;
        //     right--;
        // }

        // return true;

        StringBuilder str = new StringBuilder();

        for (char ch : s.toCharArray())
        {
            if (Character.isLetterOrDigit(ch))
                str.append(
                    Character.toLowerCase(ch)
                )
            ;
        }

        String original = str.toString();
        String reverse = str.reverse().toString();

        return original.equals(reverse);
    }
}