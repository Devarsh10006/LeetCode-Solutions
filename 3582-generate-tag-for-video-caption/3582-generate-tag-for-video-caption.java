class Solution {
    public String generateTag(String caption) {
        
        String[] words = caption.trim().split("\\s+");

        StringBuilder sb = new StringBuilder("#");

        for(int i = 0; i < words.length; i++)
        {
            String word = words[i].toLowerCase();

            if(i == 0) sb.append(word);
            else {
                sb.append(
                    Character.toUpperCase(
                        word.charAt(0)
                    )
                );
                sb.append(
                    word.substring(1)
                );
            }
            if(sb.length() >= 100) break;
        }

        return sb.substring(
            0,
            Math.min(
                100,
                sb.length()
            )
        );
    }
}